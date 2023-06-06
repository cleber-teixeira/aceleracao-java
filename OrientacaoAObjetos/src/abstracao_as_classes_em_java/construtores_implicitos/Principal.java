package abstracao_as_classes_em_java.construtores_implicitos;

public class Principal {

	public static void main(String[] args) {
		
		// Instância da classe Pessoa
		/*
		 * - Nome da Classe (Pessoa)
		 * - Nome do objeto (pessoa1)
		 * - Diretiva (new)
		 * - Método Construtor da classe (Pessoa())
		*/
		Pessoa pessoa1 = new Pessoa("Luara");
		Pessoa pessoa2 = new Pessoa("Pedro");

		System.out.println("O nome de pessoa1 é: " + pessoa1.devolverNomeObjeto());
		System.out.println("O nome de pessoa2 é: " + pessoa2.devolverNomeObjeto());
	}

}
