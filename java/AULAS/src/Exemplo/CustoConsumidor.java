package Exemplo;

import java.util.Scanner;

public class CustoConsumidor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
// O custo ao consumidor de um carro novo � a soma do custo de f�brica
//com a percentagem do distribuidor e dos impostos 
//(aplicados ao custo de f�brica). 
//Supondo que a percentagem do distribuidor seja de 28%
//e os impostos de 45%
			
		int valorCusto;
		
		System.out.println("Por favor digite o valor do custo de fabrica��o do automovel: ");
		valorCusto = leia.nextInt();
		double destribuidor = valorCusto * 0.28;  
		double imposto = valorCusto * 0.45;
		double valorFinal = destribuidor + imposto + valorCusto;

		System.out.println("O custo do destribuidor sobre o custo de fabrica��o �: "
		+ destribuidor);
		System.out.println("O valor do imposto sobre o custo de fabrica��o �: "
		+ imposto);
		System.out.println("O valor final para o consumidor � de: "+ valorFinal);
		
		
	}
}
