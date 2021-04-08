package Entity;

public class Medio extends Estudante{

	private int contadorBoletim=3;

	public Medio(String matricula, String cpf) {
		super(matricula, cpf);
		this.contadorBoletim = contadorBoletim;
	}

	public int getContadorBoletim() {
		return contadorBoletim;
	}

	public void setContadorBoletim(int contadorBoletim) {
		this.contadorBoletim = contadorBoletim;
	}
	
	public void imprimirBoletim(int opcao) {
		contadorBoletim--;
		{	System.out.println("BOLETIM\nMATRICULA: " + super.getMatricula() + "\nCPF: " + super.getCpf()
			+ "\nPONTOS: " + super.getPontos() );
		}
		}
	}
	
