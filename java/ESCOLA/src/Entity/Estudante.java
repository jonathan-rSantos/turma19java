package Entity;

public class Estudante {
	//atributos 
	private String matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	
	

	//construtores minimo aluno
	public Estudante(String matricula, String cpf) {
		
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}
	
	//getters and setters

	public String getMatricula() {
		return matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public double getPontos() {
		return pontos;
	}


	public boolean isStatus() {
		return status;
	}

	public void setStatus() {
		this.status = status;
	}
	
	//metodos funcao adicionarNota
	//metodos funcao tirarNota
	
	public void incluirPontos(double pontoAdicionado) {
		this.pontos += pontoAdicionado;
	}
	
	public void tirarPontos(double pontoTirado) {
		this.pontos -= pontoTirado;
	}
}
