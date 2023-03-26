package br.vitor.dao;

public abstract class DAOFactory {

	public static LivroDAO getLivroDAO() {
		return new MySQLLivroDAO();
	}
	
}
