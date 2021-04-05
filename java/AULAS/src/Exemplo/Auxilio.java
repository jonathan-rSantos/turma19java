package Exemplo;

import java.util.Scanner;

public class Auxilio {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*NOVO PROCESSO AUXILIO ASSISTENCIAL
		 * se recebeu antes auxilio
		 * Se a pessoa recebe bolsa familia
		 * se é chefa de familia
		 * 
		*/
		double casoNaoChefa = 300.00;
		double casoChefaDeFamilia = 600.00;
		double valorPorFilho = 50.00;
		int chefaDeFamilia, auxilioAnterior, casoBolsaFamilia, numeroFilhos;  	
		String nome;

		System.out.println("OLÁ PASSE ALGUMAS INFORMAÇÕES E IREMOS CALCULAR SE O AUXILIO ESTÁ LIBERADO E SEU VALOR. "
				+ "\nprimeiro informe seu nome:");
		nome = leia.next();
		System.out.println(nome + ", Você já recebeu o auxilio assistencial anteriormente? \nResponda 1- para sim / 2- para não. \nR:");
		auxilioAnterior = leia.nextInt();
		if (auxilioAnterior == 2) {
			System.out.println("Ops, você não terá direito ao auxilio assistencial,pois, não o recebeu anteriormente\n"
					+ "Boa sorte!");
		} else {
		System.out.println(nome + ", você já recebeu o bolsa familia anteriormente? \nResponda 1- PARA SIM / 2- PARA NÃO. \nR:");
		casoBolsaFamilia = leia.nextInt();
		System.out.println(nome + ", você é chefa de familia? \nResponda 1- PARA SIM / 2- PARA NÃO. \nR:");
		chefaDeFamilia = leia.nextInt();
		System.out.println(nome + ", quantos filhos você tem? \nR:");
		numeroFilhos = leia.nextInt();
		
		if (auxilioAnterior == 1 && casoBolsaFamilia == 2 && chefaDeFamilia == 1)
		{
		valorPorFilho *= numeroFilhos;
		casoChefaDeFamilia += valorPorFilho;
		System.out.println( nome + ", será liberado para você " + casoChefaDeFamilia);
		}
		if (auxilioAnterior == 1 && casoBolsaFamilia == 2 && chefaDeFamilia == 2)
		{
			System.out.println(nome + ", será liberado para você" + casoNaoChefa);
		}
		if (auxilioAnterior == 1 && casoBolsaFamilia == 1) {
			System.out.println("Ops, você não terá direito ao auxilio assistencial, pois, recebeu o bolsa familia anteriormente. "
					+ "\nBoa sorte!");
		}
		if (auxilioAnterior == 2 && casoBolsaFamilia == 1) {
			System.out.println("Ops, você não terá direito ao auxilio assistencial,pois, não o recebeu anteriormente \n"
					+ "e também por ja ter utilizado o bolsa familia anteriormente. "
					+ "\nBoa sorte!");
		}
		}
	}
}
	
