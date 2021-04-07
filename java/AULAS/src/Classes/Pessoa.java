package Classes;

public class Pessoa {
	
	public String nome;
	public int anoNascimento;
	public char genero; //1- F . SRA  / 2- M SR.  / 3- OU  SRE.
	
	public int calcularIdade() {
		return 2021 - anoNascimento;
	}
	
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
	
	public String tratamento() {
		String saida = "";
		if ( genero == '1') {
			saida = "Sra. ";
		}
		if( genero == '2') {
			saida = "Sr. ";
		}
		else if (genero == '3') {
			saida = "Sre. ";
		}
		return saida;
	}
}
