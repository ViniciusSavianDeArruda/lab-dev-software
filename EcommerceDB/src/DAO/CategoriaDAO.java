package DAO;

import beans.Categoria;
import conexao_db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    private Conexao conexao;
    private Connection conn;

    public CategoriaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Categoria categoria) {
        try {
            String sql = "INSERT INTO Categorias(nome) VALUES (?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, categoria.getNome());

            stmt.execute();

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir uma categoria: " + ex.getMessage());
        }
    }
    
    public Categoria getCategoria(int id) {
        String sql = "SELECT * FROM Categorias WHERE id = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Categoria categoria = new Categoria();

                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                
                return categoria;
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao consultar categoria: " + ex.getMessage());
        }

        return null;
    }
    
    
    public void editar(Categoria categoria) {
        try {
            String sql =
                    "UPDATE Categorias SET nome = ? WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, categoria.getNome());
            stmt.setInt(2, categoria.getId());
            
            stmt.execute();

        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar categoria: " + ex.getMessage());
        }
    }
    
  
    public List<Categoria> listar(String nome) {
        List<Categoria> categorias = new ArrayList<>();

        String sql = "SELECT * FROM Categorias WHERE nome LIKE ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, "%" + nome + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria categoria = new Categoria();

                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));

                categorias.add(categoria);
            }

            rs.close();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println(
                "Erro ao listar categorias: " + ex.getMessage()
            );
        }

        return categorias;
}

    
    
}