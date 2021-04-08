package Entity;



public class Basico extends Estudante {

	private int diaAniversario;
	
	// construtor
	public Basico(String matricula, String cpf, int diaAniversaio) {
		super(matricula, cpf);
		
		this.diaAniversario = diaAniversaio;
	}

	public int getDiaAniversario() {	
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	//metodos 
	
	public void bonusAniversario(int diaAtual) {
		if ( diaAniversario == diaAtual) {
			super.incluirPontos(super.getPontos()*0.10);
		} //criado
	}
	
	
}
