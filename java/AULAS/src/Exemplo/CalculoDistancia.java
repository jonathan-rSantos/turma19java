package Exemplo;

import java.util.Scanner;

public class CalculoDistancia {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x1, x2, y1, y2, distancia;
		
		System.out.println("Digite o valor do 1° ponto x: ");
		x1 = leia.nextInt();
		System.out.println("Digite o valor do 2° ponto x: ");
		x2 = leia.nextInt();
		System.out.println("Digite o valor do 1° ponto y: ");
		y1 = leia.nextInt();
		System.out.println("Digite o valor do 2° ponto y: ");
		y2 = leia.nextInt();
		
		distancia = ((x2 - x2) ^ 2 + (y2 - y1) ^ 2) ;
		System.out.println("A distancia entre os pontos é: " + distancia);
	}

}
