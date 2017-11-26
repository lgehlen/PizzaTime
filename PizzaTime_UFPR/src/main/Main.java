/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import cliente.ClienteForm;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pizza.TipoForm;
import pizza.ValoresForm;
/**
 *
 * @author lgehlen
 */
public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
        ImageIcon image = new ImageIcon(this.getClass().getClassLoader().getResource("img/BG800X600.png"));
        ImageIcon imagebarbicha = new ImageIcon(this.getClass().getClassLoader().getResource("img/barbicha.jpg"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelP1 = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btCliente = new javax.swing.JButton();
        btNovoPedido = new javax.swing.JButton();
        btValores = new javax.swing.JButton();
        btPizza = new javax.swing.JButton();
        imgMenu = new javax.swing.JLabel();
        panelBarbicha = new javax.swing.JPanel();
        imgBarbicha = new javax.swing.JLabel();
        panelMaior = new javax.swing.JPanel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(getPreferredSize());
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setResizable(false);

        panelP1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelP1.setAlignmentX(300.0F);
        panelP1.setAlignmentY(300.0F);
        panelP1.setPreferredSize(new java.awt.Dimension(800, 600));
        panelP1.setLayout(null);

        panelLateral.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panelLateral.setPreferredSize(new java.awt.Dimension(299, 599));
        panelLateral.setLayout(null);

        panelMenu.setBorder(new javax.swing.border.MatteBorder(null));
        panelMenu.setLayout(null);

        btCliente.setText("GERENCIAR CLIENTES");
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });
        panelMenu.add(btCliente);
        btCliente.setBounds(10, 30, 280, 50);

        btNovoPedido.setText("NOVO PEDIDO");
        btNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoPedidoActionPerformed(evt);
            }
        });
        panelMenu.add(btNovoPedido);
        btNovoPedido.setBounds(10, 473, 280, 50);

        btValores.setText("GERENCIAR VALORES");
        btValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValoresActionPerformed(evt);
            }
        });
        panelMenu.add(btValores);
        btValores.setBounds(10, 170, 280, 50);

        btPizza.setText("GERENCIAR PIZZA");
        panelMenu.add(btPizza);
        btPizza.setBounds(10, 100, 280, 50);

        imgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menuFundo.png"))); // NOI18N
        panelMenu.add(imgMenu);
        imgMenu.setBounds(0, 0, 300, 530);

        panelLateral.add(panelMenu);
        panelMenu.setBounds(0, 0, 300, 530);

        panelBarbicha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        imgBarbicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barbicha400X400.jpg"))); // NOI18N
        imgBarbicha.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(230, 185, 185)));

        javax.swing.GroupLayout panelBarbichaLayout = new javax.swing.GroupLayout(panelBarbicha);
        panelBarbicha.setLayout(panelBarbichaLayout);
        panelBarbichaLayout.setHorizontalGroup(
            panelBarbichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarbichaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgBarbicha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBarbichaLayout.setVerticalGroup(
            panelBarbichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarbichaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgBarbicha))
        );

        panelLateral.add(panelBarbicha);
        panelBarbicha.setBounds(0, 530, 300, 70);

        panelP1.add(panelLateral);
        panelLateral.setBounds(0, 0, 300, 600);

        panelMaior.setLayout(null);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG800X600.png"))); // NOI18N
        imgFundo.setAlignmentX(300.0F);
        imgFundo.setAlignmentY(0.0F);
        imgFundo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(218, 168, 171)));
        panelMaior.add(imgFundo);
        imgFundo.setBounds(0, 0, 820, 600);

        panelP1.add(panelMaior);
        panelMaior.setBounds(300, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelP1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoPedidoActionPerformed
        new ClienteForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btNovoPedidoActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        new ClienteForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btClienteActionPerformed

    private void btValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValoresActionPerformed
        new ValoresForm().setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btValoresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main main = new Main();
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btNovoPedido;
    private javax.swing.JButton btPizza;
    private javax.swing.JButton btValores;
    private javax.swing.JLabel imgBarbicha;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel imgMenu;
    private javax.swing.JPanel panelBarbicha;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelMaior;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelP1;
    // End of variables declaration//GEN-END:variables
}
