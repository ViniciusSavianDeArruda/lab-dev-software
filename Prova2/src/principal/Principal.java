
package principal;

import conexao_db.Conexao;
import java.sql.Connection;

public class Principal {

    public static void main(String[] args) {

        Conexao conexao = new Conexao();

        try (Connection conn = conexao.getConexao()) {

            if (conn != null) {
                System.out.println("Banco conectado com sucesso!");
            } else {
                System.out.println("Falha na conexão!");
            }

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
