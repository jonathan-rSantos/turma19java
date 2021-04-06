package ExerciciosGen;

import java.util.Scanner;

public class RepetiçãoEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//O programa termina quando idade for =-99. (WHILE)
		
		int  idade=0, totalPessoasMenos20 =0 , totalPessoasMais50=0;
		
		//Solicitar a idade de várias pessoas e imprimir (PROGAMA FINZALIZA QUANDO = -99)
		
		System.out.println("DIGITE AS IDADES: (PARA FINALIZAR DIGITE -99)");
		while (idade != -99)
		{
			System.out.println("Digite a idade: ");
			idade = sc.nextInt();
		if (idade > 0 && idade <= 20) 
		{
			totalPessoasMenos20++;
		}
		if (idade >= 51 ) 
		{
			totalPessoasMais50++;
		}
		}
		//Total de pessoas com menos de 21 anos
		System.out.println("Total de pessoas com menos de 21 anos: " + totalPessoasMenos20);
		
		//Total de pessoas com mais de 50 anos
		System.out.println("Total de pessoas com mais de 50 anos: " + totalPessoasMais50);
	}
	
}
