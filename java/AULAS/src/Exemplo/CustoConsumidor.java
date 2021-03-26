package Exemplo;

import java.util.Scanner;

public class CustoConsumidor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valorCusto;
		
		System.out.println("Por favor digite o valor do custo de fabricação do automovel: ");
		valorCusto = leia.nextInt();
		double destribuidor = valorCusto * 0.28;  
		double imposto = valorCusto * 0.45;
		double valorFinal = destribuidor + imposto + valorCusto;

		System.out.println("O custo do destribuidor sobre o custo de fabricação é: "
		+ destribuidor);
		System.out.println("O valor do imposto sobre o custo de fabricação é: "
		+ imposto);
		System.out.println("O valor final para o consumidor é de: "+ valorFinal);
		
		
	}
}
