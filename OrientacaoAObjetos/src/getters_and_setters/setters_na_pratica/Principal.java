package getters_and_setters.setters_na_pratica;

public class Principal {

	public static void main(String[] args) {
		// instância do objeto
		Calculadora objCalculadora = new Calculadora();
		
		// atribuição através do método Setter
		objCalculadora.setPrimeiroNumero(10);
		objCalculadora.setSegundoNumero(7);
		
		// imprime na tela os cálculos
		System.out.println("Resultado da soma é: " + objCalculadora.somar());
		System.out.println("Resultado da subtração é: " + objCalculadora.subritrair());
		System.out.println("Resultado da multiplicação é: " + objCalculadora.multiplicar());
		System.out.println("Resultado da divisão é: " + objCalculadora.dividir());

	}

}
