/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package visao;

import controle.ControleHospedagem;
import controle.Conversoes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Hospedagem;
import modelo.Produto;

/**
 *
 * @author aluno
 */
public class TelaHospedagem extends javax.swing.JDialog {

    /**
     * Creates new form TelaHospedagem
     */
    public TelaHospedagem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tbHospedagem.getColumnModel().getColumn(0).setPreferredWidth(170);
        tbHospedagem.getColumnModel().getColumn(1).setPreferredWidth(95);
        tbHospedagem.getColumnModel().getColumn(2).setPreferredWidth(20);
        tbHospedagem.getColumnModel().getColumn(3).setPreferredWidth(40);
        tbHospedagem.getColumnModel().getColumn(4).setPreferredWidth(40);

        atualizaTabela(true);

    }

    ArrayList<Hospedagem> listaHospedagem = new ArrayList<>();
    ControleHospedagem contHospedagem = new ControleHospedagem();
    Conversoes con = new Conversoes();

    private void atualizaTabela(boolean flag) {
        // pega o modelo da tabela, que foi definido para 
        // a inclusão dos dados
        DefaultTableModel modelo = (DefaultTableModel) tbHospedagem.getModel();

        // enquanto houver linhas na tabela
        if (flag) {
            listaHospedagem.clear();
            listaHospedagem.addAll(contHospedagem.listarPorStatus("Aberto"));

        }

        while (modelo.getRowCount() > 0) {
            // apaga a primeira linha
            modelo.removeRow(0);
        }

        // percorre o ArrayList de salas
        for (Hospedagem h : listaHospedagem) {

            // adiciona uma linha na tabela
            // o object criado tem que ter a mesma quantidade
            // de elementos que foi definida na tabela, 
            // como também os mesmos tipos
            modelo.addRow(new Object[]{h.getHospede().getNome(), h.getQuarto().getNumero_quarto(), h.getQtd_diaria(), con.dataToString(h.getDataCheckin()), con.dataToString(h.getDataCheckout())});
        }

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
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHospedagem = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btVisualizar = new javax.swing.JButton();
        jComboFiltro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btListFechadas = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(222, 178, 151));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-hotel-room-96.png"))); // NOI18N
        jLabel1.setText("Hospedagem");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        tfPesquisar.setToolTipText("Pesquisa de hospedagens, pode ser consultadoas por nome do hospede, cpf do hospede, número do quarto ou nome do funcionario!");
        tfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarActionPerformed(evt);
            }
        });
        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyReleased(evt);
            }
        });

        tbHospedagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Hospede", "Quarto", "Diarias", "Data Check-In", "Data Check-out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbHospedagem);

        jPanel3.setBackground(new java.awt.Color(222, 178, 151));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(btCadastrar);

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar-arquivo.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btEditar);

        btVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visualizador-de-dados.png"))); // NOI18N
        btVisualizar.setText("Visualizar");
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btVisualizar);

        jComboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome Hospede", "CPF Hospede", "Numero Quarto", "Nome Funcionario", " " }));

        jLabel2.setText("Pesquisar Hospedagens:");

        jLabel3.setText("Filtro:");

        btListFechadas.setText("Listar Hospedagens Fechadas");
        btListFechadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListFechadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btListFechadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboFiltro, 0, 152, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btListFechadas)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:

        TelaManutHospedagem telaMH = new TelaManutHospedagem(null, true);
        telaMH.disableButoonsConsumo(false);
        telaMH.setVisible(true);
        atualizaTabela(true);
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:

        if (tbHospedagem.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Você Não Selecionou Nenhuma Hospedagem");
        } else {
            TelaManutHospedagem telaMH = new TelaManutHospedagem(null, true);

            int posicao = tbHospedagem.getSelectedRow();
            Hospedagem h = listaHospedagem.get(posicao);
            telaMH.disableButoonsConsumo(true);
            telaMH.setHospedagem(h);
            telaMH.setEditHospedagem(h);
            telaMH.setVisible(true);
            atualizaTabela(true);
        }

    }//GEN-LAST:event_btEditarActionPerformed

    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarActionPerformed
        // TODO add your handling code here:

        if (tbHospedagem.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Você Não Selecionou Nenhuma Hospedagem");
        } else {
            TelaManutHospedagem telaMH = new TelaManutHospedagem(null, true);

            int posicao = tbHospedagem.getSelectedRow();

            // pega o patrimonio  na lista de patrimonios
            Hospedagem h = listaHospedagem.get(posicao);
            telaMH.disableButoonsConsumo(false);
            telaMH.setEditHospedagemView(h);

            telaMH.setVisible(true);

        }
    }//GEN-LAST:event_btVisualizarActionPerformed

    private void tfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyReleased
        // TODO add your handling code here:

        if (tfPesquisar.getText().equals("")) {
            atualizaTabela(true);
        } else {
            listaHospedagem.clear();

            switch (jComboFiltro.getSelectedItem().toString()) {
                case "Nome Hospede":
                    listaHospedagem.addAll(contHospedagem.listarPorNomeHospede(tfPesquisar.getText()));
                    break;
                case "CPF Hospede":
                    listaHospedagem.addAll(contHospedagem.listarPorCPFHospede(tfPesquisar.getText()));
                    break;

                case "Numero Quarto":
                    listaHospedagem.addAll(contHospedagem.listarPorNumeroQuarto(Integer.valueOf(tfPesquisar.getText())));
                    break;

                case "Nome Funcionario":
                    listaHospedagem.addAll(contHospedagem.listarPorNomeFuncionario(tfPesquisar.getText()));
                    break;
            }

            atualizaTabela(false);
        }
    }//GEN-LAST:event_tfPesquisarKeyReleased

    private void btListFechadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListFechadasActionPerformed
        // TODO add your handling code here:
        listaHospedagem.clear();
        listaHospedagem.addAll(contHospedagem.listarPorStatus("Finalizado"));
        atualizaTabela(false);
    }//GEN-LAST:event_btListFechadasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaHospedagem dialog = new TelaHospedagem(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btListFechadas;
    private javax.swing.JButton btVisualizar;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbHospedagem;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
