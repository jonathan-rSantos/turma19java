package TestesIniciais;

import java.util.Scanner;

public class Lista3ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Fazer um programa para encontrar todos os pares entre 1 e 100.
		
		for (int c=1;c<=100;c++) {
			if(c % 2 == 0) {
				System.out.println(c + ",");	
			}
			
		}
		
	}
}
