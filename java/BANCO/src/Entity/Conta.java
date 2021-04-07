package Entity;
public class Conta {

	public int numero;
	public String cpf;
	private double saldo;
	public boolean ativa;
	public String nomeBanco, logotipo;
	
	
	//Contrutor 
	public Conta (String nomeBanco, String logotipo) {
		this.nomeBanco = nomeBanco;
		this.logotipo = logotipo;
	}
	//encapsulamento

	public double getSaldo() {
		return this.saldo;
	}
	
	//metodo
	//debito pega saldo menos o valor irformado e informa novo saldo
	public void debito (double valor) {
		saldo-= valor;
		
	}
	//credito pega o saldo mais o valor irformado e adiciona ao saldo
	public void credito (double valor) {
		saldo+=valor;
	}
		
	
	
}
