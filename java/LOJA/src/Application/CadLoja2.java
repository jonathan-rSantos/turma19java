package Application;

import java.util.Scanner;

import Entity.Bebidas;

public class CadLoja2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 Bebidas prod = new Bebidas("","",0.00," " , 10);
		
		 char opcao;
		 
		do 
		 {
			 System.out.println("MENU \nDIGITE A OPÇÃO DESEJADA \n1- INCLUIR EM ESTOQUE 2- RETIRAR DO ESTOQUE 3- VENDA 4- SAIR");
		opcao = sc.next().charAt(0);
		while (opcao != '1' || opcao != '2' || opcao != '3' || opcao != '4' ) {
			System.out.println("OPCÃO INVALIDA, DIGITE ENTRE UM NUMERO ENTRE 1 E 5.\n");
			 System.out.println("MENU \nDIGITE A OPÇÃO DESEJADA \n1- INCLUIR EM ESTOQUE 2- RETIRAR DO ESTOQUE 3- VENDA - 4- MOSTRAR ESTOQUE 5- SAIR");
				opcao = sc.next().charAt(0);
		} 
		
			
			if (opcao == '1') {
			 prod.cadastroEmEstoque();
			 prod.mostrarEstoque();
			}
			else if (opcao == '2') {
				 System.out.println("Quantidade a ser retirado: ");
				 int qtdeAdicionada = sc.nextInt();
				 prod.tirarEstoque(qtdeAdicionada);
			}
			else if(opcao == '3') {
				prod.vendaDeItens();
			}
			
			
			System.out.println("DESEJA CONTINUAR? 1- SIM 4- SAIR ");
			opcao = sc.next().charAt(0);
			
			
			
		 }while (opcao != '4');
		System.out.println("FIM DE PROGAMA!!!!!");
		
		
		
		
	}

}
