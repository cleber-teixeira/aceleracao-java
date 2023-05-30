package exercicios.SmartNutri;

import java.lang.Math;

public class Avaliacao {

    // método público e não tem retorno (void).
    public void CalculadoraIMC(double peso, double altura) {
        // cálculo do IMC -> peso / altura ^ 2
        // Math.pow() -> Exponenciação
        double IMC = peso / Math.pow(altura, 2);
        System.out.println("\nO seu IMC é " + IMC + "\n");
    }
}
