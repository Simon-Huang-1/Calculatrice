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
public class NumericalActionListener implements ActionListener {
    
    public calculatrice calculatrice;
    
    /**
     *
     * @param aThis
     * Constructeur
     */
    public NumericalActionListener(calculatrice aThis) {
        super();
	calculatrice = aThis;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Méthodes évènements pour les boutons numériques 
    // qui utilise la méthode numericalButtonEvent, prenant en paramètre le numéro du bouton cliqué
    // On définit un string qui stocke le bouton numéro cliqué
    public void button0ActionPerformed(ActionEvent evt) {
        String cliquedNumericalButton="0";
        numericalButtonEvent(cliquedNumericalButton);
    }
    
    public void button1ActionPerformed(ActionEvent evt) {
        String cliquedNumericalButton="1";
        numericalButtonEvent(cliquedNumericalButton);
    }
    
    public void button2ActionPerformed(ActionEvent evt) {
        String cliquedNumericalButton="2";
        numericalButtonEvent(cliquedNumericalButton);
    }
    
    public void button3ActionPerformed(ActionEvent evt) {
        String cliquedNumericalButton="3";
        numericalButtonEvent(cliquedNumericalButton);
    }

    public void button4ActionPerformed(ActionEvent evt) {
        String cliquedNumericalButton="4";
        numericalButtonEvent(cliquedNumericalButton);
    }
   
    public void button5ActionPerformed(ActionEvent evt) {
        String cliquedNumericalButton="5";
        numericalButtonEvent(cliquedNumericalButton);
    }
    
    public void button6ActionPerformed(ActionEvent evt) {
        System.out.println("Bouton 6 ");
        String cliquedNumericalButton="6";
        numericalButtonEvent(cliquedNumericalButton);
    }
    
    public void button7ActionPerformed(ActionEvent evt) {
        String cliquedNumericalButton="7";
        numericalButtonEvent(cliquedNumericalButton);
    }
    public void button8ActionPerformed(ActionEvent evt) {
        String cliquedNumericalButton="8";
        numericalButtonEvent(cliquedNumericalButton);
    }
    
    public void button9ActionPerformed(ActionEvent evt) {
        String cliquedNumericalButton="9";
        numericalButtonEvent(cliquedNumericalButton);
    }
    
    //Evenement lorsque l'on appuie sur un bouton numérique, qui prend en paramètre le bouton cliqué
    public void numericalButtonEvent(String cliquedNumericalButton){
        String operand1=calculatrice.getOperand1();
        String operand2=calculatrice.getOperand2();
        String operator=calculatrice.getOperator();
        Boolean operand1Occupied=calculatrice.isOperand1Occupied();
        
        //Pour gérer ce qui se passe quand aucun bouton numérique a été cliqué
        // l'opérand1 a donc la valeur 0
        //On remplace la valeur et l'affichage par le bouton numérique cliqué
        //On ne change pas l'affichage si l'opérand affiché est le résultat issu du calcul précédent
        if (operand1=="0"&&(operand1Occupied==false)){
        calculatrice.getResult().setText(cliquedNumericalButton);
        calculatrice.setOperand1(cliquedNumericalButton);
        }
        //Si l'opérand1 n'est pas nul
        else if (operand1!="0"){
            if (operand1!=""){ //Si l'opérand1 est vide
                //Concaténation uniquement si on n'a pas effectué de calcul arithmétique (bouton enter qui a renvoyé un résultat)
                if (operator==""&&(operand1Occupied==false)) {//Si opérateur vide et operand1 non occupé-->concaténation
                    calculatrice.setOperand1(operand1+cliquedNumericalButton);
                    //Affichage de la concaténation
                    calculatrice.getResult().setText(calculatrice.getResult().getText()+cliquedNumericalButton);
                }
                else if(operator!=""){
                    calculatrice.setOperand2(operand2+cliquedNumericalButton);
                    //Affichage de la concaténation
                    calculatrice.getResult().setText(calculatrice.getResult().getText()+cliquedNumericalButton);
                }
            }
        }
        //Tests pour vérifier que les opérandes et opérateurs prennent bien les valeurs attendues
        System.out.println("L_opérateur est"+calculatrice.getOperator());
        System.out.println("L_opérand1 est "+calculatrice.getOperand1());
        System.out.println("L_opérand2 est "+calculatrice.getOperand2());
    }
    
}
