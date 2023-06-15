package encapsulamento_e_heranca.reutilizacao;

import java.time.LocalTime;

public class CancelaDeEstacionamento {
	
	public boolean ehHorarioComercial() {
		LocalTime inicioDoDia = LocalTime.of(8, 0);
		LocalTime fimDoDia = LocalTime.of(17, 0);
		LocalTime agora = LocalTime.now();
		
		return agora.isAfter(inicioDoDia) && agora.isBefore(fimDoDia);
	}
}
