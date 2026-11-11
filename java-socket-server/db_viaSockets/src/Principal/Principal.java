/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
//import DAO.PessoaDAO;
//import beans.Pessoa;
import Conexao_db.Conexao;

public class Principal {
    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.getConexao();    
    }
    
}