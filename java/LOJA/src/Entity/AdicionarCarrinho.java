package Entity;

public class AdicionarCarrinho extends Produto{

	private int numeroCarrinho;
	public AdicionarCarrinho(String descricao, String codigo, double valorUnitario) {
		super(descricao, codigo, valorUnitario);
		// TODO Auto-generated constructor stub
	}
	public AdicionarCarrinho(String descricao, String codigo, double valorUnitario, int qtdeEstoque,
			int numeroCarrinho) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.numeroCarrinho = numeroCarrinho;
	}
	
	
	public void adicionarCarrinho(String descricao, String codigo, double valorUnitario) {
		super.setDescricao(descricao);
		super.getCodigo();
		super.setValorUnitario(valorUnitario);
	}

}
