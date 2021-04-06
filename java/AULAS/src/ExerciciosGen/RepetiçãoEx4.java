package ExerciciosGen;

import java.util.Scanner;

public class RepetiçãoEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região
		 *  Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros)
		 *  e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		 *  Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		 */
		int idade =0, sexo=0, opcao=0, contador=1;
		int  MulheresNervosas=0, HomensAgressivos=0;
		int PessoasCalmas=0, PessoasNervosasMais40=0 , PessoasCalmasMenos18=0, OutrosCalmos=0; 
		
		System.out.println("Deseja começar? S-sim e N-não");
		char continua = sc.next().toUpperCase().charAt(0);
		while (continua == 'S' && contador <= 3)
		{
			System.out.println("Informe sua idade: ");
			idade = sc.nextInt();
			System.out.println("Informe seu sexo (1-feminino / 2-masculino / 3-Outros: )");
			sexo = sc.nextInt();
			System.out.println("Iforme se é uma pessoa (1- Pessoa calma / 2- Pessoa nervosa / 3- se a pessoa era agressiva: )");
			opcao = sc.nextInt();
		if ( contador != 3) {
			System.out.println("Deseja continuar a pesquisa? S-sim e N-não");
			continua = sc.next().toUpperCase().charAt(0);
		}
		//o número de pessoas calmas; 
		if (opcao == 1) {
		PessoasCalmas++;
		}
			//o número de mulheres nervosas; 
		if (sexo == 1 && opcao == 2) {
		MulheresNervosas++;	
		}
		//o número de homens agressivos;
		if(sexo == 2 && opcao == 3) {
			HomensAgressivos++;
		}
		//o número de outros calmos;
		if (sexo == 3 && opcao == 1) {
		OutrosCalmos++;	
		}
		//o número de pessoas nervosas com mais de 40 anos; 
		if(idade >= 40 && opcao == 2) {
			PessoasNervosasMais40++;
		}
		//o número de pessoas calmas com menos de 18 anos.
		if (idade < 18 && opcao == 1) {
			PessoasCalmasMenos18++;
		}
		contador++;
		}
		System.out.println("Pessoas calmas: " + PessoasCalmas);
		System.out.println("Mulheres nervosas: " + MulheresNervosas);
		System.out.println("Homens agressivos: " + HomensAgressivos);
		System.out.println("Outros calmos: " + OutrosCalmos);
		System.out.println("Pessoas nervosas com mais de 40 anos: " + PessoasNervosasMais40);
		System.out.println("Pessoas calmas com menos de 18 anos: " + PessoasCalmasMenos18);
		
	}
}
