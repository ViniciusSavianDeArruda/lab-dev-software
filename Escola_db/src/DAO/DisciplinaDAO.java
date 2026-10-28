package DAO;

import beans.Disciplina;
import beans.Professor;
import conexao_db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisciplinaDAO {

    private Conexao conexao;
    private Connection conn;

    public DisciplinaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Disciplina disciplina) {
        String sql = "INSERT INTO Disciplina "+ "(nome, carga_horaria, id_professores) " + "VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, disciplina.getNome());
            stmt.setInt(2, disciplina.getCargaHoraria());
            stmt.setInt(3, disciplina.getProfessor().getId());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(
                "Erro ao inserir disciplina: " + ex.getMessage(), ex
            );
        }
    }

    public Disciplina getDisciplina(int id) {
        String sql = "SELECT * FROM Disciplina WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    Disciplina disciplina = new Disciplina();

                    disciplina.setId(rs.getInt("id"));
                    disciplina.setNome(rs.getString("nome"));
                    disciplina.setCargaHoraria(
                        rs.getInt("carga_horaria")
                    );

                    ProfessorDAO pDAO = new ProfessorDAO();

                    Professor professor = pDAO.getProfessor(
                        rs.getInt("id_professores")
                    );

                    disciplina.setProfessor(professor);

                    return disciplina;
                }
            }

        } catch (SQLException ex) {
            throw new RuntimeException(
                "Erro ao consultar disciplina: " + ex.getMessage(), ex
            );
        }

        return null;
    }

    public void editar(Disciplina disciplina) {
        String sql = "UPDATE Disciplina SET "
                + "nome = ?, carga_horaria = ?, "
                + "id_professores = ? WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, disciplina.getNome());
            stmt.setInt(2, disciplina.getCargaHoraria());
            stmt.setInt(3, disciplina.getProfessor().getId());
            stmt.setInt(4, disciplina.getId());

            int linhas = stmt.executeUpdate();

            if (linhas == 0) {
                throw new IllegalArgumentException("Disciplina não encontrada.");
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar disciplina: " + ex.getMessage(), ex);
        }
    }
}