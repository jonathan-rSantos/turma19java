package ListaDeExercicios;

import java.util.Scanner;

public class Categoria {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a idade:");
		idade = leia.nextInt();
		if(idade< 10) {
			System.out.println("Infelizmente você está muito novo, desculpe.");
		}
		if (idade >= 10 && idade <= 14) {
		System.out.println("Você está categorizado no infantil!!");
		}
		if(idade >= 15 && idade <= 17) {
			System.out.println("Você está categorizado no juvenil!!");
		}
		if(idade >= 18 && idade <=25) {
			System.out.println("Você está categorizado no adulto!!");
		}
		if (idade > 25) {
			System.out.println("Acho que você está um pouco velho, vá até uma rede expecifica para sua idade avançada.");
		}
	}
}
