package Entity;

import java.util.Scanner;


public class Bebidas extends Produto{
	private static String marca;
	private int qtdeEstoque;
	
	
	Scanner sc = new Scanner (System.in);

	public Bebidas(String descricao, String codigo, double valorUnitario, String marca, int qtdeEstoque) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.marca = marca;
		this.qtdeEstoque = qtdeEstoque;
	}


	public int getQtdeEstoque() {
		return qtdeEstoque;
	}


	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
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
		if (getQtdeEstoque() >= valorSerExcluido) {
			super.tirarEstoque(valorSerExcluido);
			}	
			else {
			System.out.println("Estoque indisponivel!");
			}
		
	}
	
	
}
