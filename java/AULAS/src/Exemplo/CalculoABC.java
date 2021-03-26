package Exemplo;

import java.util.Scanner;

public class CalculoABC {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, r, s;
	
		System.out.println("Digite o 1° valor: ");
		a = leia.nextInt();
		System.out.println("Digite o 2° valor: ");
		b = leia.nextInt();
		System.out.println("Digite o 3° valor: ");
		c = leia.nextInt();
		
		r = (a + b) ^ 2;
		s = (b + c) ^ 2;
		d = (r + s) / 2;
		
		System.out.println("O resultado do calculo é: " + d + "!!");
		
	}
}
