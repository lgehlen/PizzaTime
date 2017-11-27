package tipo;

import connectionFactory.ConnectionFactory;
import dao.impl.TipoDaoImpl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import dao.TipoDao;
import javax.swing.JFrame;

/**
 *
 * @author Gehlen
 */
public class TipoForm extends javax.swing.JFrame {

    private float s;
    private float e;
    private float p;
    private JFrame parental;

    public TipoForm(JFrame p) {
        this.parental = p;
        initComponents();
        imprimeValores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfPremium = new javax.swing.JTextField();
        tfSimples = new javax.swing.JTextField();
        tfEspecial = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(getPreferredSize());

        jPanel1.setLayout(null);
        jPanel1.add(tfPremium);
        tfPremium.setBounds(20, 180, 460, 20);
        jPanel1.add(tfSimples);
        tfSimples.setBounds(20, 80, 460, 20);
        jPanel1.add(tfEspecial);
        tfEspecial.setBounds(20, 130, 460, 20);

        jButton1.setText("ATUALIZAR VALORES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 230, 230, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABELA DE PREÇOS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 460, 40);

        jLabel2.setText("Premium:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 160, 460, 14);

        jLabel3.setText("Simples:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 60, 460, 14);

        jLabel4.setText("Especial:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 460, 14);

        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);
        btCancelar.setBounds(20, 230, 230, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!tfSimples.getText().equals(Float.toString(this.s))
                || !tfEspecial.getText().equals(Float.toString(this.e))
                || !tfPremium.getText().equals(Float.toString(this.p))) {
            try {
                this.s = Float.parseFloat(tfSimples.getText());
                try {
                    this.e = Float.parseFloat(tfEspecial.getText());
                    try {
                        this.p = Float.parseFloat(tfPremium.getText());
                        insereValor();
                    } catch (NumberFormatException e) {
                        System.out.println("MOSTRAR ERRO PREMIUM");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("MOSTRAR ERRO ESPECIAL");
                }
            } catch (NumberFormatException e) {
                System.out.println("MOSTRAR ERRO SIMPLES");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
        this.parental.setEnabled(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    public void imprimeValores() {
        Connection con;
        try {
            con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);

            TipoDao t = new TipoDaoImpl(con);

            this.s = t.getPrecoSimples();
            this.e = t.getPrecoEspecial();
            this.p = t.getPrecoPremium();
            
            if(!tfSimples.getText().equals(Float.toString(this.s)))
                tfSimples.setText(Float.toString(this.s));
            if(!tfEspecial.getText().equals(Float.toString(this.e)))
                tfEspecial.setText(Float.toString(this.e));
            if(!tfPremium.getText().equals(Float.toString(this.p)))
                tfPremium.setText(Float.toString(this.p));

            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TipoForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TipoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insereValor() {
        Connection con;
        try {
            con = ConnectionFactory.getConnection("jdbc:mysql://localhost:3306/db_pizza", "root", "root", ConnectionFactory.MYSQL);

            TipoDao t = new TipoDaoImpl(con);

            t.setPrecoSimples(this.s);
            t.setPrecoEspecial(this.e);
            t.setPrecoPremium(this.p);

            tfSimples.setText(Float.toString(this.s));
            tfEspecial.setText(Float.toString(this.e));
            tfPremium.setText(Float.toString(this.p));

            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TipoForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TipoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfEspecial;
    private javax.swing.JTextField tfPremium;
    private javax.swing.JTextField tfSimples;
    // End of variables declaration//GEN-END:variables
}
