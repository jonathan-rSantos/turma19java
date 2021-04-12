package Entity;

public class Loja extends Bebidas{

	private String nome;
	private String cnpj;

	
	

	
	
	
	public Loja(String descricao, String codigo, double valorUnitario, String marca, int qtdeEstoque, String nome,
			String cnpj) {
		super(descricao, codigo, valorUnitario, marca, qtdeEstoque);
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void emitirNotaFiscal() {
		//EMISSÃO DE NOTA FISCAL NOME DA LOJA // CNPJ //NUMERO NF //NOME ITEM - **QTDE** - VALOR UNITARIO VALOR TOTAL
		//VALOR TOTAL
		//VALOR IMPOSTO 9%
		//VALOR DESCONTO 10%
		//VALOR JUROS 10% - 20%
		//VALOR DAS PARCELAS
		System.out.println("Estabelecimento: "+getNome()+"\nCnpj: "+getCnpj()+"\nItem: "+ getDescricao() +
		 "\nValor unitario: " + getValorUnitario() +  "\nValor total: ");
	
	}
	
	
}
