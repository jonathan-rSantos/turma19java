package Exemplo;

import java.util.Scanner;

public class Auxilio {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*NOVO PROCESSO AUXILIO ASSISTENCIAL
		 * se recebeu antes auxilio
		 * Se a pessoa recebe bolsa familia
		 * se � chefa de familia
		 * 
		*/
		double casoNaoChefa = 300.00;
		double casoChefaDeFamilia = 600.00;
		double valorPorFilho = 50.00;
		int chefaDeFamilia, auxilioAnterior, casoBolsaFamilia, numeroFilhos;  	
		String nome;

		System.out.println("OL� PASSE ALGUMAS INFORMA��ES E IREMOS CALCULAR SE O AUXILIO EST� LIBERADO E SEU VALOR. "
				+ "\nprimeiro informe seu nome:");
		nome = leia.next();
		System.out.println(nome + ", Voc� j� recebeu o auxilio assistencial anteriormente? \nResponda 1- para sim / 2- para n�o. \nR:");
		auxilioAnterior = leia.nextInt();
		if (auxilioAnterior == 2) {
			System.out.println("Ops, voc� n�o ter� direito ao auxilio assistencial,pois, n�o o recebeu anteriormente\n"
					+ "Boa sorte!");
		} else {
		System.out.println(nome + ", voc� j� recebeu o bolsa familia anteriormente? \nResponda 1- PARA SIM / 2- PARA N�O. \nR:");
		casoBolsaFamilia = leia.nextInt();
		System.out.println(nome + ", voc� � chefa de familia? \nResponda 1- PARA SIM / 2- PARA N�O. \nR:");
		chefaDeFamilia = leia.nextInt();
		System.out.println(nome + ", quantos filhos voc� tem? \nR:");
		numeroFilhos = leia.nextInt();
		
		if (auxilioAnterior == 1 && casoBolsaFamilia == 2 && chefaDeFamilia == 1)
		{
		valorPorFilho *= numeroFilhos;
		casoChefaDeFamilia += valorPorFilho;
		System.out.println( nome + ", ser� liberado para voc� " + casoChefaDeFamilia);
		}
		if (auxilioAnterior == 1 && casoBolsaFamilia == 2 && chefaDeFamilia == 2)
		{
			System.out.println(nome + ", ser� liberado para voc�" + casoNaoChefa);
		}
		if (auxilioAnterior == 1 && casoBolsaFamilia == 1) {
			System.out.println("Ops, voc� n�o ter� direito ao auxilio assistencial, pois, recebeu o bolsa familia anteriormente. "
					+ "\nBoa sorte!");
		}
		if (auxilioAnterior == 2 && casoBolsaFamilia == 1) {
			System.out.println("Ops, voc� n�o ter� direito ao auxilio assistencial,pois, n�o o recebeu anteriormente \n"
					+ "e tamb�m por ja ter utilizado o bolsa familia anteriormente. "
					+ "\nBoa sorte!");
		}
		}
	}
}
	
