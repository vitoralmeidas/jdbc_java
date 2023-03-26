package br.vitor.test;

import java.sql.SQLException;

import br.vitor.library.bo.LivroBO;
import br.vitor.library.model.Livro;

public class Play {

	public static void main(String[] args) {

		Livro testLivro = new Livro();
		testLivro.setAutor("G. Martin");
		testLivro.setEditora("Arqueiro");
		testLivro.setNumeroPaginas(200);
		testLivro.setNomeLivro("Guerra dos Tronos");

		Livro testLivro2 = new Livro();
		testLivro2.setAutor("Lucy Ferry");
		testLivro2.setEditora("Globo");
		testLivro2.setNumeroPaginas(350);
		testLivro2.setNomeLivro("Aprenda a Viver");

		LivroBO livroBO = new LivroBO();

		try {
			// insert
//			livroBO.inserir(testLivro);

			// get
			//String autor = livroBO.getAutorLivro(testLivro2.getNomeLivro());
			//System.out.println(autor);
			
			//delete
			//livroBO.deletar(3);
			
			//update
			
			livroBO.update("Como Ser Feliz", "Aprenda a Viver");
			
			//list
			System.out.println(livroBO.listar());

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
