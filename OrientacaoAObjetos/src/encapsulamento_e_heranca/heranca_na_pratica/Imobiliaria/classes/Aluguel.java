package encapsulamento_e_heranca.heranca_na_pratica.Imobiliaria.classes;

import java.time.LocalDate;

/**
 * A classe "Aluguel" é filha da classe "Imovel", ou seja, a classe "Aluguel" recebe por 'herança' todos os atributos da classe "Imovel".
 */
public class Aluguel extends Imovel {

	// atributos da classe Aluguel.
	private double valorAluguel;
	private boolean alugado;

	// método construtor
	public Aluguel(String endereco, LocalDate dataCadastro) {
		super(endereco, dataCadastro);
		
		this.alugado = false;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void alugar() {
		this.alugado = true;
	}
	
	
}
