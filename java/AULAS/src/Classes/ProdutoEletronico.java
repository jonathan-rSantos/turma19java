package Classes;

public class ProdutoEletronico {
	public int senha;
	public int senhaCorreta;
	public boolean bloqueioTela, desliga;
	public int volumeAtual = 50;
	
	
		public void senhaCorreta(int senha) {
		
		if (this.senha != 9733) 
		{
		for(int x=1; x<=30; x++) 
		{
		System.out.println("\n");
		}
		System.out.println("Senha incorreta, tente de novo!");
		}
		else 
		{
			this.senha = senhaCorreta;
		}
		}

		public void funcoesAumenta(int volume) {
			volume = volumeAtual;
		}



}
