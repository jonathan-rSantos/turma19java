package Exemplo;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	//4 pessoas - nome 
	//4 nota (inteiro entre 1 e 10)
	
	// nome - nota -  ate 5 a nota escreva "ainda não"
	//acima de 5 a nota escreva "muito bem"
	
		String nome [] = new String[3];
		double nota [] = new double[3];
		for(int n=0; n < nome.length; n++) {
			System.out.println("pessoa: " + n);
			System.out.println("Por favor, informe seu nome: ");
			nome [n] = sc.next();
			System.out.println("Por favor, informe a nota: ");
			nota [n] = sc.nextDouble();
		}
		for (int n=0; n <nome.length; n++) {
		if (nota[n] <= 5) {
			System.out.printf("%s - nota %.0f Ainda não!\n", nome[n], nota[n] );
		}
		else if (nota[n] > 5 && nota[n] <=10) {
			System.out.printf("%s - nota %.0f Muito bem!\n", nome[n], nota[n]);
		}
		else {
			System.out.printf("\n%s Nota maior que 10! \n", nome[n]);
		}
		}
		
		
		
	}
	
}
