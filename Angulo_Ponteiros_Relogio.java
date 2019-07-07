package avancado;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class anguloPonteiros {
	public static void main(String[] args) {
		//atribuindo valores para as variáveis hora e minuto
		GregorianCalendar horario = new GregorianCalendar();
		int hora = horario.get(Calendar.HOUR_OF_DAY);
		int minuto = horario.get(Calendar.MINUTE);
		
		System.out.println("Horário: " + hora + "h:"+ minuto + "min");
		System.out.println("O ângulo formato pelos ponteiros é " + retornaAnguloRelogio(hora,minuto)+ "°.");
	}	
	
	public static long retornaAnguloRelogio(int hora, int minuto) {
		long angulo;
		
		if(hora > 12) {
			hora = hora - 12;
		}
		
		angulo = Math.abs((hora * 30) - (minuto * 6));
		
		if(angulo > 180) {
			angulo = 360 - angulo;
		}
		
		return angulo;
	}
}
