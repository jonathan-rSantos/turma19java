package Exemplo;

import java.util.Scanner;

public class calculoIdade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int valor1, valor2, soma;
		
		System.out.print("Digite o 1° valor: ");
		valor1 = leia.nextInt();
		System.out.print("Digite o 2° valor: ");
		valor2 = leia.nextInt();
		
		soma = valor1+valor2;
		
		System.out.println("A soma dos valores " 
		+ valor1 + " + " + valor2 + " é " + soma);
	}
}
