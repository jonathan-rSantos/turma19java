package Exemplo;

import java.util.Scanner;

public class CalculoABC {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, R, S;
		System.out.println("Digite o 1° valor: ");
		A = leia.nextInt();
		System.out.println("Digite o 2° valor: ");
		B = leia.nextInt();
		System.out.println("Digite o 3° valor: ");
		C = leia.nextInt();
		
		R = (A + B) ^ 2;
		S = (B + C) ^ 2;
		D = (R + S) / 2;
		
		System.out.println("O resultado do calculo é: " + D + "!!");
		
	}
}
