package controleestoque;

import javax.swing.JOptionPane;

/**
 *
 * @author kauan
 */
public class TelaPrincipal extends javax.swing.JFrame {         
    private ControllerTelaPrincipal controller = new ControllerTelaPrincipal();
    
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridPesquisa = new javax.swing.JTable();
        lbCodigo = new javax.swing.JLabel();
        ipCodigo = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        ipNome = new javax.swing.JTextField();
        lbPreco = new javax.swing.JLabel();
        ipPreco = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbQtdEstoque = new javax.swing.JLabel();
        lbAtivo = new javax.swing.JLabel();
        cbAtivo = new javax.swing.JComboBox<>();
        jsQtdEstoque = new javax.swing.JSpinner();
        btPesquisar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gridPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Quantidade", "Preço", "Ativo?"
            }
        ));
        gridPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridPesquisa.setEnabled(false);
        jScrollPane1.setViewportView(gridPesquisa);

        lbCodigo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbCodigo.setText("Código:");

        ipCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipCodigo.setToolTipText("");
        ipCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipCodigoActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbNome.setText("Nome  :");

        ipNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipNome.setToolTipText("");
        ipNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipNomeActionPerformed(evt);
            }
        });

        lbPreco.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbPreco.setText("Preço   :");

        ipPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipPreco.setToolTipText("");
        ipPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipPrecoActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo.setText("Pesquisar produto");

        lbQtdEstoque.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbQtdEstoque.setText("Quantidade em estoque:");

        lbAtivo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbAtivo.setText("Ativo? . . . . . . . . . . . . . . . . :");

        cbAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Sim", "Não" }));
        cbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAtivoActionPerformed(evt);
            }
        });

        btPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        btPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btPesquisarKeyPressed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(ipCodigo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNome)
                                    .addComponent(lbPreco))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ipNome)
                                    .addComponent(ipPreco)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btPesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btCadastrar)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbQtdEstoque)
                            .addComponent(lbAtivo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jsQtdEstoque)
                            .addComponent(cbAtivo, 0, 80, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(ipCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQtdEstoque)
                    .addComponent(jsQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(ipNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAtivo)
                    .addComponent(cbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPreco)
                    .addComponent(ipPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar)
                    .addComponent(btLimpar)
                    .addComponent(btCadastrar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ipCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipCodigoActionPerformed

    private void ipNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipNomeActionPerformed

    private void ipPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipPrecoActionPerformed

    private void cbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAtivoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        try {
            String codigoTexto = ipCodigo.getText().trim(); 
            int codigo = 0;
            if (!codigoTexto.isEmpty()) {
                codigo = Integer.parseInt(codigoTexto);
            }
            String nome = ipNome.getText();
            String precoTexto = ipPreco.getText().replace(",", ".");
            double preco = Double.parseDouble(precoTexto);
            int qtdEstoque = Integer.parseInt(jsQtdEstoque.getValue().toString());
            int ativo = cbAtivo.getSelectedIndex();

            String mensagemErro = controller.pesquisar(codigo, nome, preco, qtdEstoque, ativo);

            if (mensagemErro != null) {
                JOptionPane.showMessageDialog(this, mensagemErro, "Erro", JOptionPane.ERROR_MESSAGE);
            }      
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O campo Código e preço aceita apenas Números", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        ipCodigo.setText("");
        ipNome.setText("");
        ipPreco.setText("");
        jsQtdEstoque.setValue(0);
        cbAtivo.setSelectedItem("Todos");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btPesquisarKeyPressed
//        controller.pesquisar(ipCodigo.getText(), ipNome.getText(), ipPreco.getText(), jsQtdEstoque.getValue().toString(), cbAtivo.getSelectedIndex());
    }//GEN-LAST:event_btPesquisarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JComboBox<String> cbAtivo;
    private javax.swing.JTable gridPesquisa;
    private javax.swing.JTextField ipCodigo;
    private javax.swing.JTextField ipNome;
    private javax.swing.JTextField ipPreco;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jsQtdEstoque;
    private javax.swing.JLabel lbAtivo;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbQtdEstoque;
    // End of variables declaration//GEN-END:variables
}
