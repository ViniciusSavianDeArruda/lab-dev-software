
package conexao_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection getConexao() {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Prova_db2","root","admin"
            );

            System.out.println("Conexão efetuada!");
            return conn;

        } catch (SQLException ex) {
            System.out.println(
                "Erro ao conectar no BD: " + ex.getMessage()
            );
            return null;
        }
    }
}
