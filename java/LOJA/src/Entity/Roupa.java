package Entity;

public class Roupa extends Produto {
	
	private String marca;

	public Roupa(String descricao, String codigo, double valorUnitario, String marca, int qtdeEstoque) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	
}
