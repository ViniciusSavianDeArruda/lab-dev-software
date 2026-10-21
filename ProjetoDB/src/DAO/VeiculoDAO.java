package DAO;

import beans.Pessoa;
import beans.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projetodb.Conexao;

/**
 *
 * @author laboratorio
 */
public class VeiculoDAO {
    private Conexao conexao;
    private Connection conn;
    
    public VeiculoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Veiculo veiculo){
        String sql = "INSERT INTO veiculo (modelo, placa, id_pessoa) VALUES (?, ?, ?);";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, veiculo.getModelo());
            stmt.setString(2, veiculo.getPlaca());
            stmt.setInt(3, veiculo.getPessoaid().getId());
            
            stmt.execute();
            stmt.close();
            System.out.println("Veiculo inserido com sucesso!");
        } catch(SQLException ex){
            System.out.println("Erro ao inserir veiculo: " + ex.getMessage());
        }    
    }
    
    public void editar(Veiculo veiculo){
        String sql = "UPDATE veiculo SET modelo = ?, placa = ?, id_pessoa = ? WHERE id = ?";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, veiculo.getModelo());
            stmt.setString(2, veiculo.getPlaca());
            stmt.setInt(3, veiculo.getPessoaid().getId());
            stmt.setInt(4, veiculo.getId());
            
            stmt.execute();
            stmt.close();
            System.out.println("Veiculo atualizado com sucesso!");
            
        } catch(SQLException ex){
            System.out.println("Erro ao atualizar Veiculo: " + ex.getMessage());
        }
    }
    
    public void excluir(int id){
        String sql = "DELETE FROM veiculo WHERE id = ?";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
            System.out.println("Veiculo excluido com sucesso!");
            
        } catch(SQLException ex){
            System.out.println("Erro ao excluir Veiculo: " + ex.getMessage());
        }
    }
    
    public List<Veiculo> getVeiculos() {
        String sql = "SELECT * FROM veiculo";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Veiculo> listaVeiculos = new ArrayList<>(); 
            
            while (rs.next()) {
                Veiculo v = new Veiculo();
                
                v.setId(rs.getInt("id"));
                v.setModelo(rs.getString("modelo"));
                v.setPlaca(rs.getString("placa"));
                
                PessoaDAO pDAO = new PessoaDAO();
                Pessoa p = pDAO.getPessoa(rs.getInt("id_pessoa"));
                v.setPessoaid(p);
                
                listaVeiculos.add(v);
            }
            stmt.close();
            rs.close();
            return listaVeiculos;
            
        } catch (SQLException ex) {
            
            System.out.println("Erro ao consultar veículos: " + ex.getMessage());
            return null;
        }
    }
}