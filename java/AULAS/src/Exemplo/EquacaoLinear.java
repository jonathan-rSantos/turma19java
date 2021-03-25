package Exemplo;

import java.util.Scanner;

public class EquacaoLinear {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c , d, f, g;
		int x, y;
		
		System.out.println("Digite a");
		a = leia.nextInt();
		System.out.println("Digite b");
		b = leia.nextInt();
		System.out.println("Digite c");
		c = leia.nextInt();
		System.out.println("Digite d");	
		d = leia.nextInt();
		System.out.println("Digite f");
		f = leia.nextInt();
		System.out.println("Digite g");
		g = leia.nextInt();
						
		x = ((c * f) - (c * g) / (a * f) - (b * d));
		y= ((a * g)-(c * d) / (a * f) - (b * d));
		System.out.println("VALOR DE EQUACAÇÃO LINEAR");
		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);
	
	}

}
