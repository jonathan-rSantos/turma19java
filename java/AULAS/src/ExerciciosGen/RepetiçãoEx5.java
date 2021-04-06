package ExerciciosGen;

import java.util.Scanner;

public class RepetiçãoEx5 { 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		int numero, soma = 0;
		
		do 
		{
			
		System.out.print("[Digite 0- para finalizar] \nDigite um numero: ");
			numero = sc.nextInt();
			soma += numero;
		} while (numero != 0);
		System.out.println("A soma é: " + soma);
		
	}

}
