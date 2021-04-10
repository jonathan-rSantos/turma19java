package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entity.Funcionario;
import Entity.Terceiro;

public class TestaFucionario {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	List<Funcionario> listaDeFucionario = new ArrayList<>();  //INTERFACE   INTERFACE  INTERFACE 
	
	System.out.println("CADASTRO DE FUNCIONARIOS - PAGAMENTOS");
	System.out.println("Quantos funcionarios serão cadastrados?");
	int qtde = sc.nextInt();
	
	for (int x = 1; x <=qtde ; x++) {
		System.out.printf("Funcionario %d \n", x );
		System.out.println("Digite 1- Funcionario ou 2- Terceiro: ");
		char opcao = sc.next().charAt(0);
		
		System.out.println("Digite a matricula: ");
		String matricula = sc.next();
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		System.out.println();
		System.out.println("Digite as horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor por hora: ");
		double valorHora = sc.nextDouble();
		
		if (opcao == '2' ) {
			System.out.println("Digite o valor do adicional: ");
			double adicional = sc.nextDouble();
			
			listaDeFucionario.add(new Terceiro (matricula, nome, horasTrabalhadas, valorHora, adicional));
		}
		else {
			listaDeFucionario.add(new Funcionario (matricula, nome, horasTrabalhadas, valorHora));
		}
	}
	System.out.println();
	System.out.println("FOLHA DE PAGAMENTOS");
	
	//FOR EACH   bom para tipo list
	for (Funcionario func: listaDeFucionario) {
		System.out.println(func.getNome() + " " + "\nSalario: "+func.salario());
	}
	
	System.out.println("FIM DE PROGAMA!!");
	
	}	
}
