package ListaDeExercicios;

import java.util.Scanner;

public class ValorMaior {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int valor1, valor2, valor3;
		
		System.out.println("Digite 3 numeros numeros, iremos indicar qual numero � o maior: \n1� numero: ");
		valor1 = leia.nextInt();
		System.out.println("2� numero: ");
		valor2 = leia.nextInt();
		System.out.println("3� numero:");
		valor3 = leia.nextInt();
				
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor � o 1�: "+ valor1);
		}
		if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior valor � o 2�:"+ valor2);
		}
		if (valor3 > valor1 && valor3 > valor2) {
			System.out.println("O maior valor � o 3�:"+ valor3);
		}
		
		
	}

}
