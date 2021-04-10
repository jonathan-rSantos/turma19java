package Application;

import java.util.Scanner;

import Entity.Produto;
import Entity.Revista;
import Entity.Roupa;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Roupa camisa = new Roupa("CAMISA" , "XL001", 100.25, "Lacoste", 10);
		Revista revista = new Revista("RevistaVj", "LD302", 9.99, 10, "Folha");
		Roupa calça = new Roupa("Calça","Cç3021" , 70.50, "Calvin K.", 10);
		
		
		camisa.setValorUnitario(80);
		camisa.incluirEstoque(10);
		revista.incluirEstoque(50);
		calça.incluirEstoque(20);
		
		
		System.out.println(camisa.getDescricao() + " R$ " + camisa.getValorUnitario() 
				+ " estoque: " + camisa.getQtdeEstoque());
		
		System.out.println("\n" + revista.getDescricao() + " R$ " 
		+ revista.getValorUnitario() + " estoque: " + revista.getQtdeEstoque());
		System.out.println("Editora: " + revista.getEditora());
		
		System.out.println("\n" + calça.getDescricao()+ " R$ " + calça.getValorUnitario() 
		+ " estoque: "+ calça.getQtdeEstoque() + "\nMarca: " + calça.getMarca());
	}

}
