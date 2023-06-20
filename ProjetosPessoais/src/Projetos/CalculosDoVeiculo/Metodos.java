package Projetos.CalculosDoVeiculo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Metodos extends Dados{

	private Scanner scan;
	
	String valor;
	String nomeVeiculo;

	/**
	 * Método Setter para o objeto 'scan'
	 * @param sc Parâmetro do tipo 'Scanner' que atribui ao objeto 'scan'
	 */
	public void setSc(Scanner sc) {
		this.scan = sc;
	}

	/**
	 * Método 'converterDouble' verifica se o valor do tipo 'String' pode ser convertido para o tipo 'Double'.
	 * @param num parâmetro do tipo 'String' que representa um valor do tipo 'Double'
	 * @return retorna um valor do tipo 'boolean' que indica se o valor recebido por parâmetro pode ser convertido para 'Double'.
	 */
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
	
	/**
	 * Método 'calcularKmPorLitro' calcula quantos Km um veículo pode rodar com um litro de combustível.
	 * @param veiculo parâmetro do tipo 'String' que representa o nome do veículo
	 * @return retorna um valor do tipo 'String' que informa quantos Km o veículo roda por litro 
	 */
	public String calcularKmPorLitro (String veiculo) {
		double calculo = this.kmRodado / this.litros;

		setKmPorLitro(calculo);
		return "\nO(a) " + veiculo + " roda " + String.format("%.2f", calculo) + " Km por litro.";
	}
	
	/**
	 * Método 'calcularLitrosPorKm' calcula quantos litros um veículo gasta por trajeto informado.
	 * @param veiculo parâmetro do tipo 'String' que representa o nome do veículo
	 * @return retorna um valor do tipo 'String' que informa quantos litros o veículo gasta por trajeto
	 */
	public String calcularLitrosPorKm (String veiculo) {
		double calculo = getKmDestino() / getKmPorLitro();
		setLitrosPorKm(calculo);
		return "\nO(a) " + veiculo + " gasta " + String.format("%.2f", calculo) + " litros para rodar " + String.format("%.2f", getKmDestino()) + " Km.";
	}
	
	/**
	 * Método 'calcularValorPorKm' calcula quanto o veículo gasta por trajeto informado.
	 * @param veiculo parâmetro do tipo 'String' que representa o nome do veículo
	 * @return retorna um valor do tipo 'String' que informa quanto o veículo gasta por trajeto
	 */
	public String calcularValorPorKm (String veiculo) {
		double calculo;
		
		if (getLitrosPorKm() != 0) {
			
			calculo = getLitrosPorKm() * getValorCombustivel();
			
		} else {
			
			calculo = (getKmDestino() / getKmPorLitro()) * getValorCombustivel();
			
		}
		
		return "\nO(a) " + veiculo + " gasta " + NumberFormat.getCurrencyInstance().format(calculo) + " para rodar " + String.format("%.2f", getKmDestino()) + " Km.";
	}
	
	/**
	 * Método 'case1' processa as informações caso seja escolhida a opção 1 do 'menu'.
	 * @param veiculo parâmetro do tipo 'String' que representa o nome do veículo
	 * @return retorna valores do tipo 'String' de acorco com as informações inseridas pelo usuário
	 */
	public String case1(String veiculo) {
		String response = "";
		if (getKmPorLitro() == 0) {
			
			do {
			System.out.println("\nInforme a capacidade total de litros do tanque de combustível:");
			valor = scan.next().replace(",", ".");
			
				if (converterDouble(valor) && valor.length() < 8) {
					
					setLitros(Double.parseDouble(valor));
					
				} else {
					response ="\nValor inválido!";
				}
			} while (!converterDouble(valor));
			
			do {
				System.out.println(
						"\nInforme os quilômetros rodados pelo(a) " 
						+ nomeVeiculo + " com o tanque cheio:");
				valor = scan.next().replace(",", ".");
				
				if (converterDouble(valor) && valor.length() < 8) {
					
					setKmRodado(Double.parseDouble(valor));
					
				} else {
					response = "\nValor inválido!";
				}
			
			} while(!converterDouble(valor));
			
			System.out.println(calcularKmPorLitro(veiculo));

		} else {
			response = "\nVocê já sabe esta informação...\n" + "O(a) " + veiculo + " roda "
					+ String.format("%.2f", getKmPorLitro()) + " Km por litro.";
		}
		return response;
	}

	/**
	 * Método 'case2' processa as informações caso seja escolhida a opção 2 do 'menu'.
	 * @param veiculo parâmetro do tipo 'String' que representa o nome do veículo
	 * @return retorna valores do tipo 'String' de acorco com as informações inseridas pelo usuário
	 */
	public String case2(String veiculo) {
		String responde = "";
		
		if (getKmPorLitro() == 0) {

			do {
				System.out.println("" + "\nInforme quantos quilômetros o(a) " + veiculo
						+ " faz com 1 litro de combustível:");
				valor = scan.next().replace(",", ".");
				
				if (converterDouble(valor) && valor.length() < 8) {

					setKmPorLitro(Double.parseDouble(valor));
				
				} else {
					System.out.println("\nValor inválido!");
				}
				
			} while (!converterDouble(valor));
		}

		do {
			System.out.println("\nInforme os quilômetros do trajeto de destino:");
			valor = scan.next().replace(",", ".");
			
			if (converterDouble(valor) && valor.length() < 8) {
				
				setKmDestino(Double.parseDouble(valor));
				
			} else {
				System.out.println("\nValor inválido!");
			}
		} while(!converterDouble(valor));

		System.out.println(calcularLitrosPorKm(veiculo));
		return responde;
	}

	/**
	 * Método 'case3' processa as informações caso seja escolhida a opção 3 do 'menu'.
	 * @param veiculo parâmetro do tipo 'String' que representa o nome do veículo
	 * @return retorna valores do tipo 'String' de acorco com as informações inseridas pelo usuário
	 */
	public String case3(String veiculo) {

		String response = "";
		
		if (getKmDestino() == 0) {
			do {
				System.out.println("\nInforme os quilômetros do trajeto de destino:");
				valor = scan.next().replace(",", ".");
				
				if (converterDouble(valor) && valor.length() < 8) {
					
					setKmDestino(Double.parseDouble(valor));
					
				} else {
					System.out.println("\nValor inválido!");
				}
				
			} while(!converterDouble(valor));
		}

		do {
			System.out.println("\nQual o valor(R$) atual do combustível(L):");
			valor = scan.next().replace(",", ".");
			
			if (converterDouble(valor) && valor.length() < 8) {
				
				setValorCombustivel(Double.parseDouble(valor));
				
			} else {
				
				System.out.println("\nValor inválido!");
				
			}
		} while(!converterDouble(valor));

		System.out.println(calcularValorPorKm(veiculo));
		
		return response;
	}
 
	/**
	 * Método 'menu' imprime o menu na tela.
	 * @param veiculo parâmetro do tipo 'String' que representa o nome do veículo
	 * @return retorna um valor do tipo 'String' que representa o menu.
	 */
	public String menu(String veiculo) {
		
		String menu = "\n" + "Menu:\n\n" + "1 - Calcular quantos quilômetros o(a) " + veiculo
				+ " roda por litro de combustível\n" + "2 - Calcular o consumo(L) de combustível por trajeto\n"
				+ "3 - Calcular o valor(R$) gasto por trajeto\n" + "4 - Sair\n";
		
		return menu;
	}

	/**
	 * Método 'continuar' imprime na tela opções se o usuário deseja continuar com o processo.
	 * @param veiculo parâmetro do tipo 'String' que representa o nome do veículo
	 * @return retorna valores do tipo 'String' de acorco com as informações inseridas pelo usuário
	 */
	public String continuar(String veiculo) {
		String opcao = "";
		String resposta;

		do {

			System.out.println("\n" + "Gostaria de tentar novamente ou fazer outro cálculo? (Sim/Não)");
			resposta = scan.next().toUpperCase();

			if (resposta.equals("S") || resposta.equals("SIM")) {

				System.out.println(menu(veiculo));
				opcao = scan.next();
				resposta = "N";

			} else if (resposta.equals("N") || resposta.equals("NÂO") || resposta.equals("NAO")) {

				opcao = "4";

			} else {

				System.out.println("\n" + "Opção inválida!!!\n" + "Tente novamente.");
			}

		} while (!resposta.equals("N"));
		
		return opcao;
	}

	/**
	 * Método 'introducao' imprime as informações iniciais do processo  
	 * @param veiculo parâmetro do tipo 'String' que representa o nome do veículo
	 */
	public void introducao(String veiculo) {
		String kmLt = "";
		String valor;

		do {
			System.out.println("\nVocê sabe quanto o(a) " + veiculo + " roda(Km) por litro? (S/N)");
			kmLt = scan.next().toUpperCase();

			if (kmLt.equals("S") || kmLt.equals("SIM")) {

				do {
					System.out.println("\nInforme quantos quilômetros seu(sua) " + veiculo + " roda com 1 litro:");
					valor = scan.next().replace(",", ".");
					
					if (converterDouble(valor) && valor.length() < 8) {

						setKmPorLitro(Double.parseDouble(valor));
						kmLt = "N";
						System.out.println("\nOk. Escolha uma das opções do menu a seguir para obter mais informações.");
						
					} else {
						System.out.println("\nOperação inválida, tente novamente.");
					}
					
				} while(!converterDouble(valor));

			} else if (kmLt.equals("N")) {

				//System.out.println("\nUtilize a opção 1 do menu para descobrir esta informação.");
				if (getKmPorLitro() == 0) {
					
					do {
					System.out.println("\nInforme a capacidade total de litros do tanque de combustível:");
					valor = scan.next().replace(",", ".");
					
						if (converterDouble(valor) && valor.length() < 8) {
							
							setLitros(Double.parseDouble(valor));
							
						} else {
							System.out.println("\nValor inválido!");
						}
					} while (!converterDouble(valor));
					
					do {
						System.out.println(
								"\nInforme os quilômetros rodados pelo(a) " 
								+ nomeVeiculo + " com o tanque cheio:");
						valor = scan.next().replace(",", ".");
						
						if (converterDouble(valor) && valor.length() < 8) {
							
							setKmRodado(Double.parseDouble(valor));
							
						} else {
							System.out.println("\nValor inválido!");
						}
					
					} while(!converterDouble(valor));
					
					System.out.println(calcularKmPorLitro(veiculo));

				} else {
					System.out.println("\nVocê já sabe esta informação...\n" + "O(a) " + veiculo + " roda "
							+ String.format("%.2f", getKmPorLitro()) + " Km por litro.");
				}

			} else {
				System.out.println("\n" + "Opção inválida!!!\n" + "Tente novamente.");
			}

		} while (!kmLt.equals("N"));
	}
}
