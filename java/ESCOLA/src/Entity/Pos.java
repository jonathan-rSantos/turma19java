package Entity;

public class Pos extends Estudante {
	private double credito;

	public Pos(String matricula, String cpf) {
		super(matricula, cpf);
		this.credito = credito;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public void pedirCreditoPos(double pontos) {
		if(pontos <=5) {
		super.incluirPontos(pontos);
		}
	}

}
