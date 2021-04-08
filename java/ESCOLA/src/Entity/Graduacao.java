package Entity;

public class Graduacao extends Estudante{
	private double bonusGraduacao;

	public Graduacao(String matricula, String cpf) {
		super(matricula, cpf);
		this.bonusGraduacao = bonusGraduacao;
	}

	public double getBonusGraduacao() {
		return bonusGraduacao;
	}

	public void setBonusGraduacao(double bonusGraduacao) {
		this.bonusGraduacao = bonusGraduacao;
	}
	
	public void usarBonusGraduacao () {
		
	}

}
