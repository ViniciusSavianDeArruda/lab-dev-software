/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.CategoriaDAO;
import DAO.ProdutoDAO;
import beans.Categoria;
import beans.Produto;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author Adminstrador
 */
public class FormProduto extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormProduto.class.getName());

    public FormProduto() {
        initComponents();
        
        setDefaultCloseOperation(
        javax.swing.WindowConstants.DISPOSE_ON_CLOSE
    );

    preencherComboCategorias();
    
    }
    
    
    private void preencherComboCategorias() {
    CategoriaDAO dao = new CategoriaDAO();

    cmbCategorias.removeAllItems();

    for (Categoria categoria : dao.listar("")) {
        cmbCategorias.addItem(categoria);
    }

    cmbCategorias.setSelectedIndex(-1);
}

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        cmbCategorias = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRO DE PRODUTOS");

        lblId.setText("ID");

        lblNome.setText("Nome");

        lblPreco.setText("Preco");

        lblQuantidade.setText("Quantidade");

        lblCategoria.setText("Categoria");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir ");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnCadastrar)
                        .addGap(28, 28, 28)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidade)
                            .addComponent(lblCategoria))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar)))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar)
                    .addComponent(btnAtualizar))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
    try {
        int id = Integer.parseInt(txtId.getText().trim());

        ProdutoDAO dao = new ProdutoDAO();
        Produto produto = dao.getProduto(id);

        if (produto == null) {
            JOptionPane.showMessageDialog(
                this, "Produto não encontrado!"
            );
            return;
        }

        txtNome.setText(produto.getNome());

        txtPreco.setText(
            produto.getPreco().toString()
        );

        txtQuantidade.setText(
            String.valueOf(produto.getQuantidade())
        );

        cmbCategorias.setSelectedIndex(-1);

        for (int i = 0; i < cmbCategorias.getItemCount(); i++) {
            Categoria categoria = cmbCategorias.getItemAt(i);

            if (produto.getCategoria() != null
                    && categoria.getId() == produto.getCategoria().getId()) {

                cmbCategorias.setSelectedIndex(i);
                break;
            }
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(
            this, "Digite um ID válido!"
        );

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(
            this, "Erro ao consultar produto: " + ex.getMessage()
        );
    }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
    try {
        Produto produto = new Produto();

        produto.setNome(txtNome.getText().trim());

        produto.setPreco(new BigDecimal(
            txtPreco.getText().trim().replace(",", ".")
        ));

        produto.setQuantidade(
            Integer.parseInt(txtQuantidade.getText().trim())
        );

        Categoria categoria = (Categoria) cmbCategorias.getSelectedItem();

        if (produto.getNome().isEmpty()
                || produto.getPreco().compareTo(BigDecimal.ZERO) < 0
                || produto.getQuantidade() < 0
                || categoria == null) {

            JOptionPane.showMessageDialog(
                this, "Preencha todos os campos corretamente!"
            );
            return;
        }

        produto.setCategoria(categoria);

        ProdutoDAO dao = new ProdutoDAO();
        dao.inserir(produto);

        JOptionPane.showMessageDialog(
            this, "Produto cadastrado com sucesso!"
        );

        txtNome.setText("");
        txtPreco.setText("");
        txtQuantidade.setText("");
        txtId.setText("");
        cmbCategorias.setSelectedIndex(-1);

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(
            this, "Preço ou quantidade inválidos!"
        );

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(
            this, "Erro ao cadastrar: " + ex.getMessage()
        );
    }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
    try {
        int id = Integer.parseInt(txtId.getText().trim());
        String nome = txtNome.getText().trim();

        BigDecimal preco = new BigDecimal(
            txtPreco.getText().trim().replace(",", ".")
        );

        int quantidade = Integer.parseInt(
            txtQuantidade.getText().trim()
        );

        Categoria categoria = (Categoria) cmbCategorias.getSelectedItem();

        if (nome.isEmpty()
                || preco.compareTo(BigDecimal.ZERO) < 0
                || quantidade < 0
                || categoria == null) {

            JOptionPane.showMessageDialog(
                this, "Preencha todos os campos corretamente!"
            );
            return;
        }

        ProdutoDAO dao = new ProdutoDAO();

        if (dao.getProduto(id) == null) {
            JOptionPane.showMessageDialog(
                this, "Produto não encontrado!"
            );
            return;
        }

        Produto produto = new Produto();

        produto.setId(id);
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);
        produto.setCategoria(categoria);

        dao.editar(produto);

        JOptionPane.showMessageDialog(
            this, "Produto atualizado com sucesso!"
        );

        txtId.setText("");
        txtNome.setText("");
        txtPreco.setText("");
        txtQuantidade.setText("");
        cmbCategorias.setSelectedIndex(-1);

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(
            this, "ID, preço ou quantidade inválidos!"
        );

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(
            this, "Erro ao atualizar: " + ex.getMessage()
        );
    }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
    try {
        int id = Integer.parseInt(txtId.getText().trim());

        ProdutoDAO dao = new ProdutoDAO();

        Produto produto = dao.getProduto(id);

        if (produto == null) {
            JOptionPane.showMessageDialog(
                this, "Produto não encontrado!"
            );
            return;
        }

        int confirmar = JOptionPane.showConfirmDialog(
            this,
            "Deseja realmente excluir o produto " + produto.getNome() + "?",
            "Confirmar exclusão",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmar == JOptionPane.YES_OPTION) {

            dao.excluir(id);

            JOptionPane.showMessageDialog(
                this, "Produto excluído!"
            );

            txtId.setText("");
            txtNome.setText("");
            txtPreco.setText("");
            txtQuantidade.setText("");
            cmbCategorias.setSelectedIndex(-1);
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(
            this, "Digite um ID válido!"
        );

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(
            this, "Erro ao excluir: " + ex.getMessage()
        );
    }

    }//GEN-LAST:event_btnExcluirActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormProduto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<Categoria> cmbCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
