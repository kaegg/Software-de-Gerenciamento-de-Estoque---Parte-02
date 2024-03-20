package controleestoque.view;

import controleestoque.controller.ControllerPesquisa;
import controleestoque.dao.ExceptionDAO;
import controleestoque.model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kauan
 */
public class TelaPesquisa extends javax.swing.JFrame {         
    private ControllerPesquisa controller = new ControllerPesquisa();
    
    public TelaPesquisa() {
        initComponents();
        editarProduto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPesquisa = new javax.swing.JTable();
        lbCodigo = new javax.swing.JLabel();
        ipCodigo = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        ipNome = new javax.swing.JTextField();
        lbPreco = new javax.swing.JLabel();
        ipPreco = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbQtdEstoque = new javax.swing.JLabel();
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

        jtPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtPesquisa.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jtPesquisa);

        lbCodigo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbCodigo.setText("Código:");

        ipCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipCodigo.setToolTipText("");

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbNome.setText("Nome  :");

        ipNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipNome.setToolTipText("");

        lbPreco.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbPreco.setText("Preço :");

        ipPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipPreco.setToolTipText("");

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo.setText("Pesquisar produto");

        lbQtdEstoque.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbQtdEstoque.setText("Quantidade:");

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
                                .addComponent(lbNome)
                                .addGap(20, 20, 20)
                                .addComponent(ipNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btPesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btCadastrar)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbQtdEstoque)
                                .addGap(18, 18, 18)
                                .addComponent(jsQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPreco)
                                .addGap(18, 18, 18)
                                .addComponent(ipPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ipPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCodigo)
                        .addComponent(ipCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPreco)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome)
                            .addComponent(ipNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbQtdEstoque)
                            .addComponent(jsQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar)
                    .addComponent(btLimpar)
                    .addComponent(btCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String codigo = ipCodigo.getText().trim(); 
        String nome = ipNome.getText().trim();
        String preco = ipPreco.getText().replace(",", ".");
        int qtdEstoque = Integer.parseInt(jsQtdEstoque.getValue().toString());

        DefaultTableModel tablePesquisa = (DefaultTableModel)jtPesquisa.getModel();
        tablePesquisa.setRowCount(0);
        ControllerPesquisa controllerPesquisa = new ControllerPesquisa();
        
        try {
            ArrayList<Produto> produtos = controllerPesquisa.pesquisarProdutos(codigo, nome, preco, qtdEstoque);

            produtos.forEach((Produto produto) -> {
                tablePesquisa.addRow(new Object[]{
                    
                    produto.getCodigo(),
                    produto.getNome(),
                    produto.getDescricao(),
                    produto.getPreco(),
                    produto.getQtdEstoque()
                        
                });
            });
            
            jtPesquisa.setModel(tablePesquisa);
        } catch (ExceptionDAO e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        ipCodigo.setText("");
        ipNome.setText("");
        ipPreco.setText("");
        jsQtdEstoque.setValue(0);
        DefaultTableModel tablePesquisa = (DefaultTableModel)jtPesquisa.getModel();
        tablePesquisa.setRowCount(0);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btPesquisarKeyPressed
        String codigo = ipCodigo.getText().trim(); 
        String nome = ipNome.getText();
        String preco = ipPreco.getText().replace(",", ".");
        int qtdEstoque = Integer.parseInt(jsQtdEstoque.getValue().toString());

        DefaultTableModel tablePesquisa = (DefaultTableModel)jtPesquisa.getModel();
        tablePesquisa.setRowCount(0);
        ControllerPesquisa controllerPesquisa = new ControllerPesquisa();
        
        try {
            ArrayList<Produto> produtos = controllerPesquisa.pesquisarProdutos(codigo, nome, preco, qtdEstoque);

            produtos.forEach((Produto produto) -> {
                tablePesquisa.addRow(new Object[]{
                    
                    produto.getCodigo(),
                    produto.getNome(),
                    produto.getDescricao(),
                    produto.getPreco(),
                    produto.getQtdEstoque()
                        
                });
            });
            
            jtPesquisa.setModel(tablePesquisa);
        } catch (ExceptionDAO e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btPesquisarKeyPressed

    private void editarProduto() {
        DefaultTableModel model = (DefaultTableModel) jtPesquisa.getModel();
        model.addTableModelListener((TableModelEvent e) -> {
        if (e.getType() == TableModelEvent.UPDATE) {
            int linha = e.getFirstRow();
            int coluna = e.getColumn();
            Object valorAntigo = model.getValueAt(linha, coluna);
            
            try {
                String valorNovo = (String) model.getValueAt(linha, coluna);
                String nomeColuna = jtPesquisa.getColumnName(coluna);
                int codigo = (int) model.getValueAt(linha, 0);

                ControllerPesquisa controllerPesquisa = new ControllerPesquisa();
                controllerPesquisa.editarProduto(codigo, nomeColuna, valorNovo);
            } catch (ExceptionDAO ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//                model.setValueAt(valorAntigo, linha, coluna);
            }
        }
    });
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JTextField ipCodigo;
    private javax.swing.JTextField ipNome;
    private javax.swing.JTextField ipPreco;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jsQtdEstoque;
    private javax.swing.JTable jtPesquisa;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbQtdEstoque;
    // End of variables declaration//GEN-END:variables
}
