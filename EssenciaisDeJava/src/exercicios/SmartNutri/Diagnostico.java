package exercicios.SmartNutri;

import java.util.Scanner;

public class Diagnostico {
    
    public static void main(String[] args) {
        // Instancia um objeto Avaliação
        
        // Avaliacao avaliacaoCleber = new Avaliacao();
        // avaliacaoCleber.CalculadoraIMC(76, 1.72);
        
        // Avaliacao avaliacaoJoao = new Avaliacao();
        // avaliacaoJoao.CalculadoraIMC(100, 1.82);
        
        Scanner instanciaDeScanner = new Scanner(System.in);
        
        System.out.print("Qual o seu peso? ");
        String pesoEntrada = instanciaDeScanner.next();
        
        System.out.print("\nQual a sua altura? ");
        String alturaEntrada = instanciaDeScanner.next();
        
        // Conversão de String para Double.
        double peso = Double.parseDouble(pesoEntrada);
        double altura = Double.parseDouble(alturaEntrada);
        
        Avaliacao instanciaDeAvaliacao = new Avaliacao();
        instanciaDeAvaliacao.CalculadoraIMC(peso, altura);

        instanciaDeScanner.close();
    }
}
