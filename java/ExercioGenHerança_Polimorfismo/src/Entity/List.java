package Entity;

public class List {
	
	//atributo
	private int list;
	
	/*Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.*/
	
	//construtor não tem
	
	
	//gatters and setters
	public int getList() {
		return list;
	}

	public void setList(int list) {
		this.list = list;
	}

	//metodos
	
	public void armazenarDadosList(int dados) {
		this.list += dados;
	}
	public void removerDadosList(int dados) {
		this.list -= dados;
	}
	public void atualizarDadosList() {
	System.out.printf("Dados atualizados\n");	
	}
	public void apresentartodosDadoslist() {
		System.out.println(this.list + " dados.");
	}
}
