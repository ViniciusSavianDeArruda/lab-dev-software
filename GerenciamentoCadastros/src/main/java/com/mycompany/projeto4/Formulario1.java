/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto4;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Formulario1 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Formulario1.class.getName());

    private Arquivo arquivo;
    private List<Pessoa> listaPessoa;
    private int linhaEdicao = -1;
    
    public char sexo;
    
    public Formulario1() {
        initComponents();
        arquivo = new Arquivo("pessoas");
        listaPessoa = arquivo.lerArquivo();
        carregarTabela();
    }
    
    public void carregarTabela(){
        DefaultTableModel tabela = (DefaultTableModel) tbl_Pessoa.getModel();
        
        tabela.setRowCount(0);
        
        for(Pessoa p : listaPessoa){
            tabela.addRow(p.obterDados());
 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGlp_Sexo = new javax.swing.ButtonGroup();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        rdo_masculino = new javax.swing.JRadioButton();
        rdo_feminino = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        lblIdiomas = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Pessoa = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        lblSexo.setText("Sexo");

        btnGlp_Sexo.add(rdo_masculino);
        rdo_masculino.setText("Masculino");
        rdo_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_masculinoActionPerformed(evt);
            }
        });

        btnGlp_Sexo.add(rdo_feminino);
        rdo_feminino.setText("Feminino");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblIdiomas.setText("Idiomas");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Brasil", "ingles", "espanhol" }));

        tbl_Pessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sexo", "Idioma"
            }
        ));
        jScrollPane3.setViewportView(tbl_Pessoa);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblSexo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdo_masculino)
                                .addGap(18, 18, 18)
                                .addComponent(rdo_feminino))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblIdiomas)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(rdo_masculino)
                    .addComponent(rdo_feminino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdiomas)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void rdo_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_masculinoActionPerformed
        
    }//GEN-LAST:event_rdo_masculinoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(rdo_masculino.isSelected()){
            sexo = 'M';
        }
        else if(rdo_feminino.isSelected()){
           sexo = 'F';
        }
         else {
            JOptionPane.showMessageDialog(null, "Selecione um sexo", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
}
        Pessoa p = new Pessoa(txtNome.getText(), sexo, jComboBox1.getSelectedItem().toString());
        arquivo.adicionarPessoa(p);
        arquivo.gravarAquivo();
        listaPessoa = arquivo.lerArquivo();
        carregarTabela();
         
        txtNome.setText("");
        btnGlp_Sexo.clearSelection();
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tbl_Pessoa.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma pessoa na tabela.", "Atenção", JOptionPane.WARNING_MESSAGE);
        return;
    }

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esta pessoa?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
        arquivo.removerPessoa(linha);
        arquivo.gravarAquivo();
        listaPessoa = arquivo.lerArquivo();
        carregarTabela();
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tbl_Pessoa.getSelectedRow();
        
        if (linha == -1) {
            JOptionPane.showMessageDialog(null,"Selecione uma pessoa para editar.");
        return;
    }

        linhaEdicao = linha;
        Pessoa p = listaPessoa.get(linha);

        txtNome.setText(p.nome);

        if (p.sexo == 'M') {
        rdo_masculino.setSelected(true);
    } else {
        rdo_feminino.setSelected(true);
    }

        jComboBox1.setSelectedItem(p.idioma);
    
    }//GEN-LAST:event_btnEditarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Formulario1().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btnGlp_Sexo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIdiomas;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JRadioButton rdo_feminino;
    private javax.swing.JRadioButton rdo_masculino;
    private javax.swing.JTable tbl_Pessoa;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}