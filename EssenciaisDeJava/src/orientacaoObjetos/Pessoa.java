package orientacaoObjetos;

public class Pessoa {
    // Características
		// atributos
	//public String nome;
	private String nome;

    // Método construtor
    Pessoa (String nomeObjeto) {

        // System.out.println("Objeto criado com sucesso!!!");
    	this.nome = nomeObjeto;

    }

    // Ações da classe - métodos publicos
    public String devolverNomeObjeto () {
    	return this.nome;
    }
}
