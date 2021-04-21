package Entity;

import java.util.Scanner;


public class Bebidas extends Produto{
	private static String marca; // METODO STATIC
	
	
	Scanner sc = new Scanner (System.in);

	public Bebidas(String descricao, String codigo, double valorUnitario, String marca, int qtdeEstoque) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.marca = marca;
	}

	public static String getMarca() {
		return marca;
	}


	public static void setMarca(String marca) {
		Bebidas.marca = marca;
	}

	@Override
	public void incluirEstoque(int valorSerIncluido) { 
		incluirEstoque(valorSerIncluido);
			
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
	
	
}
