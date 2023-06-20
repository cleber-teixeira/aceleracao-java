package Projetos.CalculosDoVeiculo;

import java.text.NumberFormat;

public class DadosDoVeiculo {

	// Atributos
		private double kmRodado;
		private double kmDestino;
		private double litros;
		private double litrosPorKm;
		private double kmPorLitro;
		private double valorCombustivel;
		
		// Construtor
		public DadosDoVeiculo() {
			super();
			this.kmRodado = 0;
			this.kmDestino = 0;
			this.litros = 0;
			this.litrosPorKm = 0;
			this.kmPorLitro = 0;
			this.valorCombustivel = 0;
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
		
		// Métodos
		public String calcularKmPorLitro (String veiculo) {
			double calculo = getKmRodado() / getLitros();
			setKmPorLitro(calculo);
			return "\nO(a) " + veiculo + " roda " + String.format("%.2f", calculo) + " Km por litro.";
		}
		
		public String calcularLitrosPorKm (String veiculo) {
			double calculo = getKmDestino() / getKmPorLitro();
			setLitrosPorKm(calculo);
			return "\nO(a) " + veiculo + " gasta " + String.format("%.2f", calculo) + " litros para rodar " + getKmDestino() + " Km.";
		}
		
		public String calcularValorPorKm (String veiculo) {
			double calculo;
			
			if (getLitrosPorKm() != 0) {
				
				calculo = getLitrosPorKm() * this.valorCombustivel;
				
			} else {
				
				calculo = (getKmDestino() / getKmPorLitro()) * this.valorCombustivel;
				
			}
			
			return "\nO(a) " + veiculo + " gasta " + NumberFormat.getCurrencyInstance().format(calculo) + " para rodar " + getKmDestino() + " Km.";
		}
	
}
