package abstracao_as_classes_em_java.construtores_implicitos;

public class Pessoa {
	/* Características (Atributos) */
	// public String nome;
	/* Obs.: o ideal é criar atributos privados */
	private String nome;
	
	// Método Construtor
	Pessoa(String nomeObjeto) {
		//System.out.println("Objeto criado com sucesso!!!");
		this.nome = nomeObjeto;
	}
	
	/* Ações da Classe - métodos públicos */
	// Obs.: o ideal é criar métodos para trabalhar com atributos privados
	public String devolverNomeObjeto() {
		return this.nome;
	}
}
