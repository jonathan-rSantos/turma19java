package ExerciciosGen;

import java.util.Scanner;

public class RepetiçãoEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		/*Informar todos os números de 1000 a 1999 
		*que quando divididos por 11 obtemos resto = 5. (FOR)
		*/
		
		double resultado;
		
		for ( int n= 1000; n<=1999; n++) {
			if (n % 11 == 5) {
				resultado = n;
				System.out.printf("%.0f, " , resultado);
			}
		}
		
		 
		
		
		
	}
}
