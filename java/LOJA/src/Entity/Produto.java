package Entity;

public abstract class Produto {
	
	//atributos
	private String descricao;
	private String codigo;
	private double valorUnitario;
	protected int qtdeEstoque;
	
		
		
		//construtor
	//construtor1
	public Produto(String descricao, String codigo, double valorUnitario, int qtdeEstoque) {	
		super(); //classe mãe
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}
	
	//contrutor2
	
	public Produto (String descricao ,String codigo ,double valorUnitario) {
		super();
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}
	
	
	//encapsulamento - getter and setters
	//GETTER DESCRIÇÃO
	public String getDescricao() {
		return descricao;
	}

	//encapsulamento - getter and setters
	//SETTER DESCRIÇÃO
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//encapsulamento - getter and setters
	public String getCodigo() {
		return codigo;
	}
	
	//encapsulamento - getter and setters
	
	//SETTER EXCLUIDO PARA NÃO AUTERAR CODIGO
	
	//public void setCodigo(String codigo) {
		//this.codigo = codigo;
	//}
	
	//encapsulamento - getter and setters
	public double getValorUnitario() {
		return valorUnitario;
	}
	
	//encapsulamento - getter and setters
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	//encapsulamento - getter and setters
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	
	//public void setQtdeEstoque(int qtdeEstoque) {
	//this.qtdeEstoque = qtdeEstoque;
	//}
	
	
	//metodos
	public void incluirEstoque(int valorSerIncluido) { // quantidade de estoque + valor a ser inserido
	  this.qtdeEstoque += valorSerIncluido;
		
	}
	//metodos
	public void tirarEstoque(int valorSerExcluido) {
		if (qtdeEstoque >= valorSerExcluido) {
		qtdeEstoque -= valorSerExcluido;
		}	
		else {
			System.out.println("Estoque indisponivel!");
		}
	}
}
