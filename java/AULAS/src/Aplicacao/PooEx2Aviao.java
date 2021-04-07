package Aplicacao;

import java.util.Scanner;

import Classes.Aviao;

public class PooEx2Aviao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aviao testeAviao = new Aviao();
		
		char opcao;
		
		System.out.println("CHEGAMOS AO FIM DO LIMITE DE TEMPO PARA EMBARQUE!"
				+ "\nEste é o painel com perguntas feitas pelo comandante do avião para a aeromoça responsavél!"
				+ "\n1- Todos passageiros entraram?");
		testeAviao.fechaPorta();
		}
			
}
