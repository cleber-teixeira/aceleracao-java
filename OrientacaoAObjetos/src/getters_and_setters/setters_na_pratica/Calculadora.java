package getters_and_setters.setters_na_pratica;

public class Calculadora {

	// atributos
	private int primeiroNumero;
	private int segundoNumero;
	
	// métodos setters
	public void setPrimeiroNumero(int primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}
	
	public void setSegundoNumero(int segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	
	// métodos da calcularora
	public int somar() {
		int resultado = primeiroNumero + segundoNumero;
		return resultado;
	}

	public int subritrair() {
		int resultado = primeiroNumero - segundoNumero;
		return resultado;
	}
	
	public int multiplicar() {
		int resultado = primeiroNumero * segundoNumero;
		return resultado;
	}
	
	public int dividir() {
		int resultado = primeiroNumero / segundoNumero;
		return resultado;
	}
	
}
