package Projetos.CalculosDoVeiculo;

public class Dados {

	// Atributos
	protected double kmRodado;
	private double kmDestino;
	protected double litros;
	private double litrosPorKm;
	protected double kmPorLitro;
	private double valorCombustivel;
	
	// Construtor
	public Dados() {
		super();
		this.kmRodado = 0.00;
		this.kmDestino = 0.00;
		this.litros = 0.00;
		this.litrosPorKm = 0.00;
		this.kmPorLitro = 0.00;
		this.valorCombustivel = 0.00;
	}

	// Getters and Setters
	public double getKmRodado() {
		return kmRodado;
	}

	public void setKmRodado(double kmRodado) {
		this.kmRodado = kmRodado;
	}
	
	public double getKmDestino() {
		return kmDestino;
	}

	public void setKmDestino(double kmDestino) {
		this.kmDestino = kmDestino;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getLitrosPorKm() {
		return litrosPorKm;
	}

	public void setLitrosPorKm(double litrosPorKm) {
		this.litrosPorKm = litrosPorKm;
	}

	public double getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}

	public double getValorCombustivel() {
		return valorCombustivel;
	}

	public void setValorCombustivel(double valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}
}
