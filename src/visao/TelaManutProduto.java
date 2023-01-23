/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package visao;

import controle.ControleProduto;
import javax.swing.JOptionPane;
import modelo.Produto;

/**
 *
 * @author aluno
 */
public class TelaManutProduto extends javax.swing.JDialog {

    private boolean editar = false;
    private Produto p = new Produto();
    /**
     * Creates new form TelaManutProduto
     */
    ControleProduto contProduto = new ControleProduto();

    public TelaManutProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tfNomeP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        tfQTD = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        tfValor = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(222, 178, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-produto-50.png"))); // NOI18N
        jLabel1.setText("Tela De Controle De Produtos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 437, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, 437, 10));

        jLabel2.setText("Nome do Produto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, -1, -1));
        jPanel1.add(tfNomeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 114, 180, -1));

        jLabel3.setText("Descrição:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 156, -1, -1));

        tfDescricao.setColumns(20);
        tfDescricao.setRows(5);
        jScrollPane1.setViewportView(tfDescricao);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, 437, -1));

        jLabel4.setText("Quantidade:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 294, -1, -1));

        tfQTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQTDActionPerformed(evt);
            }
        });
        tfQTD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfQTDKeyTyped(evt);
            }
        });
        jPanel1.add(tfQTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 318, 79, -1));

        jLabel5.setText("Valor do Produto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 366, -1, -1));

        tfValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfValorKeyTyped(evt);
            }
        });
        jPanel1.add(tfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 390, 140, -1));

        jPanel2.setBackground(new java.awt.Color(222, 178, 151));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btSalvar);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo-cruzado.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btCancelar);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 443, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfQTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQTDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQTDActionPerformed
    private void limparCampo() {
        tfNomeP.setText("");
        tfDescricao.setText("");
        tfQTD.setText("");
        tfValor.setText("");
    }

    public void setProduto(Produto p) {
        tfNomeP.setText(String.valueOf(p.getNome_produto()));
        tfDescricao.setText(String.valueOf(p.getDescricao()));
        tfQTD.setText(String.valueOf(p.getQtd()));
        tfValor.setText(String.valueOf(p.getValor()));

        this.p = p;
        editar = true;
        //System.out.println(this.q.toString());
    }

    public void setProdutoView(Produto pr) {
        tfNomeP.setText(String.valueOf(pr.getNome_produto()));
        tfDescricao.setText(String.valueOf(pr.getDescricao()));
        tfQTD.setText(String.valueOf(pr.getQtd()));
        tfValor.setText(String.valueOf(pr.getValor()));

        tfNomeP.setEditable(false);
        tfDescricao.setEditable(false);
        tfQTD.setEditable(false);
        tfValor.setEditable(false);
        btSalvar.setEnabled(false);
    }
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (tfNomeP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você não preencheu o nome do Produto ");
        } else if (tfDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você não preencheu a descrição do Produto ");
        } else if (tfQTD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você não preencheu a quantidade do Produto ");
        } else if (tfValor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você não preencheu o preço do Produto ");
        } else {
            p.setNome_produto(tfNomeP.getText());
            p.setDescricao(tfDescricao.getText());
            p.setQtd(Integer.valueOf(tfQTD.getText()));
            p.setValor(Double.parseDouble(tfValor.getText()));

            if (editar) {
                contProduto.alterar(p);
            } else {
                contProduto.inserir(p);
            }
            limparCampo();

            dispose();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfQTDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQTDKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfQTDKeyTyped

    private void tfValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE) || (c == '.'))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfValorKeyTyped

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
            java.util.logging.Logger.getLogger(TelaManutProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaManutProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaManutProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaManutProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaManutProduto dialog = new TelaManutProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea tfDescricao;
    private javax.swing.JTextField tfNomeP;
    private javax.swing.JFormattedTextField tfQTD;
    private javax.swing.JFormattedTextField tfValor;
    // End of variables declaration//GEN-END:variables
}