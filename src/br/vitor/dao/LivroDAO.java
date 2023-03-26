package br.vitor.dao;

import java.sql.SQLException;
import java.util.List;

import br.vitor.library.model.Livro;

public interface LivroDAO {

	String listar() throws SQLException, ClassNotFoundException;
	
	void inserir(Livro livro) throws  SQLException, ClassNotFoundException;
	
	void deletar(int idLivro) throws SQLException, ClassNotFoundException;
	
	void update(String novoNomeLivro,  String nomeAntigoLivro) throws  SQLException, ClassNotFoundException;
	
	String getAutorLivro(String nomeLivro) throws SQLException, ClassNotFoundException;
	
}
