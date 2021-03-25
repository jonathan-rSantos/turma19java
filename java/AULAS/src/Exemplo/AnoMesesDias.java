package Exemplo;

import java.util.Scanner;

public class AnoMesesDias {

	public static void main(String[] args) {
//Faça um sistema que leia a idade de uma pessoa expressa em anos
//meses e dias e mostre-a expressa apenas em dias. 
		Scanner leia = new Scanner(System.in); 
				int anos, meses, dias, anoAtual = 2021, anosMesesDias;
			System.out.println("Digite sua  idade somente em anos: ");
			anos = leia.nextInt();
			System.out.println("Digite sua idade somente em meses: ");
			meses = leia.nextInt();
			System.out.println("Digite sua idade somente em dias: ");
			dias = leia.nextInt();
			
			dias = (dias + (anos*365)+ (meses*30));
			
			System.out.println(dias);
	}
}
