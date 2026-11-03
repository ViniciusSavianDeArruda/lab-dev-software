package DAO;

import beans.Produto;
import beans.Categoria;
import conexao_db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Conexao conexao;
    private Connection conn;

    public ProdutoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Produto produto) {
        try {
            String sql = "INSERT INTO Produtos "
                    + "(nome, preco, quantidade, categoria_id) "
                    + "VALUES (?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, produto.getNome());
            stmt.setBigDecimal(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getCategoria().getId());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir produto: " + ex.getMessage());
        }   
    }
    
    
    public Produto getProduto(int id) {
        String sql = "SELECT * FROM Produtos WHERE id = ?";

    try {
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Produto produto = new Produto();

            produto.setId(rs.getInt("id"));
            produto.setNome(rs.getString("nome"));
            produto.setPreco(rs.getBigDecimal("preco"));
            produto.setQuantidade(rs.getInt("quantidade"));

            CategoriaDAO dao = new CategoriaDAO();

            Categoria categoria = dao.getCategoria(
                rs.getInt("categoria_id")
            );

            produto.setCategoria(categoria);

            return produto;
        }

    } catch (SQLException ex) {
        System.out.println("Erro ao consultar produto: " + ex.getMessage());
    }

    return null;
}
    
    public void editar(Produto produto) {
        try {
            String sql = "UPDATE Produtos SET "
                    + "nome = ?, preco = ?, quantidade = ?, "
                    + "categoria_id = ? WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, produto.getNome());
            stmt.setBigDecimal(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getCategoria().getId());
            stmt.setInt(5, produto.getId());

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println(
                "Erro ao atualizar produto: " + ex.getMessage()
            );
        }
    }

    public void excluir(int id) {
        try {
            String sql = "DELETE FROM Produtos WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);


        } catch (SQLException ex) {
            System.out.println(
                "Erro ao excluir produto: " + ex.getMessage()
            );
        }
    }
    
    public List<Produto> listar() {
    List<Produto> produtos = new ArrayList<>();

    String sql = "SELECT * FROM Produtos";

    try {
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Produto produto = new Produto();

            produto.setId(rs.getInt("id"));
            produto.setNome(rs.getString("nome"));
            produto.setPreco(rs.getBigDecimal("preco"));
            produto.setQuantidade(rs.getInt("quantidade"));

            CategoriaDAO cDAO = new CategoriaDAO();
            Categoria categoria = cDAO.getCategoria(
                rs.getInt("categoria_id")
            );

            produto.setCategoria(categoria);

            produtos.add(produto);
        }
    } catch (SQLException ex) {
        System.out.println(
            "Erro ao listar produtos: " + ex.getMessage()
        );
    }

    return produtos;
}
    
    
    public List<Produto> buscarPorNome(String nome) {
    List<Produto> produtos = new ArrayList<>();

    String sql = "SELECT * FROM Produtos WHERE nome LIKE ?";

    try {
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, "%" + nome + "%");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Produto produto = new Produto();

            produto.setId(rs.getInt("id"));
            produto.setNome(rs.getString("nome"));
            produto.setPreco(rs.getBigDecimal("preco"));
            produto.setQuantidade(rs.getInt("quantidade"));

            CategoriaDAO cDAO = new CategoriaDAO();
            Categoria categoria = cDAO.getCategoria(
                rs.getInt("categoria_id")
            );

            produto.setCategoria(categoria);

            produtos.add(produto);
        }
    } catch (SQLException ex) {
        System.out.println(
            "Erro ao buscar produtos por nome: " + ex.getMessage()
        );
    }

    return produtos;
}
   

    
public List<Produto> buscarPorCategoria(String nomeCategoria) {
    List<Produto> produtos = new ArrayList<>();

    String sql = "SELECT * FROM Produtos WHERE categoria_id IN "
            + "(SELECT id FROM Categorias WHERE nome LIKE ?)";

    try {
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, "%" + nomeCategoria + "%");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Produto produto = new Produto();

            produto.setId(rs.getInt("id"));
            produto.setNome(rs.getString("nome"));
            produto.setPreco(rs.getBigDecimal("preco"));
            produto.setQuantidade(rs.getInt("quantidade"));

            CategoriaDAO cDAO = new CategoriaDAO();
            Categoria categoria = cDAO.getCategoria(
                rs.getInt("categoria_id")
            );

            produto.setCategoria(categoria);

            produtos.add(produto);
        }

        rs.close();
        stmt.close();

    } catch (SQLException ex) {
        System.out.println(
            "Erro ao buscar produtos por categoria: " + ex.getMessage()
        );
    }

    return produtos;
}

}