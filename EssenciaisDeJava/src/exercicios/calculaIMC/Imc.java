package exercicios.calculaIMC;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Calcula o IMC da pessoa.
 * 
 * @author Cleber Teixeira
 * @category Exercícios
 */

public class Imc {
	/**
	 * Recebe o peso e altura da pessoa e calcula o IMC.
	 */
	public static void main (String[] args) {
		// Ler a entrada de um número pelo console
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite o peso: ");
		float peso = scan.nextFloat();
		
		System.out.print("Digite a altura: ");
		float altura = scan.nextFloat();
		
		// Cálculo do IMC -> peso / altura ^ 2
		float imc = peso / (altura * altura);
		
		// Instância de formatação
		DecimalFormat df = new DecimalFormat("0.0");
		
		// Imprime a saída no console.
		System.out.println(df.format(imc));
		
		scan.close();
	}
}
