package ExerciciosGen;

import java.util.Scanner;

public class RepetiçãoEx6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
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
		
		System.out.println("A soma dos valores multiplos de 3 são: " + mediaMultiplos3);
	}

}

		

