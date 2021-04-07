package Aplicacao;

import java.util.Scanner;

import Classes.Cliente;

public class PooEx1Cliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//em seguida crie um objeto cliente
		//defina as instancias deste objeto 
		//e apresente as informações deste objeto no console.
		
		//CLIENTE DE LOJA DE ROUPA
		Cliente cliente1 = new Cliente();
		
		System.out.println("Digite seu nome: ");
		cliente1.nome = sc.next();
		System.out.println("Digite sua idade: ");
		cliente1.idade = sc.nextInt();
		System.out.println("Digite RG: ");
		cliente1.rg = sc.next();
		System.out.println("Digite CPF: ");
		cliente1.cpf = sc.next();
		
		System.out.println("Quantos produtos sera passado? ");
		int valor = sc.nextInt();
		cliente1.produtos(valor); 
		
		System.out.println("Valor do produto? ");
		double valorD = sc.nextDouble();
		cliente1.adicionaAoCarrinho(valorD);
		
		System.out.println(cliente1.nome+" tem "+cliente1.idade+ " anos.\nRG: "+cliente1.rg+"\nCPF: "+cliente1.cpf);
		System.out.println("Produtos: "+cliente1.produtos+"\nValor total: "+cliente1.carrinho);
	}

}
