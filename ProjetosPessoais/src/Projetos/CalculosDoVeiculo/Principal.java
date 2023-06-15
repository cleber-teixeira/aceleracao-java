package Projetos.CalculosDoVeiculo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DadosDoVeiculo veiculo = new DadosDoVeiculo();
		Metodos metodos = new Metodos();

		System.out.println("---- CÁLCULOS DO VEÍCULO ----\n");

		System.out.println("Qual o seu veículo?");
		String nomeVeiculo = sc.next();

		String kmLt = "";
		String valor;

		do {
			System.out.println("\nVocê sabe quanto o(a) " + nomeVeiculo + " roda(Km) por litro? (S/N)");
			kmLt = sc.next().toUpperCase();

			if (kmLt.equals("S") || kmLt.equals("SIM")) {

				do {
					System.out.println("\nInforme quantos quilômetros seu(sua) " + nomeVeiculo + " roda com 1 litro:");
					valor = sc.next();
					
					if (metodos.converterDouble(valor) && valor.length() < 8) {

						veiculo.setKmPorLitro(Double.parseDouble(valor));
						kmLt = "N";
						System.out.println("\nOk. Escolha uma das opções do menu a seguir para obter mais informações.");
						
					} else {
						System.out.println("\nOperação inválida, tente novamente.");
					}
					
				} while(!metodos.converterDouble(valor));

			} else if (kmLt.equals("N")) {

				System.out.println("\nUtilize a opção 1 do menu para descobrir esta informação.");

			} else {
				System.out.println("\n" + "Opção inválida!!!\n" + "Tente novamente.");
			}

		} while (!kmLt.equals("N"));

		String menu = "\n" + "Menu:\n\n" + "1 - Calcular quantos quilômetros o(a) " + nomeVeiculo
				+ " roda por litro de combustível\n" + "2 - Calcular o consumo(L) de combustível por trajeto\n"
				+ "3 - Calcular o valor(R$) gasto por trajeto\n" + "4 - Sair\n";

		System.out.println(menu);
		String opcao = sc.next();

		while (!opcao.equals("4")) {

			switch (opcao) {

			case "1":
				
				if (veiculo.getKmPorLitro() == 0) {
					
					do {
					System.out.println("\nInforme a capacidade total de litros do tanque de combustível:");
					valor = sc.next();
					
						if (metodos.converterDouble(valor) && valor.length() < 8) {
							
							veiculo.setLitros(Double.parseDouble(valor));
							
						} else {
							System.out.println("\nValor inválido!");
						}
					} while (!metodos.converterDouble(valor));
					
					do {
						System.out.println(
								"\nInforme os quilômetros rodados pelo(a) " 
								+ nomeVeiculo + " com o tanque cheio:");
						valor = sc.next();
						
						if (metodos.converterDouble(valor) && valor.length() < 8) {
							
							veiculo.setKmRodado(Double.parseDouble(valor));
							
						} else {
							System.out.println("\nValor inválido!");
						}
					
					} while(!metodos.converterDouble(valor));
					
					System.out.println(veiculo.calcularKmPorLitro(nomeVeiculo));

				} else {
					System.out.println("\nVocê já sabe esta informação...\n" + "O(a) " + nomeVeiculo + " roda "
							+ veiculo.getKmPorLitro() + " Km por litro.");
				}
				break;

			case "2":

				if (veiculo.getKmPorLitro() == 0) {

					do {
						System.out.println("" + "\nInforme quantos quilômetros o(a) " + nomeVeiculo
								+ " faz com 1 litro de combustível:");
						valor = sc.next();
						
						if (metodos.converterDouble(valor) && valor.length() < 8) {

							veiculo.setKmPorLitro(Double.parseDouble(valor));
						
						} else {
							System.out.println("\nValor inválido!");
						}
						
					} while (!metodos.converterDouble(valor));
				}

				do {
					System.out.println("\nInforme os quilômetros do trajeto de destino:");
					valor = sc.next();
					
					if (metodos.converterDouble(valor) && valor.length() < 8) {
						
						veiculo.setKmDestino(Double.parseDouble(valor));
						
					} else {
						System.out.println("\nValor inválido!");
					}
				} while(!metodos.converterDouble(valor));

				System.out.println(veiculo.calcularLitrosPorKm(nomeVeiculo));
				break;

			case "3":
				if (veiculo.getKmDestino() == 0) {
					do {
						System.out.println("\nInforme os quilômetros do trajeto de destino:");
						valor = sc.next();
						
						if (metodos.converterDouble(valor) && valor.length() < 8) {
							
							veiculo.setKmDestino(Double.parseDouble(valor));
							
						} else {
							System.out.println("\nValor inválido!");
						}
						
					} while(!metodos.converterDouble(valor));
				}

				do {
					System.out.println("\nQual o valor(R$) atual do combustível(L):");
					valor = sc.next();
					
					if (metodos.converterDouble(valor) && valor.length() < 8) {
						
						veiculo.setValorCombustivel(Double.parseDouble(valor));
						
					} else {
						
						System.out.println("\nValor inválido!");
						
					}
				} while(!metodos.converterDouble(valor));

				System.out.println(veiculo.calcularValorPorKm(nomeVeiculo));
				break;

			default:
				System.out.println("\nOpção inválida!!!");
				break;
			}

			opcao = "";
			String resposta;

			do {

				System.out.println("\n" + "Gostaria de tentar novamente ou fazer outro cálculo? (Sim/Não)");
				resposta = sc.next().toUpperCase();

				if (resposta.equals("S") || resposta.equals("SIM")) {

					System.out.println(menu);
					opcao = sc.next();
					resposta = "N";

				} else if (resposta.equals("N") || resposta.equals("NÂO") || resposta.equals("NAO")) {

					opcao = "4";

				} else {

					System.out.println("\n" + "Opção inválida!!!\n" + "Tente novamente.");
				}

			} while (!resposta.equals("N"));

		}

		sc.close();

		System.out.println("\nCálculos do Veículo encerrado.");
		System.out.println("\nOBRIGADO POR USAR NOSSO APP !!!\n" + "Manda um abraço para o Luis!");


	}

}
