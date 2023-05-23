package instanciandoObjetosDeUmaClasse;
//TODO Instanciando objetos de uma Classe em Java

/*  */
/**
 * <h1>Classe ContaBancaria</h1>
 * A classe 'ContaBancaria' representa a conta bancária com apenas uma ação, que é o método para fazer um depósito (depositar).
 * 
 * @author Cleber Teixeira
 * @version 1.0
 * @since 2023-05-17
 */
public class ContaBancaria {

	/**
	 * <h1>Método <b>depositar</b></h1>
	 * O método <b>depositar</b> recebe um parâtro <b>valor</b> que representa o valor do depósito bancário. Note que esse método não está armazenando o valor de depósito em lugar nenhum, ele está apenas recebendo o valor e imprimindo no console do Java.
	 * 
	 * @param <b>valor</b> recebe o valor que será depositado na conta bancária.
	 * @return <b>int</b> retorna um valor que representa o deposito.
	 */
	public void depositar(int valor) {
		
		System.out.println(valor);
				
	}
}
