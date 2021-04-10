package Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bebidas extends Produto{
	protected static int marca;
	List <Bebidas> bebidas = new ArrayList<>();
	
	
	Scanner sc = new Scanner (System.in);

	public Bebidas(String descricao, String codigo, double valorUnitario, int qtdeEstoque2) {
		super(descricao, codigo, valorUnitario, qtdeEstoque2);
		// TODO Auto-generated constructor stub
	}
	
	

	public Bebidas(String descricao, String codigo, double valorUnitario) {
		super(descricao, codigo, valorUnitario);
	}



	public static int getMarca() {
		return marca;
	}

	public static void setMarca(int marca) {
		Bebidas.marca = marca;
	}
	
	@Override
	public void incluirEstoque(int valorSerIncluido) { // quantidade de estoque + valor a ser inserido
		super.incluirEstoque(valorSerIncluido);
			
		}
		//metodos
	@Override
	public void tirarEstoque(int valorSerExcluido) {
			if (super.getQtdeEstoque() >= valorSerExcluido) {
			super.tirarEstoque(valorSerExcluido);
			}	
			else {
				System.out.println("Estoque indisponivel!");
			}
		}
	

	
		
		public void cadastroEmEstoque () {
			System.out.println("Quantos itens serão adicionado? ");
			int qtdeIntens = sc.nextInt();
			
			for (int x=1; x<= qtdeIntens; x++) {
				System.out.println("Item " + x);
				
				System.out.println("Digite discrição do produto " + x + ": ");
				String descricao = sc.next();
				System.out.println("Digite o codigo do produto " + x + ": " );
				String codigo = sc.next();
				System.out.println("Digite valor unitario do produto "+ x+ ": ");
				double valorUnitario = sc.nextDouble();
				System.out.println("Digite a quantidade do produto "+ x + ": ");
				int qtdeDeProdutos = sc.nextInt();
				
				bebidas.add(new Bebidas(descricao,codigo,valorUnitario,qtdeDeProdutos));
				}
		}
		
		@SuppressWarnings("unlikely-arg-type")
		public void vendaDeItens () {
			
			System.out.println("Digite discrição do produto: ");
			String descricao = sc.next();
			if (bebidas.contains(descricao)) {
				System.out.println("Quantidade a ser retirada dos estoque: ");
				int qtdeSerRetirada = sc.nextInt();
				super.tirarEstoque(qtdeSerRetirada);
				
			}else {
				System.out.println("Não temos itens em estoque!");
			}
			
			
			
			
		}
		public void mostrarEstoque () {
			for (Bebidas produto: bebidas) 
			{
				
				System.out.println("ESTOQUE:\n");
				System.out.println("Descrição: " + produto.getDescricao() + "\nValor: " + produto.getValorUnitario() + "\nQuantidade em estoque: " + produto.getQtdeEstoque());
			
			System.out.println("\n");
			}
		}
	
	
	
	
}
