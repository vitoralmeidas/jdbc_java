package br.vitor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.vitor.jdbc.ConnectionManager;
import br.vitor.library.model.Livro;

public class MySQLLivroDAO implements LivroDAO {

	@Override
	public String listar() throws SQLException, ClassNotFoundException {
		List<String> listaLivros = new ArrayList<>();

		Connection con = ConnectionManager.getInstance().getConnection();

		String query = "SELECT * FROM LIVROS";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			listaLivros.add(rs.getString("nm_livro"));
		}
		con.close();

		
		return listaLivros.toString();
	}

	@Override
	public void inserir(Livro livro) throws SQLException, ClassNotFoundException {
		Connection con = ConnectionManager.getInstance().getConnection();

		PreparedStatement pstmt = con
				.prepareStatement("INSERT INTO LIVROS (NR_PAGINAS, NM_LIVRO, AUTOR, EDITORA) VALUES (?,?,?,?)");
		pstmt.setInt(1, livro.getNumeroPaginas());
		pstmt.setString(2, livro.getNomeLivro());
		pstmt.setString(3, livro.getAutor());
		pstmt.setString(4, livro.getEditora());

		int resultado = pstmt.executeUpdate();
		con.close();

		System.out.println(resultado == 1 ? "Livro Inserido" : "Nao foi possivel inserir o livro");
	}

	@Override
	public void deletar(int idLivro) throws SQLException, ClassNotFoundException {
		Connection con = ConnectionManager.getInstance().getConnection();

		PreparedStatement pstmt = con.prepareStatement("DELETE FROM LIVROS WHERE id = ?");
		pstmt.setInt(1, idLivro);

		int result = pstmt.executeUpdate();
		con.close();

		System.out.println(result == 1 ? "Livro Deletado!" : "Não foi possivel deletar o livro.");
	}

	@Override
	public void update(String novoNomeLivro, String nomeAntigoLivro) throws SQLException, ClassNotFoundException {
		Connection con = ConnectionManager.getInstance().getConnection();

		PreparedStatement pstmt = con.prepareStatement("UPDATE LIVROS SET NM_LIVRO = ? WHERE NM_LIVRO = ?");
		pstmt.setString(1, novoNomeLivro);
		pstmt.setString(2, nomeAntigoLivro);

		int result = pstmt.executeUpdate();
		con.close();

		System.out.println(result == 1 ? "Livro Editado com sucesso!" : "Nao foi possivel editar o livro");
	}

	@Override
	public String getAutorLivro(String nomeLivro) throws SQLException, ClassNotFoundException {
		Connection con = ConnectionManager.getInstance().getConnection();

		PreparedStatement stmt = con.prepareStatement("SELECT AUTOR FROM LIVROS WHERE NM_LIVRO = ?");
		stmt.setString(1, nomeLivro);
		ResultSet rs = stmt.executeQuery();
		String autorName = null;
		while (rs.next()) {
			autorName = rs.getString("autor");
		}

		return autorName;

	}

}
