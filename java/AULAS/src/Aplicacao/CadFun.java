package Aplicacao;

import java.util.Scanner;

import Classes.Pessoa;

public class CadFun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);// instanciou um teclado
		int idade1, idade2;
		
		
		Pessoa funcionario1 = new Pessoa(); //instanciou uma pessoa
		Pessoa funcionario2 = new Pessoa();
		System.out.print("Digite o nome do funcionario 1: ");
		funcionario1.nome = sc.next();
		System.out.print("Digite o nome do funcionario 2: ");
		funcionario2.nome = sc.next();
		
		System.out.println("Digite o ano de nascimento do funcionario 1: ");
		funcionario1.anoNascimento = sc.nextInt();
		System.out.println("Digite o ano de nascimento do funcionario 2: ");
		funcionario2.anoNascimento = sc.nextInt();
		
		System.out.println("Digite seu genero do funcionario 1: (1- F / 2- M / 3 OUTROS) ");
		funcionario1.genero = sc.next().toUpperCase().charAt(0);
		System.out.println("Digite seu genero do funcionario 1: (1- F / 2- M / 3 OUTROS) ");
		funcionario2.genero = sc.next().toUpperCase().charAt(0);
		
		System.out.println("FUNCIONARIO " + funcionario1.nome + " tem: " + funcionario1.calcularIdade(2022) + " anos");
		System.out.println("FUNCIONARIO " + funcionario2.nome + " tem: " + funcionario2.calcularIdade(2022) + " anos");
		
		if ( funcionario1.calcularIdade(2021) < funcionario2.calcularIdade(2022)) {
			System.out.println(funcionario2.tratamento() + funcionario2.nome + " é o mais velha!!");
		}
		if (funcionario1.calcularIdade(2021) > funcionario2.calcularIdade(2022)){
		System.out.println(funcionario1.tratamento() + funcionario1.nome +  " é o mais velho!!!");
		}
		else {
			System.out.println("Eles tem a mesma idade!!");
		}
	}

}
