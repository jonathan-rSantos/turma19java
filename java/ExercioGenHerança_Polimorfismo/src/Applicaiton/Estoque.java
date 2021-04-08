package Applicaiton;

import java.util.Scanner;

import Entity.List;

public class Estoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//Crie uma um programa para trabalhar com estoque de uma loja
		
		List novaList = new List ();
		

//o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque
//o programa deverá atender as seguintes funcionalidades:
		//Armazenar dados da List
		//Remover dados da list;
		//Atualizar dados da list.
		//Apresentar todos os dados da list.
		System.out.print("Qtde de dados: ");
		int dados = sc.nextInt();
		novaList.armazenarDadosList(dados);
		
		System.out.println("Qtde de dados a retirar?");
		int retira = sc.nextInt();
		novaList.removerDadosList(retira);
		novaList.atualizarDadosList();
		novaList.apresentartodosDadoslist();
		
		

	}

}
