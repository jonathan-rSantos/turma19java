package ExerciciosGen;

import java.util.Scanner;

public class Repeti��oEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		int numeros=0, contadorPar=0, contadorImpar=0;
		System.out.print("Digite 10 numeros: ");
		for (int n=1; n<=10; n++) {
			System.out.print("Digite numero: ");
			numeros = sc.nextInt();
			if (numeros % 2 == 0) {
				contadorPar++;
			}
			if (numeros % 2 == 1) {
				contadorImpar++;
			}
		}
		System.out.println("Valores pares: " + contadorPar);
		System.out.println("Valores impares: " + contadorImpar);
		
		
	}

}
