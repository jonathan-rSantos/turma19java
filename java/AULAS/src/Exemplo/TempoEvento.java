package Exemplo;

import java.util.Scanner;

public class TempoEvento {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double totalSegundos, horas, minutos, segundos;
			
		System.out.println("Digite o tempo de duração do evento"
				+ " em segundos totais: ");
		totalSegundos = leia.nextInt();
		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos % 3600) % 60;
		System.out.printf("Horas: %.0f minutos %.0f segundo %.0f"
		,horas, minutos, segundos);
	}
}
