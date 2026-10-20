/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import DAO.AlunoDAO;
import DAO.ProfessorDAO;
import beans.Aluno;
import beans.Professor;
import conexao_db.Conexao;

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(() -> {new view.MenuPrincipal().setVisible(true); 
      
    });
        Conexao c = new Conexao();
        c.getConexao();
        
        //Aluno a = new Aluno();
        //a.setNome("Vinicius");
        //a.setIdade(22);
        //a.setCurso("Sistemas de Informacao");
        
        //AlunoDAO dao = new AlunoDAO();
        //dao.inserir(a);
        
        //Professor p = new Professor();
        //p.setNome("Mauricio");
        //p.setIdade(34);
        //p.setDisciplina("Jogos Digitais");
        
        //new ProfessorDAO().inserir(p);
        
    }
    
}
