package Exemplo;

import java.util.Scanner;

public class TempoEvento {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
//Fa�a um sistema que leia o tempo de dura��o de um evento
//em uma f�brica expressa em segundos e mostre-o expresso em horas
//minutos e segundos. 

			int totalSegundos;
			double horas, minutos, segundos;
			
			
			System.out.println("Digite o tempo de dura��o do evento"
					+ "em horas totais: ");
			totalSegundos = leia.nextInt();
			horas = totalSegundos / 3600;
			minutos = (totalSegundos % 3600) / 60;
			segundos = (totalSegundos % 3600) % 60;
			System.out.println(horas + " horas " + minutos 
					+ " minutos " + segundos + " segundos!");
	}
}
