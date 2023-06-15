package encapsulamento_e_heranca.boas_praticas;

public class Dado {

	private int lados;
	
	public Dado(int objLados) {
		
		this.lados = objLados;
		
	}
	
	public int rolar() {
		
		return 1 + (int) (Math.random() * this.lados);
		
	}
}
