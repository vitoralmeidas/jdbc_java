package br.vitor.library.bo;

import java.sql.SQLException;

import br.vitor.dao.DAOFactory;
import br.vitor.dao.LivroDAO;
import br.vitor.library.model.Livro;

public class LivroBO {


	private LivroDAO dao = DAOFactory.getLivroDAO();
	
	public String listar() throws ClassNotFoundException, SQLException{
		return dao.listar();
	}
	
	public void inserir(Livro livro) throws ClassNotFoundException, SQLException {
		dao.inserir(livro);
	}
	
	public void deletar(int idLivro) throws ClassNotFoundException, SQLException {
		dao.deletar(idLivro);
	}
	
	public void update(String novoNomeLivro, String nomeAntigoLivro) throws ClassNotFoundException, SQLException {
		dao.update(novoNomeLivro, nomeAntigoLivro);
	}
	
	public String getAutorLivro(String nomeLivro) throws ClassNotFoundException, SQLException {
		return dao.getAutorLivro(nomeLivro);
	}
}
