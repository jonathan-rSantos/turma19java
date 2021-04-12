package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Bebidas;
import Entity.Produto;


public class CadLoja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bebidas prod1 = new Bebidas ("Vinho de mesa suave","Vm-suave",27.80, 10);
		Bebidas prod2 = new Bebidas ("Vinho de mesa seco","Vm-seco",27.00, 10);
		Bebidas prod3 = new Bebidas ("Cachaça","C-2021",15.00, 10);
		Bebidas prod4 = new Bebidas ("Coca-cola","Coca-2l",10.00, 10);
		Bebidas prod5 = new Bebidas ("Fanta laranja","F-laranja",9.80, 10);
		Bebidas prod6 = new Bebidas ("Guaraná antartica","G-ant",9.80, 10);
		Bebidas prod7 = new Bebidas ("Jack daniels","J-preta",130.00, 10);
		Bebidas prod8 = new Bebidas ("Red label","R-lab", 130.80, 10);
		Bebidas prod9 = new Bebidas ("Blue label","Blu-lab",150.80, 10);
		Bebidas prod10 = new Bebidas ("Black label","Bla-2021", 180.80, 10);
		
		char opcao;
		
		List <Bebidas> newProduct = new ArrayList<>();
		
		
		
		do {
		System.out.println("MENU \n 1- adicionar produto 2- retirar produto 3- iniciar venda");
		opcao = sc.next().charAt(0);
		if ( opcao == '1')
		{ 
		System.out.println("Descrição: ");
		String descricao = sc.next();
		System.out.println("Codigo: ");
		String codigo = sc.next();
		System.out.println("Valor unitario: ");
		double valorUnitario = sc.nextDouble();
		System.out.println("Quantidade: ");
		int quantidadeAdicionada = sc.nextInt();
		
		newProduct.add(new Bebidas (descricao, codigo, valorUnitario , quantidadeAdicionada));
		}
		else if (opcao == '2')
		{
			System.out.println("Codigo: ");
			String codigo = sc.next();
			if (codigo.contains(codigo)) {
				System.out.println("Quantidade: ");
				int quatidadeTirada = sc.nextInt();
				newProduct.remove(quatidadeTirada);
			}
			else if ( opcao == '3')
			{
				int continuar=0;
				do {
		
				System.out.println("Mostrar carrinho -99 \nVenda iniciada \nInforme codigo do produto: ");
				System.out.println("Codigo: ");
				String codigoProduto = sc.next();
				if (codigo.contains(codigoProduto)) {
					System.out.println("Quantidade: ");
					int quatidadeTirada = sc.nextInt();
					newProduct.remove(quatidadeTirada);
					
				}
				}while(continuar != -99);
			}
			System.out.println("Carinho");
			
			
		}
		}while(opcao != '1' && opcao != '2' && opcao != '3' );
		
		System.out.println("Fim de proogama ");
	}

}
