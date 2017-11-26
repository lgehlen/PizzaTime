package cliente;

import connectionFactory.ConnectionFactory;
import dao.ClienteDao;
import dao.impl.ClienteDaoImpl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gehlen
 */
public class ClienteForm extends javax.swing.JFrame {

    private DefaultTableModel model;

    public ClienteForm() {
        initComponents();
        this.model = new DefaultTableModel();
        tabela.setModel(this.model);
        this.model.addColumn("ID");
        this.model.addColumn("NOME");
        this.model.addColumn("SOBRENOME");
        this.model.addColumn("TELEFONE");
        this.model.addColumn("ENDEREÇO");
        lbErro.setVisible(false);
        imprimeTodos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btBuscarTodos = new javax.swing.JButton();
        btBuscarTelefone = new javax.swing.JButton();
        btBuscarParte = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btBuscarSobrenome = new javax.swing.JButton();
        btNovoPedido = new javax.swing.JButton();
        tfBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        lbErro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(595, 770));
        setResizable(false);
        setSize(getPreferredSize());
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(595, 770));
        jPanel1.setLayout(null);

        btBuscarTodos.setText("BUSCAR TODOS");
        btBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscarTodos);
        btBuscarTodos.setBounds(90, 160, 220, 23);

        btBuscarTelefone.setText("BUSCAR POR TELEFONE");
        btBuscarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscarTelefone);
        btBuscarTelefone.setBounds(310, 160, 220, 23);

        btBuscarParte.setText("BUSCAR POR PARTE DE SOBRENOME");
        btBuscarParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarParteActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscarParte);
        btBuscarParte.setBounds(90, 130, 220, 23);

        btAdicionar.setText("ADICIONAR CLIENTE");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(btAdicionar);
        btAdicionar.setBounds(90, 650, 220, 23);

        btAlterar.setText("ALTERAR CLIENTE");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btAlterar);
        btAlterar.setBounds(310, 650, 220, 23);

        btExcluir.setText("EXCLUIR CLIENTE");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btExcluir);
        btExcluir.setBounds(310, 680, 220, 23);

        btBuscarSobrenome.setText("BUSCAR POR SOBRENOME");
        btBuscarSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarSobrenomeActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscarSobrenome);
        btBuscarSobrenome.setBounds(310, 130, 220, 23);

        btNovoPedido.setText("NOVO PEDIDO");
        jPanel1.add(btNovoPedido);
        btNovoPedido.setBounds(90, 53, 440, 40);

        tfBusca.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(tfBusca);
        tfBusca.setBounds(90, 100, 440, 23);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "SOBRENOME", "TELEFONE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane1.setBounds(90, 200, 440, 410);

        lbErro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbErro.setForeground(new java.awt.Color(255, 0, 0));
        lbErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbErro.setText("PELO MENOS UMA LINHA DEVE SER SELECIONADA");
        jPanel1.add(lbErro);
        lbErro.setBounds(90, 620, 440, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papel.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 595, 770);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 595, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void imprimeTodos() {
        apagaTabela();
        Connection con;
        try {
            con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);
            ClienteDao cDao = new ClienteDaoImpl(con);
            for (Cliente c : cDao.buscarTodos()) {
                this.model.addRow(new Object[]{c.getId(), c.getNome(), c.getSobrenome(), c.getTelefone(), c.getEndereco()});
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

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        new InserirAtualizarClienteForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btBuscarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarTelefoneActionPerformed
        apagaTabela();
        Connection con;
        try {
            con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);
            ClienteDao cDao = new ClienteDaoImpl(con);
            for (Cliente c : cDao.filtrarClienteTelefone(tfBusca.getText())) {
                this.model.addRow(new Object[]{c.getId(), c.getNome(), c.getSobrenome(), c.getTelefone(), c.getEndereco()});
            }
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBuscarTelefoneActionPerformed

    private void btBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarTodosActionPerformed
        imprimeTodos();
        tfBusca.setText("");
    }//GEN-LAST:event_btBuscarTodosActionPerformed

    private void btBuscarParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarParteActionPerformed
        apagaTabela();
        Connection con;
        try {
            con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);
            ClienteDao cDao = new ClienteDaoImpl(con);
            for (Cliente c : cDao.filtrarClienteParteSobrenome(tfBusca.getText())) {
                this.model.addRow(new Object[]{c.getId(), c.getNome(), c.getSobrenome(), c.getTelefone(), c.getEndereco()});
            }
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBuscarParteActionPerformed

    private void btBuscarSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarSobrenomeActionPerformed
        apagaTabela();
        Connection con;
        try {
            con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);
            ClienteDao cDao = new ClienteDaoImpl(con);
            for (Cliente c : cDao.filtrarClienteSobrenome(tfBusca.getText())) {
                this.model.addRow(new Object[]{c.getId(), c.getNome(), c.getSobrenome(), c.getTelefone(), c.getEndereco()});
            }
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InserirAtualizarClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBuscarSobrenomeActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            Cliente c = new Cliente();

            c.setId(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
            c.setNome(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            c.setSobrenome(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            c.setTelefone(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            c.setEndereco(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());

            new InserirAtualizarClienteForm(c).setVisible(true);
            lbErro.setVisible(false);
            this.setVisible(false);
        } catch (Exception ex) {
            lbErro.setVisible(true);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try {
            Connection con;
            try {
                con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);
                new ClienteDaoImpl(con).removerCliente(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
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
    }//GEN-LAST:event_btExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscarParte;
    private javax.swing.JButton btBuscarSobrenome;
    private javax.swing.JButton btBuscarTelefone;
    private javax.swing.JButton btBuscarTodos;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovoPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbErro;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tfBusca;
    // End of variables declaration//GEN-END:variables

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
}
