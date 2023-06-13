package getters_and_setters.alterar_valores_privados;

public class Principal {

	public static void main(String[] args) {
		
		// instância dos Objetos
		Pessoa pessoa1 = new Pessoa("Luara", "123.456.789-01", 41);
		Pessoa pessoa2 = new Pessoa("Pedro", "987.654.321-02", 33);
		
		// imprime na tela utilizando o método Get para pegar o atributo
		System.out.println("Dados atribuidos inicialmente:\n");
		System.out.println("Nome armazenado no objeto pessoa1: " + pessoa1.getNome());
		System.out.println("CPF armazenado no objeto pessoa1: " + pessoa1.getCpf());
		System.out.println("Idade armazenado no objeto pessoa1: " + pessoa1.getIdade());
		System.out.println("\nNome armazenado no objeto pessoa2: " + pessoa2.getNome());
		System.out.println("CPF armazenado no objeto pessoa2: " + pessoa2.getCpf());
		System.out.println("Idade armazenado no objeto pessoa2: " + pessoa2.getIdade());

		// utilização do método Set para modificar o atributo
		pessoa1.setNome("Luara Dias");
		pessoa2.setIdade(34);
		
		// imprime dados atualizados
		System.out.println("\nDados Atualizados:\n");
		System.out.println("Nome armazenado no objeto pessoa1: " + pessoa1.getNome());
		System.out.println("CPF armazenado no objeto pessoa1: " + pessoa1.getCpf());
		System.out.println("Idade armazenada no objeto pessoa1: " + pessoa1.getIdade());
		System.out.println("\nNome armazenado no objeto pessoa2: " + pessoa2.getNome());
		System.out.println("CPF armazenado no objeto pessoa2: " + pessoa2.getCpf());
		System.out.println("Idade armazenada no objeto pessoa2: " + pessoa2.getIdade());
	}

}
