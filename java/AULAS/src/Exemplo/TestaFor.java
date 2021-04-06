package Exemplo;

import java.util.Scanner;

public class TestaFor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
/* A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes
 *  coletando dados sobre o sal�rio e n�mero de filhos.
 *  
 *   A prefeitura deseja saber:   
	a) m�dia do sal�rio da popula��o; 
	b) m�dia do n�mero de filhos; 
	c) maior sal�rio; 
	d) percentual de pessoas com sal�rio at� R$100,00.*/
		
		 final double HABITANTES = 3;
		 double numeroFilhos=0.00, salario=0.00, totalFilhos=0, totalSalario=0.00;
		 double maiorSalario=0.00, mediaSalario=0.00, mediaFilhos=0.00, SalariosAte100=0, percentualSalario=0.00;
		 
		 System.out.println("Informe salario e numero de filhos: ");
		 for (int r=1; r <= HABITANTES; r++ ) {
			 System.out.print("SALARIO? R: ");
			 salario = sc.nextDouble();
			 System.out.print("Numero de filhos? R: ");
			 numeroFilhos = sc.nextDouble();
			 totalSalario += salario;
			 totalFilhos += numeroFilhos;
			
			 if (salario <= 100) {
				 percentualSalario++;
			 }
			 if (maiorSalario < salario) {
				 maiorSalario = salario;
			 }
		 }
		 	percentualSalario /= HABITANTES;
		 	percentualSalario *= 100;
		    mediaSalario = totalSalario / HABITANTES;
		 	mediaFilhos = totalFilhos / HABITANTES;
		 	System.out.printf("\nTotal salarios: R$ %.2f" , totalSalario );
		 	System.out.println();
		 	System.out.printf("M�dia de salarios: R$ %.2f" , mediaSalario);
		 	System.out.println();
		 	System.out.printf("Total filhos: %.0f filhos" , totalFilhos);
		 	System.out.println();
		 	System.out.printf("M�dia de filhos: %.2f" , mediaFilhos);
		 	System.out.println("\n");
		 	System.out.printf("MAIOR SALARIO: %.2f" , maiorSalario );
		 	System.out.println();
		 	System.out.printf("Percentual de salario: %.2f %%" , percentualSalario);
		 	
	}
}
