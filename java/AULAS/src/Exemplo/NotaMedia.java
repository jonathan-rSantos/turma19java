package Exemplo;

import java.util.Scanner;

public class NotaMedia {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, mediaPonderada, media; 
		
		System.out.println("Digite a 1° nota do aluno: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a 2° nota do aluno: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a 3° nota do aluno: ");
		nota3 = leia.nextDouble();
		
		int pesoNotas = 2 + 3 + 5;
		media = (nota1 + nota2 + nota3) / 3;
		mediaPonderada = (nota1 * 2) + (nota2 * 3) + (nota3 * 5) / pesoNotas;
		
		System.out.println("A média é: " + media);
		System.out.println("A média podenderada é: " + mediaPonderada);
		
				
			
	}

}
