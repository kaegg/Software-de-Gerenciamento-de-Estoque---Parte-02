package controleestoque.view;

import controleestoque.controller.ControllerTelaCadastro;
import controleestoque.dao.ExceptionDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author kauan
 */
public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbQtdEstoque = new javax.swing.JLabel();
        jsQtdEstoque = new javax.swing.JSpinner();
        lbCodigo = new javax.swing.JLabel();
        ipCodigo = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        ipNome = new javax.swing.JTextField();
        lbPreco = new javax.swing.JLabel();
        ipPreco = new javax.swing.JTextField();
        lbDescricao = new javax.swing.JLabel();
        ipDescricao = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo.setText("Cadastrar produto");

        lbQtdEstoque.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbQtdEstoque.setText("Quantidade:");

        lbCodigo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbCodigo.setText("Código . . :");

        ipCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipCodigo.setToolTipText("");

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbNome.setText("Nome . . . :");

        ipNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipNome.setToolTipText("");

        lbPreco.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbPreco.setText("Preço . . . . . :");

        ipPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipPreco.setToolTipText("");

        lbDescricao.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbDescricao.setText("Descrição:");

        ipDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ipDescricao.setToolTipText("");

        btSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        btSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btSalvarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCodigo)
                                .addComponent(lbNome))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ipCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(ipNome))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbQtdEstoque)
                                    .addGap(18, 18, 18)
                                    .addComponent(jsQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbPreco)
                                    .addGap(18, 18, 18)
                                    .addComponent(ipPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbDescricao)
                            .addGap(18, 18, 18)
                            .addComponent(ipDescricao))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbCodigo)
                            .addGap(17, 17, 17)
                            .addComponent(lbNome))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ipCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(ipNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ipPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPreco))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbQtdEstoque)
                            .addComponent(jsQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(ipDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btSalvar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        cadastrarProduto();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btSalvarKeyPressed
        cadastrarProduto();
    }//GEN-LAST:event_btSalvarKeyPressed

    private void cadastrarProduto(){
        String codigo = ipCodigo.getText().trim(); 
        String nome = ipNome.getText().trim();
        String descricao = ipDescricao.getText().trim();
        String preco = ipPreco.getText().replace(",", ".");
        int qtdEstoque = Integer.parseInt(jsQtdEstoque.getValue().toString());
        
        try{
            boolean cadastrou = new ControllerTelaCadastro().cadastrarProduto(codigo, nome, descricao, preco, qtdEstoque);
            
            if(cadastrou){
                JOptionPane.showMessageDialog(null, "Produto " + codigo + " cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE); 
                ipCodigo.setText("");
                ipNome.setText("");
                ipDescricao.setText("");
                ipPreco.setText("");
                jsQtdEstoque.setValue(0);
            }
        }catch(ExceptionDAO e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField ipCodigo;
    private javax.swing.JTextField ipDescricao;
    private javax.swing.JTextField ipNome;
    private javax.swing.JTextField ipPreco;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jsQtdEstoque;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbQtdEstoque;
    // End of variables declaration//GEN-END:variables
}
