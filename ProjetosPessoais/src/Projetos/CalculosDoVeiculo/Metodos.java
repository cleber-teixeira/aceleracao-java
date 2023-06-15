package Projetos.CalculosDoVeiculo;

public class Metodos {
	
	boolean converterDouble(String num) {
		boolean response;
		try {
			Double.parseDouble(num);
			response = true;
		} catch (RuntimeException e) {
			response = false;
		}
		return response;
	}

}
