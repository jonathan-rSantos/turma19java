package Entity;

public class Mestrado extends Estudante{
	private double creditoMestrado;

	public Mestrado(String matricula, String cpf) {
		super(matricula, cpf);
		this.creditoMestrado = creditoMestrado;
	}

	public double getCreditoMestrado() {
		return creditoMestrado;
	}

	public void setCreditoMestrado(double creditoMestrado) {
		this.creditoMestrado = creditoMestrado;
	}
	
	public void usarCreditoMestrado() {
		
	}

}
