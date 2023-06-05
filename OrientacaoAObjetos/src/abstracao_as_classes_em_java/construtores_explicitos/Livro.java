package abstracao_as_classes_em_java.construtores_explicitos;

// Declaração 'public' é um Modificador -> permite que qualquer outra parte do programa tenha acesso
public class Livro {
	// Atributos
	// Modificador 'private' -> pode ser acessado apenas pela própria classe
	private String titulo;
	private int numeroDePaginas;
	private String isbn;
	
	
	// Construtor Livro.
	public Livro (String tituloLivro, int numPagLivro, String isbnLivro) {
		this.titulo = tituloLivro;
		this.numeroDePaginas = numPagLivro;
		this.isbn = isbnLivro;
	}
	
	// Métodos
	public String retornarTituloLivro () {
		return titulo;
	}
	
	public int retornarNumeroDePaginas () {
		return numeroDePaginas;
	}
	
	public String retornarIsbn () {
		return isbn;
	}
}
