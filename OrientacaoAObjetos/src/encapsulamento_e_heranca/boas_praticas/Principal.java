package encapsulamento_e_heranca.boas_praticas;

public class Principal {

	public static void main(String[] args) {
		
		Dado dado = new Dado(6);
		
		System.out.println("O dado caiu em: " + dado.rolar());

	}

}
