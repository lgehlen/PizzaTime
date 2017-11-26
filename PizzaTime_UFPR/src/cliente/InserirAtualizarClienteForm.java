/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import connectionFactory.ConnectionFactory;
import dao.ClienteDao;
import dao.impl.ClienteDaoImpl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gehlen
 */
public class InserirAtualizarClienteForm extends javax.swing.JFrame {

    private boolean atualizaneitor;
    private Cliente c;
    /**
     * Creates new form InserirAtualizarClienteForm
     */
    public InserirAtualizarClienteForm() {
        initComponents();
        this.c = new Cliente();
        this.atualizaneitor = false;
    }

    public InserirAtualizarClienteForm(Cliente cli) {
        initComponents();
        this.c = cli;
        tfNome.setText(cli.getNome());
        tfSobrenome.setText(cli.getSobrenome());
        tfEndereco.setText(cli.getEndereco());
        tfTelefone.setText(cli.getTelefone());
        this.atualizaneitor = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfSobrenome = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 330));
        setResizable(false);
        setSize(getPreferredSize());
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 300));
        jPanel1.setLayout(null);
        jPanel1.add(tfNome);
        tfNome.setBounds(80, 50, 360, 20);
        jPanel1.add(tfEndereco);
        tfEndereco.setBounds(80, 200, 360, 20);
        jPanel1.add(tfSobrenome);
        tfSobrenome.setBounds(80, 100, 360, 20);
        jPanel1.add(tfTelefone);
        tfTelefone.setBounds(80, 150, 360, 20);

        btCancelar.setText("CANCELAR");
        jPanel1.add(btCancelar);
        btCancelar.setBounds(230, 250, 100, 23);

        btConfirmar.setText("CONFIRMAR");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btConfirmar);
        btConfirmar.setBounds(340, 250, 100, 23);

        jLabel2.setText("Telefone:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 130, 50, 14);

        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 30, 34, 14);

        jLabel4.setText("Sobrenome:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 80, 60, 14);

        jLabel5.setText("Endereço:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 180, 50, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papel2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        Connection con;
        try {
            con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);
            ClienteDao cDao = new ClienteDaoImpl(con);
            
            c.setNome(tfNome.getText());
            c.setSobrenome(tfSobrenome.getText());
            c.setEndereco(tfEndereco.getText());
            c.setTelefone(tfTelefone.getText());
            
            if(isAtualizaneitor()){
                cDao.atualizarCliente(c);
            }
            else{
                cDao.inserirCliente(c);
            }
            
            con.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        new ClienteForm().setVisible(true);
    }//GEN-LAST:event_btConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSobrenome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables

    public boolean isAtualizaneitor() {
        return atualizaneitor;
    }

    public void setAtualizaneitor(boolean atualizaneitor) {
        this.atualizaneitor = atualizaneitor;
    }
}
