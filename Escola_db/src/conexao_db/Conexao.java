/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao_db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adminstrador
 */
public class Conexao {
    public Connection getConexao(){
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/escola_db_laboratoriodesoftware?"
                            + "userTimeZone=true&serverTimeZone=UTC",
                    "root","admin");
            System.out.println("Conexão efetuada!");
            return conn;
        } catch (Exception e) {
            System.out.println("Erro ao conectar no BD"+e.getMessage());
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
        return  null;
    }
    
}
