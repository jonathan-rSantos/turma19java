package Entity;

public class Animal {
	
	//atributos 
	private String nome;
	private int idade;
	private String emiteSom; //*DEVE*     Contrutor
	private String corre;  //*DEVE*   comstrutor
	
	
	//contrutor
	public Animal(String emiteSom, String corre) {
		super();
		this.emiteSom = emiteSom;
		this.corre = corre;
	}

	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEmitirSom() {
		return emiteSom;
	}


	public void setEmitirSom(String emitirSom) {
		this.emiteSom = emitirSom;
	}


	public String getCorrer() {
		return corre;
	}


	public void setCorrer(String correr) {
		this.corre = correr;
	}
	
	//metodos
	
}
