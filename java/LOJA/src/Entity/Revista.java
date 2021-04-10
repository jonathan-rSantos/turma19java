package Entity;

public class Revista extends Produto {

	private String editora;
 
	
	public Revista(String descricao, String codigo, double valorUnitario, int qtdeEstoque2, String editora) {
		super(descricao, codigo, valorUnitario, qtdeEstoque2);
		this.editora = editora;
	}

	public String getEditora() {
		return editora;
	}


}
