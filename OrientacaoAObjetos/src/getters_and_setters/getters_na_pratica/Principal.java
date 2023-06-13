package getters_and_setters.getters_na_pratica;

public class Principal {

	public static void main(String[] args) {
		
		// instância do objeto
		Carro objCarro = new Carro("Creta", "Hyundai", 2021);
		
		// obtem os valores através dos métodos Getters e imprime na tela
		System.out.println("O nome do carro é: " + objCarro.getNome());
		System.out.println("A montadora do carro é: " + objCarro.getMontadora());
		System.out.println("O ano do carro é: " + objCarro.getAno());

	}

}
