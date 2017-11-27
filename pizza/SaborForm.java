/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import cliente.ClienteForm;
import cliente.InserirAtualizarClienteForm;
import connectionFactory.ConnectionFactory;
import dao.ClienteDao;
import dao.SaborDao;
import dao.impl.ClienteDaoImpl;
import dao.impl.SaborDaoImpl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import sabor.Sabor;

/**
 *
 * @author Gehlen
 */
public class SaborForm extends javax.swing.JFrame {

    private DefaultTableModel model;
    private JFrame parental;

    public SaborForm(JFrame p) {
        initComponents();
        this.parental = p;
        this.model = new DefaultTableModel();
        tabela.setModel(this.model);
        this.model.addColumn("ID");
        this.model.addColumn("SABOR");
        this.model.addColumn("TIPO");
        lbErro.setVisible(false);
        rbSimples.setSelected(true);
        lbInvalido.setVisible(false);
        imprimeTodos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btBuscar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btMostrar = new javax.swing.JButton();
        btCriar = new javax.swing.JButton();
        tfBuscar = new javax.swing.JTextField();
        tfInserir = new javax.swing.JTextField();
        rbSimples = new javax.swing.JRadioButton();
        rbEspecial = new javax.swing.JRadioButton();
        rbPremium = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbErro = new javax.swing.JLabel();
        lbInvalido = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SABOR", "TIPO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setToolTipText("");
        jScrollPane1.setViewportView(tabela);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 480, 280);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 350, 800, 10);

        btBuscar.setText("BUSCAR");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscar);
        btBuscar.setBounds(500, 20, 280, 23);

        btDeletar.setText("DELETAR");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(btDeletar);
        btDeletar.setBounds(500, 60, 280, 23);

        btMostrar.setText("MOSTRAR TODOS");
        btMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btMostrar);
        btMostrar.setBounds(500, 100, 280, 23);

        btCriar.setText("CRIAR SABOR");
        btCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarActionPerformed(evt);
            }
        });
        jPanel1.add(btCriar);
        btCriar.setBounds(20, 560, 760, 23);

        tfBuscar.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel1.add(tfBuscar);
        tfBuscar.setBounds(10, 20, 480, 23);

        tfInserir.setPreferredSize(new java.awt.Dimension(60, 23));
        jPanel1.add(tfInserir);
        tfInserir.setBounds(20, 390, 760, 23);

        rbSimples.setText("Simples");
        rbSimples.setOpaque(false);
        rbSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSimplesActionPerformed(evt);
            }
        });
        jPanel1.add(rbSimples);
        rbSimples.setBounds(20, 460, 760, 23);

        rbEspecial.setText("Especial");
        rbEspecial.setOpaque(false);
        rbEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEspecialActionPerformed(evt);
            }
        });
        jPanel1.add(rbEspecial);
        rbEspecial.setBounds(20, 490, 750, 23);

        rbPremium.setText("Premium");
        rbPremium.setOpaque(false);
        rbPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPremiumActionPerformed(evt);
            }
        });
        jPanel1.add(rbPremium);
        rbPremium.setBounds(20, 520, 750, 23);

        jLabel1.setText("Tipo:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 440, 290, 14);

        jLabel2.setText("Novo sabor:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 370, 760, 14);

        lbErro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbErro.setForeground(new java.awt.Color(255, 51, 0));
        lbErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbErro.setText("SELECIONE AO MENOS UM SABOR");
        lbErro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbErro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(lbErro);
        lbErro.setBounds(500, 140, 280, 30);

        lbInvalido.setForeground(new java.awt.Color(255, 0, 0));
        lbInvalido.setText("VALOR INVÁLIDO");
        jPanel1.add(lbInvalido);
        lbInvalido.setBounds(20, 420, 760, 14);

        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);
        btCancelar.setBounds(500, 310, 280, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 600);

        jLabel3.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSimplesActionPerformed
        rbEspecial.setSelected(false);
        rbPremium.setSelected(false);
    }//GEN-LAST:event_rbSimplesActionPerformed

    private void rbEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEspecialActionPerformed
        rbSimples.setSelected(false);
        rbPremium.setSelected(false);
    }//GEN-LAST:event_rbEspecialActionPerformed

    private void rbPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPremiumActionPerformed
        rbSimples.setSelected(false);
        rbEspecial.setSelected(false);
    }//GEN-LAST:event_rbPremiumActionPerformed

    private void btCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarActionPerformed
        if (!tfInserir.getText().equals("")) {
            lbInvalido.setVisible(false);
            Connection con;
            try {
                con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);
                SaborDao sDao = new SaborDaoImpl(con);

                Sabor s = new Sabor();

                int tipo = 1;
                if (rbEspecial.isSelected()) {
                    tipo = 2;
                } else if (rbPremium.isSelected()) {
                    tipo = 3;
                }

                s.setNome(tfInserir.getText());
                s.setTipo(tipo);

                sDao.inserirSabor(s);

                con.close();
                imprimeTodos();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            lbInvalido.setVisible(true);
        }
    }//GEN-LAST:event_btCriarActionPerformed

    private void btMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarActionPerformed
        imprimeTodos();
        tfBuscar.setText("");
    }//GEN-LAST:event_btMostrarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        try {
            Connection con;
            try {
                con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);
                new SaborDaoImpl(con).removerSabor(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
                con.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            lbErro.setVisible(false);
            imprimeTodos();
        } catch (Exception ex) {
            lbErro.setVisible(true);
        }
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        apagaTabela();
        Connection con;
        try {
            con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);
            SaborDao sDao = new SaborDaoImpl(con);
            String str=null;
            for (Sabor s : sDao.buscarParcial(tfBuscar.getText())) {
                if(s.getTipo() == 1)
                    str = "Simples";
                if(s.getTipo() == 2)
                    str = "Especial";
                if(s.getTipo() == 3)
                    str = "Premium";
                this.model.addRow(new Object[]{s.getId(), s.getNome(), str});
            }
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
        this.parental.setEnabled(true);
    }//GEN-LAST:event_btCancelarActionPerformed
    public void imprimeTodos() {
        apagaTabela();
        Connection con;
        try {
            con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);
            SaborDao sDao = new SaborDaoImpl(con);
            String str=null;
            for (Sabor s : sDao.buscarTodos()) {
                if(s.getTipo() == 1)
                    str = "Simples";
                if(s.getTipo() == 2)
                    str = "Especial";
                if(s.getTipo() == 3)
                    str = "Premium";
                this.model.addRow(new Object[]{s.getId(), s.getNome(), str});
            }
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void apagaTabela() {
        int rowCount = this.model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            this.model.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCriar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbInvalido;
    private javax.swing.JRadioButton rbEspecial;
    private javax.swing.JRadioButton rbPremium;
    private javax.swing.JRadioButton rbSimples;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfInserir;
    // End of variables declaration//GEN-END:variables
}
