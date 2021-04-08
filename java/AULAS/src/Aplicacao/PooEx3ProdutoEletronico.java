package Aplicacao;

import java.util.Scanner;

import Classes.ProdutoEletronico;

public class PooEx3ProdutoEletronico {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ProdutoEletronico testeTela = new ProdutoEletronico();
		
		
		
		
		do
		{	
		System.out.println("Digite a senha para desbloquar ");
		
		System.out.print("- ");
		testeTela.senha = sc.nextInt(); 
		testeTela.senhaCorreta(testeTela.senha);
		} while( testeTela.senha != testeTela.senhaCorreta);
		
		int volume;
		System.out.println("O volume inicial " + testeTela.volumeAtual+ " % e vai até 100%%."
				+ "\nDigite volume desejado: ");
		volume = sc.nextInt();
		testeTela.funcoesAumenta(volume);
		System.out.println("                                                           Vol. "+testeTela.volumeAtual
				+ "\n                                                           para alterar digite 0");
		}
	

}
