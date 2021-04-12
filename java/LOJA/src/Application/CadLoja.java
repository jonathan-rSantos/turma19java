package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Bebidas;
import Entity.Produto;


public class CadLoja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidade = 0;
		
		List <Bebidas> bebidas = new ArrayList<>();
		List <Bebidas> carrinho = new ArrayList<>();
		
		Bebidas bebida1 = new Bebidas ("1- Vinho","Vm-suave",27.80, " ", 10);
		Bebidas bebida2 = new Bebidas ("2- Vinho","Vm-seco",27.00, " ",10);
		Bebidas bebida3 = new Bebidas ("3- Cachaça","C-2021",15.00," " , 10);
		Bebidas bebida4 = new Bebidas ("4- Coca-cola","Coca-2l",10.00, " ", 10);
		Bebidas bebida5 = new Bebidas ("5- Fanta laranja","F-laranja",9.80, " " , 10);
		Bebidas bebida6 = new Bebidas ("6- Guarana antartica","G-ant",9.80, " " ,10);
		Bebidas bebida7 = new Bebidas ("7- Jack daniels","J-preta",130.00, " " ,10);
		Bebidas bebida8 = new Bebidas ("8- Red label","R-lab", 130.80, " " , 10);
		Bebidas bebida9 = new Bebidas ("9- Blue label","Blu-lab",150.80," ", 10);
		Bebidas bebida10 = new Bebidas ("10- Black label","Bla-2021", 180.80," " , 10);
		
		
		bebidas.add(0,new Bebidas ("1- Vinho","Vm-suave",27.80, " ", 10));
		bebidas.add(1,new Bebidas ("2- Vinho","Vm-seco",27.00, " ",10));
		bebidas.add(2,new Bebidas ("3- Cachaça","C-2021",15.00," " , 10));
		bebidas.add(3,new Bebidas ("4- Coca-cola","Coca-2l",10.00, " ", 10));
		bebidas.add(4,new Bebidas ("5- Fanta laranja","F-laranja",9.80, " " , 10));
		bebidas.add(5,new Bebidas ("6- Guarana antartica","G-ant",9.80, " " ,10));
		bebidas.add(6,new Bebidas ("7- Jack daniels","J-preta",130.00, " " ,10));
		bebidas.add(7,new Bebidas ("8- Red label","R-lab", 130.80, " " , 10));
		bebidas.add(8,new Bebidas ("9- Blue label","Blu-lab",150.80," ", 10));
		bebidas.add(9,new Bebidas ("10- Black label","Bla-2021", 180.80," " , 10));
		
		char opcao;
		
		
		
		System.out.println("MENU \n 1- adicionar produto");
		do {
		opcao = sc.next().charAt(0);
		if ( opcao == '1')
		{ 	
		System.out.println("Catalogo: ");
		for (Bebidas catalogo : bebidas) {
			System.out.println("Descrição: " + catalogo.getDescricao() + " / Codigo: " + catalogo.getCodigo() + " / Valor unitario: " + catalogo.getValorUnitario() 
			+ " / Marca" + catalogo.getMarca() + " / Quantidade: " + catalogo.getQtdeEstoque());
		}
		System.out.println("Deseja iniciar compra?  1- para sim 2- para não");
		char iniciar = sc.next().charAt(0);
		if(iniciar == '1') {
			System.out.println("Digite a posição de 1 a 10: ");
			char posicao = sc.next().charAt(0);
			
			if(posicao == '1') {
				System.out.println(bebida1.getDescricao() + " " +bebida1.getValorUnitario());
				System.out.println("Deseja adicionar ao carrinho? 1- para sim 2- para não");
				char carrinho1 = sc.next().charAt(0);
				if(carrinho1 == '1') {
					System.out.println("Quantidade: ");
					quantidade = sc.nextInt();
					
					bebida1.tirarEstoque(quantidade);
					
					carrinho.add(new Bebidas ("Vinho","Vm-suave",27.80, " ", quantidade));
					
				}
				for(Bebidas c : carrinho) {
				System.out.println("Carrinho \n" + c.getDescricao() + " " + c.getValorUnitario() + "R$ " + " " + c.getQtdeEstoque() + c.qtdeCarrinho(quantidade));
				}
			}
		}
		}
		
		}while(opcao != '1');
		
		System.out.println("Fim de programa ");
	}
	

}













/*
*/

/*else if (opcao == '2')
{
	System.out.println("Descrição: ");
	String descricao = sc.next();
	System.out.println("Codigo: ");
	String codigo = sc.next();
	System.out.println("Valor unitario: ");
	double valorUnitario = sc.nextDouble();
	System.out.println("Marca do produto: ");
	String marca = sc.next();
	System.out.println("Quantidade: ");
	int quantidadeAdicionada = sc.nextInt();
	
	newProduct.add(new Bebidas (descricao, codigo, valorUnitario , marca, quantidadeAdicionada));
}

else if ( opcao == '3')
{
	String codigo;
	char continuar = 0;
	do {
		System.out.println("Mostrar carrinho 9 \nVenda iniciada \nInforme codigo do produto: ");
		System.out.println("Descrição: ");
		String descricao = sc.next();
		System.out.println("Codigo: ");
		codigo = sc.next();
		System.out.println("Valor unitario: ");
		double valorUnitario = sc.nextDouble();
		System.out.println("Marca do produto: ");
		String marca = sc.next();
		System.out.println("Quantidade: ");
		int quantidadeAdicionada = sc.nextInt();
		newProduct.remove(new Bebidas (descricao, codigo, valorUnitario , marca, quantidadeAdicionada));
		carrinho.add(new Bebidas (descricao, codigo , valorUnitario , marca, quantidadeAdicionada));
		
		System.out.println("Continuar? 1 (sim)  9 ( nao)" );
		continuar = sc.next().charAt(0);
		
	}while(continuar != '9');
	System.out.println("Carinho");
	for (Bebidas produtos : carrinho) {
		System.out.println(produtos.getDescricao() + " "  + produtos.getCodigo() + " " + produtos.getValorUnitario() + " " + produtos.getQtdeEstoque());
	
	}
}*/
