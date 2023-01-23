/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package visao;

import modelo.Quarto;
import controle.ControleQuarto;
import controle.ControleTipo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Tipo;

/**
 *
 * @author aluno
 */
public class TelaManutQuarto extends javax.swing.JDialog {

    /**
     * Creates new form TelaManutQuarto
     */
    ControleQuarto contQuarto = new ControleQuarto();
    ControleTipo contTipo = new ControleTipo();
    List<Tipo> listaTipos = contTipo.listarTodos();

    public TelaManutQuarto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        for (Tipo Tipo : listaTipos) {
            comboTipo.addItem(Tipo.getNome_tipo());
        }

    }
    private boolean editar = false;
    private Quarto q = new Quarto();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumQuartos = new javax.swing.JLabel();
        txtBlocoQuarto = new javax.swing.JLabel();
        jTBlocoQuartos = new javax.swing.JTextField();
        txtTipoQuarto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTNumQuartos = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(222, 178, 151));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quarto.png"))); // NOI18N
        jLabel1.setText("Tela de Controle de Quartos");

        txtNumQuartos.setText("Número do Quarto:");

        txtBlocoQuarto.setText("Bloco do Quarto:");

        txtTipoQuarto.setText("Tipo do Quarto:");

        jPanel1.setBackground(new java.awt.Color(222, 178, 151));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo-cruzado.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);

        jLabel2.setText("Disponibilidade:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Disponível");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Não Disponível");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTNumQuartos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNumQuartosKeyTyped(evt);
            }
        });

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumQuartos)
                                    .addComponent(txtBlocoQuarto)
                                    .addComponent(txtTipoQuarto)
                                    .addComponent(jLabel2)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jTBlocoQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jTNumQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(txtNumQuartos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNumQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBlocoQuarto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTBlocoQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipoQuarto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        if (jTNumQuartos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você não preencheu o numero do quarto ");

        } else if (comboTipo.getSelectedItem().toString().equals("Selecionar")) {

            JOptionPane.showMessageDialog(null, "Você não escolheu o tipo do quarto ");
        } else if (buttonGroup1.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o status do quarto ");

        } else {

            q.setNumero_quarto(Integer.valueOf(jTNumQuartos.getText()));
            q.setBloco(jTBlocoQuartos.getText());
            q.setTipo(contTipo.listarPorNome(comboTipo.getSelectedItem().toString()).get(0));
            // q.setPreco_diaria(Double.valueOf(jTValorDiaria.getText()));
            if (buttonGroup1.getSelection().equals(jRadioButton1.getModel())) {
                q.setStatus("Disponível");
            } else {
                q.setStatus("Em Manutenção");
            }

            if (editar) {
                contQuarto.alterar(q);
            } else {
                contQuarto.inserir(q);
            }
            lipaCampo();

            dispose();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTNumQuartosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNumQuartosKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
//        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
//            jTNumQuartos.setEditable(true);
//            // label.setText("");
//
//        } else {
//            jTNumQuartos.setEditable(false);
//            //label.setText("* Enter only numeric digits(0-9)");
//        }

        if (jTNumQuartos.getText().length() >= 6) {
            evt.consume();
        }

    }//GEN-LAST:event_jTNumQuartosKeyTyped
    private void lipaCampo() {
        jTNumQuartos.setText("");
        jTBlocoQuartos.setText("");

    }

    public void setQuarto(Quarto q) {
        jTNumQuartos.setText(String.valueOf(q.getNumero_quarto()));
        jTBlocoQuartos.setText(String.valueOf(q.getBloco()));
        comboTipo.setSelectedItem(q.getTipo().getNome_tipo());
        if (q.isStatus().equals("Disponivel") || q.isStatus().equals("Disponível")) {
            buttonGroup1.setSelected(jRadioButton1.getModel(), true);
        } else {
            buttonGroup1.setSelected(jRadioButton2.getModel(), true);
        }

        this.q = q;
        editar = true;
        //System.out.println(this.q.toString());
    }

    public void setQuartoView(Quarto q) {
        jTNumQuartos.setText(String.valueOf(q.getNumero_quarto()));
        jTBlocoQuartos.setText(String.valueOf(q.getBloco()));
        comboTipo.setSelectedItem(q.getTipo().getNome_tipo());
        if (q.isStatus().equals("Disponivel") || q.isStatus().equals("Disponível")) {
            buttonGroup1.setSelected(jRadioButton1.getModel(), true);
        } else {
            buttonGroup1.setSelected(jRadioButton2.getModel(), true);
        }

        jTNumQuartos.setEditable(false);
        jTBlocoQuartos.setEditable(false);
        comboTipo.setEditable(false);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        btSalvar.setEnabled(false);
    }

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
            java.util.logging.Logger.getLogger(TelaManutQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaManutQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaManutQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaManutQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaManutQuarto dialog = new TelaManutQuarto(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTBlocoQuartos;
    private javax.swing.JTextField jTNumQuartos;
    private javax.swing.JLabel txtBlocoQuarto;
    private javax.swing.JLabel txtNumQuartos;
    private javax.swing.JLabel txtTipoQuarto;
    // End of variables declaration//GEN-END:variables
}
