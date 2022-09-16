/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionListener;

import calculatrice.calculatrice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Simon
 */

public class OperationsActionListener implements ActionListener{
    public calculatrice calculatrice;
    
    //Constructeur
    public OperationsActionListener(calculatrice aThis) {
        super();
	calculatrice = aThis;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Retourne le résultat de l'opération entre 2 opérandes passés en paramètres 
    //suivant l'opérateur aussi passé en paramètre(+,-,*,/,%)
    public static double operationEnter(String operand1, String operand2, String operator) {
        double result=0;
        //Conversion des String opérandes en double
        double operandDouble1=Double.parseDouble(operand1);
        double operandDouble2=Double.parseDouble(operand2);
        
        //Opération suivant l'opérateur        
        if (null!=operator)switch (operator) {
            case "+":
                result=operandDouble1+operandDouble2;
                break;
            case "-":
                result=operandDouble1-operandDouble2;
                break;
            case "*":
                result=operandDouble1*operandDouble2;
                break;
            case "/":
                result=operandDouble1/operandDouble2;
                break;
            case "%":
                result=operandDouble1%operandDouble2;
                break;
            default:
                break;
        }
        return result;
    }
    
    //Evenement lorsque le bouton enter a été cliqué
    // qui calcule et affiche le résultat
    // réinitialise les résultats de telle sorte que l'on peut
    // continuer des calculs avec le résultat obtenu
    public void enterButtonActionPerformed(ActionEvent evt) {
        double result=0;
        String operand1=calculatrice.getOperand1();
        String operand2=calculatrice.getOperand2();
        String operator=calculatrice.getOperator();
        
        //On ne peut effectuer d'opération avec le bouton enter qu'une fois que 
        //  les opérandes et l'opérateur ne sont plus vides
        if (operator!="" && operand1!="" && operand2!="")
        {
            //Résultat du calcul arithmétique
            result=operationEnter(operand1, operand2, operator);
            
            //On affecte le résultat au premier opérand
            calculatrice.setOperand1(Double.toString(result));
            
            //On affecte le booléen true à operand1Occupied pour qu'on ne puisse pas concaténer des nombres au résultat
            //On attend ensuite un opérateur
            calculatrice.setOperand1Occupied(true);
            
            //On réinitialise les valeurs operand2 et operator
            calculatrice.setOperand2("");
            calculatrice.setOperator("");
            
            //Affichage du résultat sur l'écan de la calculatrice
            calculatrice.getResult().setText(Double.toString(result));
       }
        
    }
    
    //Pour toutes les méthodes évènements des boutons opérateurs(+,-,*,/%), 
    // On définit un string qui stocke le bouton opérateur cliqué
    // on fait appel à la méthode appelé operatorButtonEvent
    // Voir plus bas pour sa description
    public void addButtonActionPerformed(ActionEvent evt) {
        String cliquedOperatorButton="+";
        operatorButtonEvent(cliquedOperatorButton);
    }
    public void subButtonActionPerformed(ActionEvent evt) {
        String cliquedOperatorButton="-";
        operatorButtonEvent(cliquedOperatorButton);
            
    }
    public void multButtonActionPerformed(ActionEvent evt) {
        String cliquedOperatorButton="*";
        operatorButtonEvent(cliquedOperatorButton);
    }

    public void divButtonActionPerformed(ActionEvent evt) {
        String cliquedOperatorButton="/";
        operatorButtonEvent(cliquedOperatorButton);
    }

    public void modButtonActionPerformed(ActionEvent evt) {
        String cliquedOperatorButton="%";
        operatorButtonEvent(cliquedOperatorButton);
    }
    
    //Le bouton clear permet de réinitialiser toutes les valeurs, l'affichage
    //On revient dans la configuration initiale
    public void clearButtonActionPerformed(ActionEvent evt) {
        //On réinitialise les valeurs des opérands et de l'opérateur
        calculatrice.setOperand1("0");
        calculatrice.setOperand2("");
        calculatrice.setOperator("");
        calculatrice.setOperand1Occupied(false);
        
        //On réinitialise l'affichage à 0
        calculatrice.getResult().setText("0");
    }

    //Le bouton +/- permet de gérer les nombres négatifs
    public void negButtonActionPerformed(ActionEvent evt) {
        String operand1=calculatrice.getOperand1();
        String operand2=calculatrice.getOperand2();
        String operator=calculatrice.getOperator();
        Boolean operand1Occupied=calculatrice.isOperand1Occupied();
        
        //Si l'on n'a pas encore cliqué sur un opérateur (et donc on est toujours sur l'opérand1
        // et que l'on n'a pas encore réaliser de calculs
        if(operator=="" && (operand1Occupied==false)){
            //S'il y a  le signe "-" devant l'opérand1, on l'enlève
            if(operand1.substring(0,1).equals("-")){
                operand1=operand1.substring(1);
                calculatrice.getResult().setText(operand1);
                calculatrice.setOperand1(operand1);
            }
            //S'il n'y a pas le signe "-", on le rajoute devant l'opérand
            else{ 
                operand1="-"+operand1;
                calculatrice.getResult().setText(operand1);
                calculatrice.setOperand1(operand1);
            }
        }
        
        //Si l'on a cliqué sur un opérateur mais pas sur un bouton numérique pour le bouton2
        // On peut ajouter le signe "-" à droite de l'opérateur
        else if (operand2=="" &&operator!=""){
            operand2="-"+operand2;
            calculatrice.setOperand2(operand2);
            display(operand1,operand2,operator);
        }
        
        //Pour le cas où l'opérand2 n'est pas nul
        else if(operator!="")
        {
            //S'il n'y a pas le signe "-", on le rajoute devant l'opérand2
            if(operand2.substring(0,1).equals("-")==false ){
                operand2="-"+operand2;
                calculatrice.setOperand2(operand2);
                display(operand1,operand2,operator);
            }
            
            //S'il y a  le signe "-" devant l'opérand2, on l'enlève
            else{
                operand2=operand2.substring(1);
                calculatrice.setOperand2(operand2);
                display(operand1,operand2,operator);
            }
        }

    } 
    
    //Evenement lorsque l'on appuie sur un bouton opérateur,
    // qui prend en paramètre le bouton opérateur cliqué
    public void operatorButtonEvent(String cliquedOperatorButton){  
        //On récupère la valeur affiché sur l'écran
        String str = calculatrice.getResult().getText();
        if (calculatrice.getOperand2()==""){
            if(calculatrice.getOperator()==""){ //Si l'opérand2 et l'opérateur sont vides
                calculatrice.getResult().setText(str+cliquedOperatorButton); //On affiche l'opérateur
            }
            else{ //Si l'opérateur est non vide, et qu'on n'a pas appuyé sur un bouton numérique après l'opérateur
                //On peut encore changer l'opérateur 
                //On gère ici l'affichage uniquement
                calculatrice.getResult().setText(str.substring(0, str.length() -1)+cliquedOperatorButton);
            }
            //On ajoute la valeur de l'opérateur(bouton) à celle stockée dans la calculatrice
            calculatrice.setOperator(cliquedOperatorButton);
        }      
    }

    //Affichage de l'opération sur l'écran en prenant en paramètre les opérandes et l'opérateur
    public void display(String operand1, String operand2, String operator){
        calculatrice.getResult().setText(operand1+operator+operand2);
    }    
}
