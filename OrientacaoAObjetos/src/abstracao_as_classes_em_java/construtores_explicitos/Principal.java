package abstracao_as_classes_em_java.construtores_explicitos;

public class Principal {

	public static void main(String[] args) {

		// Instancia o objeto livro
		Livro livro = new Livro("Tururu", 500, "ER900300");
		
		String tituloDoLivro = livro.retornarTituloLivro();
		int numeroDePaginas = livro.retornarNumeroDePaginas();
		String isbnDoLivro = livro.retornarIsbn();
		
		System.out.println("O livro '" + tituloDoLivro + "' com o ISBN: " + isbnDoLivro + " têm " + numeroDePaginas + " páginas.");
	}

}
