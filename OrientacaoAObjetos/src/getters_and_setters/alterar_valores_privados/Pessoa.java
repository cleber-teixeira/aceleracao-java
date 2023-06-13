package getters_and_setters.alterar_valores_privados;

public class Pessoa {
	// atributos privados criados com o modificador 'private'
	private String nome;
	private String cpf;
	private int idade;
	
	// construtor
	Pessoa(String nomeObjeto, String cpfObjeto, int idadeObjeto) {
		// atribuição dos atributos
		nome = nomeObjeto;
		cpf = cpfObjeto;
		idade = idadeObjeto;
	}
	
	/* Métodos Getters e Setters */

	// método Get: pegar um atributo
	// Obs.: para o método Get, deve-se especificar o 'tipo' de retorno do valor e adicionar a diretiva 'return'.
	public String getNome() {
		return nome;
	}

	// método Set: modificar um atributo
	// Obs.: para o método Set, deve-se adicionar a notação 'void' para indicar que o método não retorna valor.
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}
	
}
