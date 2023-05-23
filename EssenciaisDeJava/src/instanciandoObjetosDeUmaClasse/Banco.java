package instanciandoObjetosDeUmaClasse;

/**
 * A classe 'Banco' representa um banco onde é instanciado um objeto 'ContaBancaria'.
 * 
 * @author Cleber
 * @version 1.0
 * @since 2023-05-17
 */
public class Banco {

	public static void main(String[] args) {
		// TODO Instanciando objetos de uma Classe em Java
		
		/* Para instanciar um objeto a partir de uma classe, devemos utilizar a declaração new, como em Pessoa obj = new Pessoa(). Para entender melhor, suponha, por exemplo, que queremos montar um sistema bancário 💸. Imagine que queremos desenvolver a parte das contas bancárias adicionando apenas uma ação, que é a de depositar dinheiro. Primeiro, precisamos definir o esqueleto da conta bancária, que em Java seria equivalente a definir uma classe e seus métodos. */
		ContaBancaria obj = new ContaBancaria();
        obj.depositar(500);
	}
}
