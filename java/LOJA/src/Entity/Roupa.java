package Entity;

public class Roupa extends Produto {
	
	private String marca;

	public Roupa(String descricao, String codigo, double valorUnitario, String marca) {
		super(descricao, codigo, valorUnitario);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	
}
