package encapsulamento_e_heranca.heranca_na_pratica.Imobiliaria.main;

import java.text.NumberFormat;
import java.time.LocalDate;

import encapsulamento_e_heranca.heranca_na_pratica.Imobiliaria.classes.Aluguel;
import encapsulamento_e_heranca.heranca_na_pratica.Imobiliaria.classes.Venda;

public class Principal {

	public static void main(String[] args) {
		
		Aluguel apto1 = new Aluguel("Rua Aclimação, 32", LocalDate.now(), 1800);
		System.out.println("Endereço: " + apto1.getEndereco());
		System.out.println("Valor aluguel: " + NumberFormat.getCurrencyInstance().format(apto1.getValorAluguel()));
		
		Venda apto2 = new Venda("Rua Consolação, 123", LocalDate.now(), 600000);
		System.out.println("\nEndereço: " + apto2.getEndereco());
		System.out.println("Valor venda: " + NumberFormat.getCurrencyInstance().format(apto2.getValorVenda()));
		
		// ativa o cadastro do apartamento 1
		apto1.ativarCadastro();
		
		// desativa o cadastro do apartamento 1
		// apto1.desativarCadastro();
		
		// aluga o apartamento 1
		apto1.alugar();
		
		// imprime se o apartamento 1 foi alugado
		System.out.println("\nO apartamento 1 foi alugado: " + apto1.isAlugado());
	}

}
