package ExerciciosGen;

import java.util.Scanner;

public class Repeti��oEx6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Escrever um programa que receba v�rios n�meros INTEIRO no teclado. 
		//E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
		//Para sair digitar 0(zero).(DO...WHILE)

		double valores, soma = 0, mediaMultiplos3 =0, contador=0;
		
		do {
			System.out.println("Digite os valores: ");
			valores = sc.nextDouble();
			if (valores % 3 == 0 && valores >0) {
				soma += valores;
				contador++;
			}
		}while (valores !=0); 
		//final
		mediaMultiplos3 = soma / contador;
		
		System.out.println("A soma dos valores multiplos de 3 s�o: " + mediaMultiplos3);
	}

}

		

