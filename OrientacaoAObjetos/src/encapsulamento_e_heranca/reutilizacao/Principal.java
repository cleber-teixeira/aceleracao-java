package encapsulamento_e_heranca.reutilizacao;

public class Principal {

	public static void main(String[] args) {
		
		CancelaDeEstacionamento cancela = new CancelaDeEstacionamento();
		
		String response = "";
		
		if (cancela.ehHorarioComercial()) {
			response = "Sim";
		} else {
			response = "Não";
		}
		
		System.out.println("É horário comercial (Sim/Não): " + response);

	}

}
