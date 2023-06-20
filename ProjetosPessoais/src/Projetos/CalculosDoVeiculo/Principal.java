package Projetos.CalculosDoVeiculo;

import java.util.Scanner;

/**
 * Método 'Principal', este é o método principal responsável por rodar o sistema 'Cálculos do Veículo'.
 * @author Cleber Teixeira
 * @author Julia Marinetto
 * @author Luiz Felipe
 * @category Projeto Pessoal
 * @version 1.0
 */
public class Principal {

	public static void main(String[] args) {

		// Instancia os Objetos
		Scanner sc = new Scanner(System.in);
		Metodos metodos = new Metodos();
		
		// 'Seta' o objeto 'Scanner' da classe 'Metodos'
		metodos.setSc(sc);

		// Sistema - início
		System.out.println("---- CÁLCULOS DO VEÍCULO ----\n");

		System.out.println("Qual o seu veículo?");
		String nomeVeiculo = sc.next();

		// Primeiro processo do sistema
		metodos.introducao(nomeVeiculo);
		
		// Exibe o menu
		System.out.println(metodos.menu(nomeVeiculo));
		String opcao = sc.next();

		// Ações de acordo com as opções do menu
		while (!opcao.equals("4")) {

			switch (opcao) {

			case "1":
				System.out.println(metodos.case1(nomeVeiculo));
				break;

			case "2":
				System.out.println(metodos.case2(nomeVeiculo));
				break;

			case "3":
				System.out.println(metodos.case3(nomeVeiculo));
				break;

			default:
				System.out.println("\nOpção inválida!!!");
				break;
			}

			// Continuar ou finalizar o sistema?
			opcao = metodos.continuar(nomeVeiculo);
		}
		// Fecha o método 'Scanner'
		sc.close();

		System.out.println("\nO Sistema: Cálculos do Veículo\nFoi encerrado com sucesso!!!");
	}
}
