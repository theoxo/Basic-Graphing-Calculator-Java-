/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MainPackage;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptException;

/**
 *
 * @author theola1
 */
public class PanelFaktiskRaknare extends javax.swing.JPanel {

    /**
     * Creates new form PanelFaktiskRaknare
     */
    public PanelFaktiskRaknare() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BttnRun = new javax.swing.JButton();
        FieldRaknare = new javax.swing.JTextField();
        BttnCos = new javax.swing.JButton();
        BttnSin = new javax.swing.JButton();
        BttnTan = new javax.swing.JButton();
        BttnParantes1 = new javax.swing.JButton();
        BttnBack = new javax.swing.JButton();
        BttnClear = new javax.swing.JButton();
        BttnPower = new javax.swing.JButton();
        BttnDivi = new javax.swing.JButton();
        Bttn9 = new javax.swing.JButton();
        Bttn8 = new javax.swing.JButton();
        Bttn7 = new javax.swing.JButton();
        BttnParantes2 = new javax.swing.JButton();
        BttnKomma = new javax.swing.JButton();
        Bttn4 = new javax.swing.JButton();
        Bttn5 = new javax.swing.JButton();
        Bttn6 = new javax.swing.JButton();
        BttnMulti = new javax.swing.JButton();
        BttnMinus = new javax.swing.JButton();
        Bttn3 = new javax.swing.JButton();
        Bttn2 = new javax.swing.JButton();
        Bttn1 = new javax.swing.JButton();
        Bttn0 = new javax.swing.JButton();
        BttnPunkt = new javax.swing.JButton();
        BttnPlus = new javax.swing.JButton();
        FieldRaknareSvar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        BttnRun.setText("=");
        BttnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnRunActionPerformed(evt);
            }
        });

        FieldRaknare.setEditable(false);
        FieldRaknare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldRaknareActionPerformed(evt);
            }
        });

        BttnCos.setText("Cos");
        BttnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnCosActionPerformed(evt);
            }
        });

        BttnSin.setText("Sin");
        BttnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnSinActionPerformed(evt);
            }
        });

        BttnTan.setText("Tan");
        BttnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnTanActionPerformed(evt);
            }
        });

        BttnParantes1.setText("(");
        BttnParantes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnParantes1ActionPerformed(evt);
            }
        });

        BttnBack.setText("←");
        BttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnBackActionPerformed(evt);
            }
        });

        BttnClear.setText("C");
        BttnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnClearActionPerformed(evt);
            }
        });

        BttnPower.setText("^");
        BttnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnPowerActionPerformed(evt);
            }
        });

        BttnDivi.setText("/");
        BttnDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnDiviActionPerformed(evt);
            }
        });

        Bttn9.setText("9");
        Bttn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn9ActionPerformed(evt);
            }
        });

        Bttn8.setText("8");
        Bttn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn8ActionPerformed(evt);
            }
        });

        Bttn7.setText("7");
        Bttn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn7ActionPerformed(evt);
            }
        });

        BttnParantes2.setText(")");
        BttnParantes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnParantes2ActionPerformed(evt);
            }
        });

        BttnKomma.setText(",");
        BttnKomma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnKommaActionPerformed(evt);
            }
        });

        Bttn4.setText("4");
        Bttn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn4ActionPerformed(evt);
            }
        });

        Bttn5.setText("5");
        Bttn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn5ActionPerformed(evt);
            }
        });

        Bttn6.setText("6");
        Bttn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn6ActionPerformed(evt);
            }
        });

        BttnMulti.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BttnMulti.setText("*");
        BttnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnMultiActionPerformed(evt);
            }
        });

        BttnMinus.setText("-");
        BttnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnMinusActionPerformed(evt);
            }
        });

        Bttn3.setText("3");
        Bttn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn3ActionPerformed(evt);
            }
        });

        Bttn2.setText("2");
        Bttn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn2ActionPerformed(evt);
            }
        });

        Bttn1.setText("1");
        Bttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn1ActionPerformed(evt);
            }
        });

        Bttn0.setText("0");
        Bttn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttn0ActionPerformed(evt);
            }
        });

        BttnPunkt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BttnPunkt.setText(".");
        BttnPunkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnPunktActionPerformed(evt);
            }
        });

        BttnPlus.setText("+");
        BttnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnPlusActionPerformed(evt);
            }
        });

        FieldRaknareSvar.setEditable(false);
        FieldRaknareSvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldRaknareSvarActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("OBS: Vänligen ange minst ett \nav talen på decimal form\n(t.ex. 5.0), detta underlättarför koden och hindrar \nprogrammet från att krascha!");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BttnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BttnParantes1)
                                    .addGap(19, 19, 19)
                                    .addComponent(BttnParantes2))
                                .addComponent(BttnSin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BttnCos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BttnPunkt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bttn7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bttn8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BttnDivi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BttnMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Bttn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BttnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Bttn0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Bttn1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bttn2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Bttn3)
                                    .addComponent(BttnKomma))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BttnClear))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bttn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bttn5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bttn6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BttnPower)))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FieldRaknare, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BttnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BttnRun)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FieldRaknareSvar, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldRaknare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BttnRun)
                    .addComponent(FieldRaknareSvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BttnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BttnDivi)
                            .addComponent(BttnMinus)
                            .addComponent(BttnBack)
                            .addComponent(BttnPunkt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bttn7)
                            .addComponent(Bttn8)
                            .addComponent(Bttn9)
                            .addComponent(BttnPlus)
                            .addComponent(BttnParantes2)
                            .addComponent(BttnParantes1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bttn4)
                            .addComponent(Bttn5)
                            .addComponent(Bttn6)
                            .addComponent(BttnCos)
                            .addComponent(BttnPower))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Bttn1)
                                    .addComponent(Bttn2)
                                    .addComponent(Bttn3)
                                    .addComponent(BttnSin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Bttn0)
                                    .addComponent(BttnTan)
                                    .addComponent(BttnKomma))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(BttnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BttnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnRunActionPerformed
        double SvarD = 0;
        String Kört=FieldRaknare.getText();
        for (int a=0; a<Kört.length(); a++) //Ser till att t.ex. 5--5=10 funkar
           {
                if (Kört.charAt(a)=='-' && Kört.charAt(a+1)=='-')
                {
                String sträng11 = Kört.substring(0, a);
		String sträng12 = Kört.substring(a+2, Kört.length());
		Kört = sträng11+"+"+sträng12;
                }
                
                else if (Kört.charAt(a)=='-' && Kört.charAt(a+1)=='(' && Kört.charAt(a+2)=='-')
                {
                String sträng11 = Kört.substring(0, a);
		String sträng12 = Kört.substring(a+3, Kört.length());
		Kört = sträng11+"+("+sträng12;
                }
            }
        try {
            SvarD = (double) PanelRaknare.motor.eval(Kört);
        } catch (ScriptException ex) {
            Logger.getLogger(PanelFaktiskRaknare.class.getName()).log(Level.SEVERE, null, ex);
        }
        FieldRaknareSvar.setText(""+SvarD);
    }//GEN-LAST:event_BttnRunActionPerformed

    private void BttnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnCosActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"Math.cos("); //Adds a Math.cos( to the function
    }//GEN-LAST:event_BttnCosActionPerformed

    private void BttnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnSinActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"Math.sin("); //Adds a Math.sin( to the function
    }//GEN-LAST:event_BttnSinActionPerformed

    private void BttnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnTanActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"Math.tan("); //Adds a Math.tan( to the function
    }//GEN-LAST:event_BttnTanActionPerformed

    private void BttnParantes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnParantes1ActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"("); //Adds a "(" to the textfield
    }//GEN-LAST:event_BttnParantes1ActionPerformed

    private void BttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnBackActionPerformed
        String Bort = FieldRaknare.getText();
        int langdBort = Bort.length();
        Bort = Bort.substring(0, langdBort-1);
        FieldRaknare.setText(Bort);
    }//GEN-LAST:event_BttnBackActionPerformed

    private void BttnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnClearActionPerformed
        FieldRaknare.setText("");
    }//GEN-LAST:event_BttnClearActionPerformed

    private void BttnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnPowerActionPerformed
        //  FieldFunctions.setText(FieldFunctions.getText()+"^"); //Adds a "^" to the textfield - äldre version där inmatningssekvensen var x^,y.
        /* String langdstring = FieldFunctions.getText();
        int langd = langdstring.length();
        String tillfällig1 = langdstring.substring(langd-1);
        String tillfällig3 = langdstring.substring(0, langd-1);
        String tillfällig2 = "Math.pow("+tillfällig1;
        FieldFunctions.setText(tillfällig3+tillfällig2);*/
        FieldRaknare.setText(FieldRaknare.getText()+"Math.pow("); //Adds a "Math.pow(" to the textfield - nyare, enklare version
    }//GEN-LAST:event_BttnPowerActionPerformed

    private void BttnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnDiviActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"/"); //Adds a "/" to the textfield
    }//GEN-LAST:event_BttnDiviActionPerformed

    private void Bttn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn9ActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"9"); //Adds the number "9" to the textfield
    }//GEN-LAST:event_Bttn9ActionPerformed

    private void Bttn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn8ActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"8"); //Adds the number "8" to the textfield
    }//GEN-LAST:event_Bttn8ActionPerformed

    private void Bttn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn7ActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"7"); //Adds the number "7" to the textfield
    }//GEN-LAST:event_Bttn7ActionPerformed

    private void BttnParantes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnParantes2ActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+")"); //Adds a ")" to the textfield
    }//GEN-LAST:event_BttnParantes2ActionPerformed

    private void BttnKommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnKommaActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+","); //Adds an "," to the textfield
    }//GEN-LAST:event_BttnKommaActionPerformed

    private void Bttn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn4ActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"4"); //Adds the number "4" to the textfield
    }//GEN-LAST:event_Bttn4ActionPerformed

    private void Bttn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn5ActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"5"); //Adds the number "5" to the textfield
    }//GEN-LAST:event_Bttn5ActionPerformed

    private void Bttn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn6ActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"6"); //Adds the number "6" to the textfield
    }//GEN-LAST:event_Bttn6ActionPerformed

    private void BttnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnMultiActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"*"); //Adds a "*" to the textfield
    }//GEN-LAST:event_BttnMultiActionPerformed

    private void BttnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnMinusActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"-"); //Adds a "-" to the textfield
    }//GEN-LAST:event_BttnMinusActionPerformed

    private void Bttn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn3ActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"3"); //Adds the number "3" to the textfield
    }//GEN-LAST:event_Bttn3ActionPerformed

    private void Bttn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn2ActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"2"); //Adds the number "2" to the textfield
    }//GEN-LAST:event_Bttn2ActionPerformed

    private void Bttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn1ActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"1"); //Adds the number "1" to the textfield
    }//GEN-LAST:event_Bttn1ActionPerformed

    private void Bttn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttn0ActionPerformed

        FieldRaknare.setText(FieldRaknare.getText()+"0"); //Adds the number "0" to the textfield
    }//GEN-LAST:event_Bttn0ActionPerformed

    private void BttnPunktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnPunktActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"."); //Adds a "." to the textfield
    }//GEN-LAST:event_BttnPunktActionPerformed

    private void BttnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnPlusActionPerformed
        FieldRaknare.setText(FieldRaknare.getText()+"+"); //Adds a "+" to the textfield
    }//GEN-LAST:event_BttnPlusActionPerformed

    private void FieldRaknareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldRaknareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldRaknareActionPerformed

    private void FieldRaknareSvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldRaknareSvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldRaknareSvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bttn0;
    private javax.swing.JButton Bttn1;
    private javax.swing.JButton Bttn2;
    private javax.swing.JButton Bttn3;
    private javax.swing.JButton Bttn4;
    private javax.swing.JButton Bttn5;
    private javax.swing.JButton Bttn6;
    private javax.swing.JButton Bttn7;
    private javax.swing.JButton Bttn8;
    private javax.swing.JButton Bttn9;
    private javax.swing.JButton BttnBack;
    private javax.swing.JButton BttnClear;
    private javax.swing.JButton BttnCos;
    private javax.swing.JButton BttnDivi;
    private javax.swing.JButton BttnKomma;
    private javax.swing.JButton BttnMinus;
    private javax.swing.JButton BttnMulti;
    private javax.swing.JButton BttnParantes1;
    private javax.swing.JButton BttnParantes2;
    private javax.swing.JButton BttnPlus;
    private javax.swing.JButton BttnPower;
    private javax.swing.JButton BttnPunkt;
    private javax.swing.JButton BttnRun;
    private javax.swing.JButton BttnSin;
    private javax.swing.JButton BttnTan;
    private javax.swing.JTextField FieldRaknare;
    private javax.swing.JTextField FieldRaknareSvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
