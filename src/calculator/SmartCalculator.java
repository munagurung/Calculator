/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Muna Gurung
 */
public class SmartCalculator extends javax.swing.JFrame {

    /**
     * Variables to hold operands, operator, calculator display and calculated
     * result
     */
    private double firstOperand, secondOperand;
    private char operator; // +, -, /, *
    private String displayResult = "0"; // the text to be displayed on the calc
    private double result = 0; // the calculated result

    /**
     * Creates new form SmartCalculator
     */
    public SmartCalculator() {
        initComponents();

        // position the calc. to the centre of the screen
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcDisplayTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnDivide = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtnMultiply = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnSubtract = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jBtnAdd = new javax.swing.JButton();
        jBtnEqual = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(200, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        calcDisplayTextField.setEditable(false);
        calcDisplayTextField.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
        calcDisplayTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcDisplayTextField.setText("0");
        calcDisplayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcDisplayTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(calcDisplayTextField, java.awt.BorderLayout.NORTH);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn7);

        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn8);

        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn9);

        jBtnDivide.setText("/");
        jBtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivideActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnDivide);

        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn4);

        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn5);

        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn6);

        jBtnMultiply.setText("*");
        jBtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMultiplyActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnMultiply);

        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn1);

        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn2);

        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn3);

        jBtnSubtract.setText("-");
        jBtnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubtractActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSubtract);

        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn0);

        jBtnDot.setText(".");
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnDot);

        jBtnAdd.setText("+");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAdd);

        jBtnEqual.setText("=");
        jBtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnEqual);

        jBtnClear.setText("C");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnClear);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcDisplayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcDisplayTextFieldActionPerformed
        calcDisplayTextField.setText(displayResult);
    }//GEN-LAST:event_calcDisplayTextFieldActionPerformed

    /**
     * This method works out the text to be displayed on the calculator
     *
     * @param numberEntered the number clicked by the user
     */
    private void setDisplayResult(int numberEntered) {
        if ("0".equals(displayResult)
                || "0.0".equals(displayResult)) {
            displayResult = String.valueOf(numberEntered);
        } else {
            displayResult += String.valueOf(numberEntered);
        }
        calcDisplayTextField.setText(displayResult);
    }

    /**
     * This method works out the text to be displayed on the calculator
     *
     * @param stringEntered the dot string clicked by the user
     */
    private void setDisplayResult(String stringEntered) {
        if ("0".equals(displayResult)
                || "0.0".equals(displayResult)) {
            displayResult = String.valueOf(stringEntered);
        } else {
            displayResult += String.valueOf(stringEntered);
        }
        calcDisplayTextField.setText(displayResult);
    }

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        setDisplayResult(7);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        setDisplayResult(8);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        setDisplayResult(9);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        setDisplayResult(4);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        setDisplayResult(5);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        setDisplayResult(6);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        setDisplayResult(1);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        setDisplayResult(2);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        setDisplayResult(3);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        setDisplayResult(0);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        addDot();
    }//GEN-LAST:event_jBtnDotActionPerformed

    /**
     * This method makes sure that duplicate dot is not used in the calculation.
     * For example: "2.." is not allowed. When the dots are pressed one after
     * the other, only one dot is used. So, the user is showed "2." instead of
     * "2..".
     */
    private void addDot() {
        if (!displayResult.endsWith(".")) {
            setDisplayResult(".");
        }
    }

    /**
     * This method sets the value for first operand
     */
    private void setFirstOperand() {
        if (firstOperand == 0) {
            firstOperand = Double.parseDouble(displayResult);
        }
    }

    /**
     * This method sets the value for second operand
     */
    private void setSecondOperand() {
        int operatorIndex = 0;

        /*
        * Check that the user has a number entered before pressing equal.
        * Then get the operator value that the user has entered in order to find
        * the number entered after the operator.
        * Store the number entered after operator as the second value in the
        * secondOperand variable.
         */
        if (!displayResult.endsWith(Character.toString('+')) && operator == '+') {
            operatorIndex = displayResult.indexOf(Character.toString('+'));
            secondOperand = Double.parseDouble(displayResult.substring(operatorIndex + 1));
//            System.out.println(displayResult + " len " + displayLength);
//            System.out.println("opin " + operatorIndex);
//            System.out.println(" sec " + secondOperand);
        } else if (!displayResult.endsWith(Character.toString('-'))
                && operator == '-') {
            operatorIndex = displayResult.indexOf(Character.toString('-'));
            secondOperand = Double.parseDouble(displayResult.substring(operatorIndex + 1));
        } else if (!displayResult.endsWith(Character.toString('*'))
                && operator == '*') {
            operatorIndex = displayResult.indexOf(Character.toString('*'));
            secondOperand = Double.parseDouble(displayResult.substring(operatorIndex + 1));
        } else if (!displayResult.endsWith(Character.toString('/'))
                && operator == '/') {
            operatorIndex = displayResult.indexOf(Character.toString('/'));
            secondOperand = Double.parseDouble(displayResult.substring(operatorIndex + 1));
        }
    }

    /**
     * This method replaces the old operator with the new one if operator is
     * clicked continuously without clicking a number first. For example: '2 +-'
     * becomes '2-'. Here subtract was clicked after add button, hence this
     * method will replace the operator with the latest clicked one.
     *
     * @param operator the operator entered by the user
     */
    private void replaceOperator(char operator) {
        // get the length of the text displayed on the calculator
        int displayLength = displayResult.length() - 1;

        /* The old operator will be at the second last of the text, so get the 
        * value of the operator by using the String's substring method
         */
        String oldOperator = displayResult.substring(displayLength);

        /* The new operator will be the last one, the one that the user clicked
        * at last
         */
        String newOperator = Character.toString(operator);

        // replace the operator to show the correct calculation to the user
        displayResult = displayResult.replace(oldOperator, newOperator);
    }

    /**
     * This method makes sure that only one operator is displayed when two
     * operators are entered subsequently. The last operator takes precedence
     * over the previous operators and is used for the final calculation.
     *
     * @param operatorEntered the operator clicked by the user
     */
    private void checkOperator(char operatorEntered) {
        // get the length of the text displayed on the calculator
        int displayLength = displayResult.length() - 1;

        /*
        * The first if statement checks if an operator has not been used before
        * or if a number has been clicked before operator. If yes, operator
        * value is set with the operator entered by the user.
        * The second if statement checks if an operator has been used before/
        * has it's value set. If yes, then the user has clicked two operators so
        * only the latest operator is used for the calculation.
         */
        if (operator == '\u0000'
                || Character.isDigit(displayResult.charAt(displayLength))) {
            operator = operatorEntered;
            displayResult += operator;
        } else if (operator == '+'
                || operator == '*'
                || operator == '/'
                || operator == '-') {
            operator = operatorEntered;
            replaceOperator(operator);
        }
        calcDisplayTextField.setText(displayResult);
    }


    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        setFirstOperand();
        checkOperator('+');
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqualActionPerformed
        // first operand is assigned value when an operator is clicked, so 
        // assign the second operand by calling the set second operand method
        // when equal is clicked
        setSecondOperand();

        // switch statement that does the calculation based on first and second
        // operands
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                result = firstOperand / secondOperand;
                break;
            case '\0':
                result = firstOperand;
        }

        /* Assign result value to firstOperand and displayResult variable; and
        * null secondOperand variable to prepare the calculator for next 
        * consecutive calculation
         */
        firstOperand = result;
        secondOperand = 0;
        displayResult = "" + firstOperand;

        // display calculated result to the user
        calcDisplayTextField.setText(Double.toString(result));
    }//GEN-LAST:event_jBtnEqualActionPerformed

    private void jBtnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubtractActionPerformed
        setFirstOperand();
        checkOperator('-');
    }//GEN-LAST:event_jBtnSubtractActionPerformed

    private void jBtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMultiplyActionPerformed
        setFirstOperand();
        checkOperator('*');
    }//GEN-LAST:event_jBtnMultiplyActionPerformed

    private void jBtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivideActionPerformed
        setFirstOperand();
        checkOperator('/');
    }//GEN-LAST:event_jBtnDivideActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        // set all the variables to null to prepare for new calculation
        operator = '\u0000';
        firstOperand = 0;
        secondOperand = 0;
        result = 0;
        displayResult = "0";
        calcDisplayTextField.setText("0");
    }//GEN-LAST:event_jBtnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SmartCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmartCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmartCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmartCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmartCalculator().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField calcDisplayTextField;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnDivide;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnEqual;
    private javax.swing.JButton jBtnMultiply;
    private javax.swing.JButton jBtnSubtract;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
