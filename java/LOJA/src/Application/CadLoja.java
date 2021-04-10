package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Bebidas;


public class CadLoja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*List <Bebidas> bebidas = new ArrayList<>();
		
		char continuar = 0;
		do {
		System.out.println("MENU ADMNISTRATIVO");
		System.out.println("1- Adicionar produtos \n2- Venda");
		char opcao = sc.next().charAt(0);
		
		if (opcao == '1') 
		{
			System.out.println("Quantos itens será adicionado? ");
			int qtdeIntens = sc.nextInt();
			
			for (int x=1; x<= qtdeIntens; x++) {
				System.out.println("Item " + x);
				
				
				System.out.println("Digite discrição do produto " + x + ": ");
				String descricao = sc.next();
				System.out.println("Digite o codigo do produto " + x + ": " );
				String codigo = sc.next();
				
				System.out.println("Digite valor unitario do produto "+ x+ ": ");
				double valorUnitario = sc.nextDouble();
				System.out.println("Digite quantidade do produto "+ x + ": ");
				int qtdeDeProdutos = sc.nextInt();
				
				
				bebidas.add(new Bebidas(descricao,codigo,valorUnitario,qtdeDeProdutos));
				
			}
			for (Bebidas produto: bebidas) 
			{
				
				System.out.println("ESTOQUE:\n");
				System.out.println("Descrição: " + produto.getDescricao() + "\nValor: " + produto.getValorUnitario() + "\nQuantidade em estoque: " + produto.getQtdeEstoque());
			
			System.out.println("\n");
			}
			
		}
		else if (opcao == '2'){

			System.out.println("Venda iniciada / Para finalizar digite -99\n\n");
			
			System.out.println("Quantos itens será retirado? ");
			int qtdeIntens = sc.nextInt();
			for (int x=1; x<= qtdeIntens; x++) {
				System.out.println("Item " + x);
				
				System.out.println("Digite quantidade do produto "+ x + ": ");
				int qtdeDeProdutos = sc.nextInt();
				System.out.println("Digite discrição do produto " + x + ": ");
				String descricao = sc.next();
				System.out.println("Digite o codigo do produto " + x + ": " );
				String codigo = sc.next();
				System.out.println("Digite valor unitario do produto "+ x+ ": ");
				double valorUnitario = sc.nextDouble();
				
			bebidas.remove(new Bebidas(descricao,codigo,valorUnitario,qtdeDeProdutos));
			
			}
			for (Bebidas produto: bebidas) 
			{
				System.out.println("ESTOQUE:\n");
				System.out.println("Descrição: " + produto.getDescricao() + "\nValor: " + produto.getValorUnitario() + "\nQuantidade em estoque: " + produto.getQtdeEstoque());
			
			System.out.println("\n");
			}
			
			System.out.println("Deseja continuar? 1- Continuar 2- Não");
			continuar = sc.next().charAt(0);
		}
		
		
		}while (continuar == '1');
		*/
	}

}
