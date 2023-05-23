package estruturasCondicionaisEDeRepeticao;

public class Condicionais {

	public static void main(String[] args) {
		// TODO 

		// Ifs e Elses em Java
		
		/* Parte da estrutura de fluxo condicional, o IF / ELSE é aplicado em 
		 * cenários em que precisamos, através de uma condição booleana, 
		 * determinar o “caminho” da execução em nosso programa. Consideremos 
		 * um sistema de nota final escolar cuja regra determina que:
		 * 
		 * Se if a média da nota final for igual ou superior a 7.0, a pessoa 
		 * estará APROVADA. Caso contrário else, ela estará REPROVADA. */
		
		double mediaFinal = 7.5;
		String resultado =  "INDEFINIDO";

		if (mediaFinal >= 7) {
		   resultado = "APROVADA";
		} else {
		   resultado = "REPROVADA";
		}
		System.out.println(resultado);
		
		// Ex 02
		double mediaFinal2 = 6.0;
		String resultado2 =  "INDEFINIDO";

		if (mediaFinal2 >= 7) {
		   resultado2 = "APROVADA";
		} else if (mediaFinal2 == 6.0) {
		    resultado2 = "REALIZAR PROVA BONUS";
		} else {
		   resultado2 = "REPROVADA";
		}
		System.out.println(resultado2);
	}

}
