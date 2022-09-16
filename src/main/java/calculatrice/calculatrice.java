package calculatrice;
import actionListener.NumericalActionListener;
import actionListener.OperationsActionListener;

import javax.swing.JButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simon
 */
//GUI: Interface graphique
public class calculatrice extends JFrame  {
    private NumericalActionListener numericalActionListener = new NumericalActionListener(this);
    private OperationsActionListener operationsActionListener= new OperationsActionListener(this);
    private String operand1="0"; //Stocke la valeur du 1er opérande
    private String operand2=""; //Stocke la valeur du 2e opérande
    private String operator=""; //Stocke la valeur de l'opérateur
    //Cette variable passera à true lorsque l'on cliquera sur le bouton enter
    // on ne pourra ainsi pas concaténer un chiffre à l'opérande1, dont on a affecté le résultat précédent
    private boolean operand1Occupied=false; 
    /**
     * Creates new form calculatrice
     */
    public calculatrice() {
        initComponents();
        
        //Initialisation des actionListener pour chaque boutons
        button0.addActionListener((ActionListener) numericalActionListener);
        button1.addActionListener((ActionListener) numericalActionListener);
        button2.addActionListener((ActionListener) numericalActionListener);
        button3.addActionListener((ActionListener) numericalActionListener);
        button4.addActionListener((ActionListener) numericalActionListener);
        button5.addActionListener((ActionListener) numericalActionListener);
        button6.addActionListener((ActionListener) numericalActionListener);
        button7.addActionListener((ActionListener) numericalActionListener);
        button8.addActionListener((ActionListener) numericalActionListener);
        button9.addActionListener((ActionListener) numericalActionListener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        result = new javax.swing.JTextField();
        button0 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        subButton = new javax.swing.JButton();
        multButton = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        modButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        negButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        result.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        result.setText("0");

        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        subButton.setText("-");
        subButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subButtonActionPerformed(evt);
            }
        });

        multButton.setText("X");
        multButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multButtonActionPerformed(evt);
            }
        });

        divButton.setText(":");
        divButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButtonActionPerformed(evt);
            }
        });

        modButton.setText("mod");
        modButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modButtonActionPerformed(evt);
            }
        });

        clearButton.setText("CE");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        negButton.setText("+/-");
        negButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(result, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(divButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(modButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(multButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(negButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, clearButton, divButton, enterButton, modButton, multButton, negButton, subButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(negButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button8)
                    .addComponent(button9)
                    .addComponent(button7)
                    .addComponent(divButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button5)
                    .addComponent(button6)
                    .addComponent(button4)
                    .addComponent(multButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button2)
                    .addComponent(button3)
                    .addComponent(button1)
                    .addComponent(subButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterButton)
                    .addComponent(button0)
                    .addComponent(clearButton)
                    .addComponent(addButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, clearButton, divButton, enterButton, modButton, multButton, negButton, subButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents
// La méthode évènement pour le bouton soustraction s'est retrouvé ici, je ne peux le déplacer :/
    private void subButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subButtonActionPerformed
        // TODO add your handling code here:
        getOperationsActionListener().subButtonActionPerformed(evt);
    }//GEN-LAST:event_subButtonActionPerformed
// Méthodes évènements pour les boutons numériques
// qui font appel aux méthodes dans la classe NumericalActionListener
    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        // TODO add your handling code here:
        getNumericalActionListener().button0ActionPerformed(evt);
    }//GEN-LAST:event_button0ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        getNumericalActionListener().button1ActionPerformed(evt);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        getNumericalActionListener().button2ActionPerformed(evt);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        getNumericalActionListener().button3ActionPerformed(evt);
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        getNumericalActionListener().button4ActionPerformed(evt);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        getNumericalActionListener().button5ActionPerformed(evt);
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        getNumericalActionListener().button6ActionPerformed(evt);
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        getNumericalActionListener().button7ActionPerformed(evt);
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        getNumericalActionListener().button8ActionPerformed(evt);
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        getNumericalActionListener().button9ActionPerformed(evt);
    }//GEN-LAST:event_button9ActionPerformed
// Méthodes évènements pour les boutons opérations, enter, clear, signe négatif
// qui font appel aux méthodes dans la classe OperationsActionListener
    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // TODO add your handling code here:
        getOperationsActionListener().enterButtonActionPerformed(evt);
    }//GEN-LAST:event_enterButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        getOperationsActionListener().addButtonActionPerformed(evt);
    }//GEN-LAST:event_addButtonActionPerformed

    private void multButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multButtonActionPerformed
        // TODO add your handling code here:
        getOperationsActionListener().multButtonActionPerformed(evt);
    }//GEN-LAST:event_multButtonActionPerformed

    private void divButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButtonActionPerformed
        // TODO add your handling code here:
        getOperationsActionListener().divButtonActionPerformed(evt);
    }//GEN-LAST:event_divButtonActionPerformed

    private void modButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modButtonActionPerformed
        // TODO add your handling code here:
        getOperationsActionListener().modButtonActionPerformed(evt);
    }//GEN-LAST:event_modButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        getOperationsActionListener().clearButtonActionPerformed(evt);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void negButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negButtonActionPerformed
        // TODO add your handling code here:
        getOperationsActionListener().negButtonActionPerformed(evt);
    }//GEN-LAST:event_negButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton divButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton modButton;
    private javax.swing.JButton multButton;
    private javax.swing.JButton negButton;
    private javax.swing.JTextField result;
    private javax.swing.JButton subButton;
    // End of variables declaration//GEN-END:variables


// Getters et setters
    /**
     * @return the numericalActionListener
     */
    public NumericalActionListener getNumericalActionListener() {
        return numericalActionListener;
    }

    /**
     * @param numericalActionListener the numericalActionListener to set
     */
    public void setNumericalActionListener(NumericalActionListener numericalActionListener) {
        this.numericalActionListener = numericalActionListener;
    }

    /**
     * @return the operationsActionListener
     */
    public OperationsActionListener getOperationsActionListener() {
        return operationsActionListener;
    }

    /**
     * @param operationsActionListener the operationsActionListener to set
     */
    public void setOperationsActionListener(OperationsActionListener operationsActionListener) {
        this.operationsActionListener = operationsActionListener;
    }

    /**
     * @return the operand1
     */
    public String getOperand1() {
        return operand1;
    }

    /**
     * @param operand1 the operand1 to set
     */
    public void setOperand1(String operand1) {
        this.operand1 = operand1;
    }

    /**
     * @return the operand2
     */
    public String getOperand2() {
        return operand2;
    }

    /**
     * @param operand2 the operand2 to set
     */
    public void setOperand2(String operand2) {
        this.operand2 = operand2;
    }

    /**
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * @return the operand1Occupied
     */
    public boolean isOperand1Occupied() {
        return operand1Occupied;
    }

    /**
     * @param operand1Occupied the operand1Occupied to set
     */
    public void setOperand1Occupied(boolean operand1Occupied) {
        this.operand1Occupied = operand1Occupied;
    }

    /**
     * @return the addButton
     */
    public javax.swing.JButton getAddButton() {
        return addButton;
    }

    /**
     * @param addButton the addButton to set
     */
    public void setAddButton(javax.swing.JButton addButton) {
        this.addButton = addButton;
    }

    /**
     * @return the button0
     */
    public javax.swing.JButton getButton0() {
        return button0;
    }

    /**
     * @param button0 the button0 to set
     */
    public void setButton0(javax.swing.JButton button0) {
        this.button0 = button0;
    }

    /**
     * @return the button1
     */
    public javax.swing.JButton getButton1() {
        return button1;
    }

    /**
     * @param button1 the button1 to set
     */
    public void setButton1(javax.swing.JButton button1) {
        this.button1 = button1;
    }

    /**
     * @return the button2
     */
    public javax.swing.JButton getButton2() {
        return button2;
    }

    /**
     * @param button2 the button2 to set
     */
    public void setButton2(javax.swing.JButton button2) {
        this.button2 = button2;
    }

    /**
     * @return the button3
     */
    public javax.swing.JButton getButton3() {
        return button3;
    }

    /**
     * @param button3 the button3 to set
     */
    public void setButton3(javax.swing.JButton button3) {
        this.button3 = button3;
    }

    /**
     * @return the button4
     */
    public javax.swing.JButton getButton4() {
        return button4;
    }

    /**
     * @param button4 the button4 to set
     */
    public void setButton4(javax.swing.JButton button4) {
        this.button4 = button4;
    }

    /**
     * @return the button5
     */
    public javax.swing.JButton getButton5() {
        return button5;
    }

    /**
     * @param button5 the button5 to set
     */
    public void setButton5(javax.swing.JButton button5) {
        this.button5 = button5;
    }

    /**
     * @return the button6
     */
    public javax.swing.JButton getButton6() {
        return button6;
    }

    /**
     * @param button6 the button6 to set
     */
    public void setButton6(javax.swing.JButton button6) {
        this.button6 = button6;
    }

    /**
     * @return the button7
     */
    public javax.swing.JButton getButton7() {
        return button7;
    }

    /**
     * @param button7 the button7 to set
     */
    public void setButton7(javax.swing.JButton button7) {
        this.button7 = button7;
    }

    /**
     * @return the button8
     */
    public javax.swing.JButton getButton8() {
        return button8;
    }

    /**
     * @param button8 the button8 to set
     */
    public void setButton8(javax.swing.JButton button8) {
        this.button8 = button8;
    }

    /**
     * @return the button9
     */
    public javax.swing.JButton getButton9() {
        return button9;
    }

    /**
     * @param button9 the button9 to set
     */
    public void setButton9(javax.swing.JButton button9) {
        this.button9 = button9;
    }

    /**
     * @return the clearButton
     */
    public javax.swing.JButton getClearButton() {
        return clearButton;
    }

    /**
     * @param clearButton the clearButton to set
     */
    public void setClearButton(javax.swing.JButton clearButton) {
        this.clearButton = clearButton;
    }

    /**
     * @return the divButton
     */
    public javax.swing.JButton getDivButton() {
        return divButton;
    }

    /**
     * @param divButton the divButton to set
     */
    public void setDivButton(javax.swing.JButton divButton) {
        this.divButton = divButton;
    }

    /**
     * @return the enterButton
     */
    public javax.swing.JButton getEnterButton() {
        return enterButton;
    }

    /**
     * @param enterButton the enterButton to set
     */
    public void setEnterButton(javax.swing.JButton enterButton) {
        this.enterButton = enterButton;
    }

    /**
     * @return the modButton
     */
    public javax.swing.JButton getModButton() {
        return modButton;
    }

    /**
     * @param modButton the modButton to set
     */
    public void setModButton(javax.swing.JButton modButton) {
        this.modButton = modButton;
    }

    /**
     * @return the multButton
     */
    public javax.swing.JButton getMultButton() {
        return multButton;
    }

    /**
     * @param multButton the multButton to set
     */
    public void setMultButton(javax.swing.JButton multButton) {
        this.multButton = multButton;
    }

    /**
     * @return the result
     */
    public javax.swing.JTextField getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(javax.swing.JTextField result) {
        this.result = result;
    }

    /**
     * @return the subButton
     */
    public javax.swing.JButton getSubButton() {
        return subButton;
    }

    /**
     * @param subButton the subButton to set
     */
    public void setSubButton(javax.swing.JButton subButton) {
        this.subButton = subButton;
    }

}
