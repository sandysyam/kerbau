/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Koneksi.Koneksi;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author Depo2
 */
public class panelLogin extends javax.swing.JPanel {

    /**
     * Creates new form panelLogin
     */
  
    
    public panelLogin() {
        initComponents();
        
    }
    
    public void addActionListenerLogin (ActionListener l) {
        btnlogin.addActionListener(l);
    }

    public JPasswordField getTxtpassword() {
        return txtpassword;
    }

    public JTextField getTxtusername() {
        return txtusername;
    }
  
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground1 = new Component.PanelBackground();
        panelTransparan1 = new Component.PanelTransparan();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnclear = new Component.Tombol_Master();
        btnlogin = new Component.Tombol_Master();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        panelBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTransparan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Password :");
        panelTransparan1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 80, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("SPARE PART TOYOTA DI TOKO AA MOTOR");
        panelTransparan1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 310, -1));

        txtusername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setOpaque(false);
        panelTransparan1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 190, 20));

        txtpassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setOpaque(false);
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        panelTransparan1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 190, -1));

        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        panelTransparan1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 90, -1));

        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Login");
        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelTransparan1.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("UserName :");
        panelTransparan1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("SISTEM INFORMASI PENJUALAN");
        panelTransparan1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 240, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Komputer-Icon [].png"))); // NOI18N
        panelTransparan1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        panelBackground1.add(panelTransparan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 460, 300));

        add(panelBackground1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtusername.setText("");
        txtpassword.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
         
    
    }//GEN-LAST:event_txtpasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Tombol_Master btnclear;
    private Component.Tombol_Master btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private Component.PanelBackground panelBackground1;
    private Component.PanelTransparan panelTransparan1;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
