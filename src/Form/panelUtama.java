/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.awt.CardLayout;
import java.awt.event.ActionListener;

/**
 *
 * @author SANDYS
 */
public class panelUtama extends javax.swing.JPanel {

    /**
     * Creates new form panelUtama
     */
    public panelUtama() {
        initComponents();
        
    }
    
    public void addActionListenerMaster (ActionListener l) {
        btnMaster.addActionListener(l);
    }
    
    public void addActionListenerSupplier (ActionListener l) {
        btnSupplier.addActionListener(l);
    }
    
    public void addActionListenerCustomer (ActionListener l) {
        btnCustomer.addActionListener(l);
    }
    
    public void addActionListenerSell (ActionListener l) {
        btnSell.addActionListener(l);
    }
    
    public void addActionListenerBuy (ActionListener l) {
        btnBuy.addActionListener(l);
    }
    
    public void addActionListenerAboutUs (ActionListener l) {
        btnAboutUs.addActionListener(l);
    }
    
    public void addActionListenerSetting (ActionListener l) {
        btnSetting.addActionListener(l);
    }
    
    public void addActionListenerLogout (ActionListener l) {
        btnlogout.addActionListener(l);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new Component.PanelBackground();
        epart = new javax.swing.JLabel();
        btnAboutUs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SIPS = new javax.swing.JLabel();
        btnMaster = new Component.Tombol_Master();
        btnCustomer = new Component.Tombol_Master();
        btnSell = new Component.Tombol_Master();
        btnSupplier = new Component.Tombol_Master();
        btnBuy = new Component.Tombol_Master();
        btnSetting = new Component.Tombol_Master();
        btnlogout = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 640));
        setMinimumSize(new java.awt.Dimension(800, 640));
        setPreferredSize(new java.awt.Dimension(800, 640));
        setLayout(new java.awt.BorderLayout());

        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        epart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1Epart.png"))); // NOI18N
        panelBackground.add(epart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnAboutUs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAboutUs.setForeground(new java.awt.Color(255, 255, 255));
        btnAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/us.png"))); // NOI18N
        btnAboutUs.setText("| About Us");
        btnAboutUs.setBorderPainted(false);
        btnAboutUs.setContentAreaFilled(false);
        btnAboutUs.setFocusPainted(false);
        btnAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsActionPerformed(evt);
            }
        });
        panelBackground.add(btnAboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistem Informasi Penjualan Spare Part");
        panelBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        SIPS.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        SIPS.setForeground(new java.awt.Color(255, 255, 255));
        SIPS.setText("S.I.P.S");
        panelBackground.add(SIPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        btnMaster.setForeground(new java.awt.Color(255, 255, 255));
        btnMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/master.png"))); // NOI18N
        btnMaster.setText("Master");
        btnMaster.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMaster.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaster.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBackground.add(btnMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 110, 120));

        btnCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer.png"))); // NOI18N
        btnCustomer.setText("Customer");
        btnCustomer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBackground.add(btnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 110, 120));

        btnSell.setForeground(new java.awt.Color(255, 255, 255));
        btnSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sell.png"))); // NOI18N
        btnSell.setText("Sell");
        btnSell.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSell.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSell.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBackground.add(btnSell, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 110, 120));

        btnSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supplier.png"))); // NOI18N
        btnSupplier.setText("Supplier");
        btnSupplier.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSupplier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSupplier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBackground.add(btnSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 110, 120));

        btnBuy.setForeground(new java.awt.Color(255, 255, 255));
        btnBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buy.png"))); // NOI18N
        btnBuy.setText("Buy");
        btnBuy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBackground.add(btnBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 110, 120));

        btnSetting.setForeground(new java.awt.Color(255, 255, 255));
        btnSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings_3-24.png"))); // NOI18N
        btnSetting.setText("Setting");
        btnSetting.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSetting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSetting.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBackground.add(btnSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 110, 120));

        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shutdown-24.png"))); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.setBorderPainted(false);
        btnlogout.setContentAreaFilled(false);
        btnlogout.setFocusPainted(false);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        panelBackground.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 13, 100, 40));

        add(panelBackground, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_btnAboutUsActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        
    }//GEN-LAST:event_btnlogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SIPS;
    private javax.swing.JButton btnAboutUs;
    private Component.Tombol_Master btnBuy;
    private Component.Tombol_Master btnCustomer;
    private Component.Tombol_Master btnMaster;
    private Component.Tombol_Master btnSell;
    private Component.Tombol_Master btnSetting;
    private Component.Tombol_Master btnSupplier;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel epart;
    private javax.swing.JLabel jLabel2;
    private Component.PanelBackground panelBackground;
    // End of variables declaration//GEN-END:variables
}
