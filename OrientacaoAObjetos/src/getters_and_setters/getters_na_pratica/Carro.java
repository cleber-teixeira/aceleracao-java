package getters_and_setters.getters_na_pratica;

public class Carro {

	// atributos
	private String nome;
	private String montadora;
	private int ano;
	
	// construtor
	public Carro(String nomeCarro, String montadoraCarro, int anoCarro) {
		
		nome = nomeCarro;
		montadora = montadoraCarro;
		ano = anoCarro;
		
		
	}

	// métodos getters
	public String getNome() {
		return nome;
	}

	public String getMontadora() {
		return montadora;
	}

	public int getAno() {
		return ano;
	}
}
