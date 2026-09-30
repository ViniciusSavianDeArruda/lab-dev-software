/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Professor;
import conexao_db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Adminstrador
 */
public class ProfessorDAO{
    private Conexao conexao;
    private Connection conn;

    public ProfessorDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Professor professor){
        try {
            String sql = "INSERT INTO professores(nome, idade, disciplina) VALUES (?,?,?);";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,professor.getNome());
            stmt.setInt(2,professor.getIdade());
            stmt.setString(3,professor.getDisciplina());
            
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir professor:"+ex.getMessage());
        }
    } 
}
