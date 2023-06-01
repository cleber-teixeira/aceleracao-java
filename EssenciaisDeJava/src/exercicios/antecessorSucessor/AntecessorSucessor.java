package exercicios.antecessorSucessor;

import java.util.Scanner;

/**
 * Imprime o antecessor e sucessor do número de entrada.
 * 
 * @author Cleber Teixeira
 * @category Exercícios
 * @see Trybe
 */
public class AntecessorSucessor {
	
	/**
	 * Método responsável por receber o parâmetro e retornar o resultado.
	 * 
	 * @param args não usado.
	 */
	public static void main (String[] args) {
		
		// Ler a entrada de um número pelo console.
		Scanner scan = new Scanner(System.in);
		
		// Imprime na tela.
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		
		// Atribui o antecessor e o sucessor.
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		
		// Imprime a saída no console.
		System.out.println("O número " + numero + " tem " + antecessor
				+ " como seu antecessor e " + sucessor + " como seu sucessor.");
		
		// Finaliza o Scanner.
		scan.close();
	}
}
