/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.forms;

import com.sv.udb.clases.Petrolio;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Lira
 */
public class FrmPetrolio extends javax.swing.JFrame {

    /**
     * Creates new form FrmPetrolio
     */
     private boolean isCant;
     double tipo, cantidad;
     Petrolio obje;
  //  private Ejercicio2 objeEjer;
  // private List<Ejercicio2> listEjer;
   
    
    
    public FrmPetrolio() {
        initComponents();
        this.setLocationRelativeTo(null);
    
    }
    
    

    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmb = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        rbGalo = new javax.swing.JRadioButton();
        rbDine = new javax.swing.JRadioButton();
        txtnomb = new javax.swing.JTextField();
        txtcant = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGaso = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPago = new javax.swing.JLabel();
        lblPagoD = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblVuelto = new javax.swing.JLabel();
        lblVueltoD = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPagadoD = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblGalonesC = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diesel", "Regular", "Especial" }));

        jLabel1.setText("Seleccione el tipo:");

        rbGalo.setText("Galones");
        rbGalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGaloActionPerformed(evt);
            }
        });

        rbDine.setText("Dinero $");
        rbDine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDineActionPerformed(evt);
            }
        });

        txtnomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombActionPerformed(evt);
            }
        });

        txtcant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad:");

        jLabel3.setText("Nombre cliente:");

        btnGaso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGaso.setText("Gasolina");
        btnGaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGasoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(rbGalo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbDine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcant, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(txtnomb))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnGaso, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbGalo)
                    .addComponent(rbDine)
                    .addComponent(jLabel3)
                    .addComponent(txtnomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGaso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta"));

        lblPago.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lblPago.setText("Total:");

        lblPagoD.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lblPagoD.setText("$0");

        lblVuelto.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lblVuelto.setText("Vuelto:");

        lblVueltoD.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lblVueltoD.setText("$0");

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setText("Pagado:");

        lblPagadoD.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lblPagadoD.setText("$0");

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel6.setText("Galones:");

        lblGalonesC.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lblGalonesC.setText("0");

        btnPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblVuelto)
                                .addGap(57, 57, 57)
                                .addComponent(lblVueltoD))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                    .addComponent(lblGalonesC))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(94, 94, 94)
                                    .addComponent(jLabel4)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(44, 44, 44)
                                .addComponent(lblPagadoD))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPago)
                                .addGap(73, 73, 73)
                                .addComponent(lblPagoD))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lblGalonesC))
                    .addComponent(lblPagadoD)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblVuelto)
                        .addComponent(lblVueltoD))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPago)
                        .addComponent(lblPagoD, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbGaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGaloActionPerformed
             rbDine.setSelected(false);
    }//GEN-LAST:event_rbGaloActionPerformed

    private void rbDineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDineActionPerformed
        rbGalo.setSelected(false);
    }//GEN-LAST:event_rbDineActionPerformed

    private void txtnombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombActionPerformed

    private void txtcantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantActionPerformed

    private void btnGasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGasoActionPerformed
        if(!(txtcant.getText().trim().isEmpty())  && !(txtnomb.getText().trim().isEmpty()) && (rbDine.isSelected() == true || rbGalo.isSelected() == true))
        {
            String val="";
        //   val= Obj.toString(cmb.getSelectedItem());
            try {
                cantidad= Double.parseDouble(this.txtcant.getText());
                 if(rbDine.isSelected() == true)
    {
    obje.ventaDinero(cantidad, tipo);
     lblGalonesC.setText(obje.getCantidad()+"");
       btnPagar.setEnabled(true);
    btnGaso.setEnabled(false);
    lblPagoD.setText("$"+this.txtcant.getText());
    obje.setPago(Double.parseDouble(this.txtcant.getText()));
    }
    else if (rbGalo.isSelected() == true)
    {
     //   String val = cmb.getSelectedItem();
    //obje.ventaGalones(cantidad, val);
    JOptionPane.showMessageDialog(this, "$"+obje.getPago());
    lblPagoD.setText("$"+obje.getPago());
    btnPagar.setEnabled(true);
    btnGaso.setEnabled(false);
    lblGalonesC.setText(this.txtcant.getText());
    }
   
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Solo ingrese numeros");
    this.txtcant.setText("");
    this.txtcant.requestFocus();
            }
        
        }
        JOptionPane.showMessageDialog(this, cmb.getSelectedItem());
        
    }//GEN-LAST:event_btnGasoActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPetrolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPetrolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPetrolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPetrolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPetrolio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaso;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox cmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblGalonesC;
    private javax.swing.JLabel lblPagadoD;
    private javax.swing.JLabel lblPago;
    private javax.swing.JLabel lblPagoD;
    private javax.swing.JLabel lblVuelto;
    private javax.swing.JLabel lblVueltoD;
    private javax.swing.JRadioButton rbDine;
    private javax.swing.JRadioButton rbGalo;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtnomb;
    // End of variables declaration//GEN-END:variables
}
