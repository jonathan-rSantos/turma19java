package TestesIniciais;

import java.util.Scanner;

public class lista3ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	//Ler um valor inteiro (aceitar somente valores entre 1 e 10) 
	//e escrever a tabuada de 1 a 10 do valor lido.
		
		int valor, resultado;
			
		System.out.println("Digite um número entre 1 e 10: ");
		valor = sc.nextInt();

		if (valor >0 && valor <=10) {
			for (int c=1; c<=10; c++) {
				resultado = valor * c;
				System.out.print(resultado + ",");
			}
		} else {
			System.out.println("Valor maior que 10!");
			return ;
		}
			
		
		
		
	}
}