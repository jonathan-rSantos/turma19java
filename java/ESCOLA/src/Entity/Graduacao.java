package Entity;

public class Graduacao extends Estudante{
	private int bonusGraduacao;

	public Graduacao(String matricula, String cpf) {
		super(matricula, cpf);
	}

	public double getBonusGraduacao() {
		return bonusGraduacao;
	}

	public void setBonusGraduacao(int bonusGraduacao) {
		this.bonusGraduacao = bonusGraduacao;
	}
	
	public void usarBonusGraduacao (int bonusPontos) {
		super.incluirPontos(bonusPontos);
		
	}

}
