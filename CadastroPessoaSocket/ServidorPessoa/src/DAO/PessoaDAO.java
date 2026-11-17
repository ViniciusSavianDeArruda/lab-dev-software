
package dao;

import beans.Pessoa;
import conexao.Conexao_db;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PessoaDAO {

    public String cadastrar(Pessoa pessoa) {

        String sql = "INSERT INTO pessoas (nome, sexo, idioma) VALUES (?, ?, ?)";

        try {
            Connection conn = new Conexao_db().getConexao();

            if (conn == null) {
                return "Erro: Não foi possível conectar ao banco de dados.";
            }

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());

            stmt.executeUpdate();

            stmt.close();
            conn.close();

            return "Pessoa cadastrada com sucesso!";

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar pessoa: " + e.getMessage());
            return "Erro ao cadastrar pessoa: " + e.getMessage();
        }
    }
}
