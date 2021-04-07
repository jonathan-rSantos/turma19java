package Classes;

public class Cliente {

	//Crie uma classe cliente e apresente os atributos e métodos referentes esta classe
	
	//atributos
	public String nome;
	public String rg;
	public String cpf;
	public int idade, produtos;
	public double carrinho;
	public String opcao;
	
	public void adicionaAoCarrinho (double valor) {
	carrinho = valor;
	}
	
	public void produtos (int valor) {
			produtos += valor;
	}
	
}
