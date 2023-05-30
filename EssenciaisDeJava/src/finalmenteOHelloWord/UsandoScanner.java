package finalmenteOHelloWord;

import java.util.Scanner;

public class UsandoScanner {
	
	public static void main(String[] args) {
		
		// TODO • Como ler dados digitados pela pessoa usuária no console?
		Scanner scanner = new Scanner(System.in);
		System.out.println("-- Como ler dados digitados pela pessoa usuária no console? --\n");
		System.out.print("Qual o seu nome: ");
		String nome = scanner.next();
		System.out.println("\nBoas-vindas, " + nome + "!\n");
		System.out.println("-----------------------------------------------------------\n");
		// scanner.close();
		
		// TODO • Convertendo Strings para Integer
		System.out.println("-- Convertendo Strings para Integer --\n");
		System.out.print("Entre com o primeiro número: ");
        String input1 = scanner.next();
        
        System.out.print("Entre com o segundo número: ");
        String input2 = scanner.next();

    	int n1 = Integer.parseInt(input1);
	    int n2 = Integer.parseInt(input2);

        int resultado = n1 + n2;
        System.out.println("O resultado da soma é: " + resultado);
        System.out.println("\n-----------------------------------------------------------\n");
        
        // TODO • Convertendo Strings para Short
        System.out.println("-- Convertendo Strings para Short --\n");
        
        System.out.print("Entre com a sua idade: ");
        String input3 = scanner.next();
        scanner.close();

        short idade = Short.parseShort(input3);

        short resultado2 = idade;
        resultado2++;

        System.out.println("Daqui a um ano sua idade será: " + resultado2);
        System.out.println("\n-----------------------------------------------------------\n");
        
        // • Convertendo Strings para Long
        System.out.println("-- Convertendo Strings para Long --");
        
        System.out.print("Entre com o tamanho da população chinesa: ");
        String input4 = scanner.next();
    
        long populacaoChinesa = Long.parseLong(input4);

        // Obs: não se preocupe, logo mais descobriremos o porquê desse L aparecer no número `7909863848L`.
        long resultado3 = 7909863848L + populacaoChinesa;
        System.out.println("Se tivéssemos duas Chinas no mundo, a população mundial seria: " + resultado);
    
        scanner.close();
	}
}
