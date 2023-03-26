package br.vitor.library.model;

public class Livro {

	private int numeroPaginas;
	private String nomeLivro;
	private String autor;
	private String editora;

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro [numeroPaginas=" + numeroPaginas + ", nomeLivro=" + nomeLivro + ", autor=" + autor + ", editora="
				+ editora + "]";
	}

}
