package ListaDeExercicios;

import java.util.Scanner;

public class DesafioDoIr {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	int genero;
	String nome;
	double salario, imposto = 0;
	
	System.out.println("Informe seu nome:");
	nome = leia.next();
	System.out.println(nome + " ,agora me conta qual ser genero: (1- Ele, 2- Ela, 3- Elu)");
	genero = leia.nextInt();
	if (genero == 1) {
	System.out.println("Senhor " + nome + ", agora me informe seu salario");
	salario = leia.nextDouble();
	if (salario <= 1500.00) {
		System.out.println("Você esta insento!");
	}
	else if (salario > 1500.00 && salario < 2500.00) {
		imposto = salario * 0.15;
		salario -= imposto;
		System.out.println("Seu IR é de 15%. \nSeu salario é:" + salario);
	}
	else if (salario > 2500.00) {
		imposto = salario * 0.25;
		salario -= imposto;
		System.out.println("Seu IR é de 25%. \nSeu salario é:" + salario);
	}
	
	}
	if (genero == 2) {
		System.out.println("Senhora " + nome + ", agora me informe seu salario");
		salario = leia.nextDouble();
		if (salario <= 1500.00) {
			System.out.println("Você esta insenta!");
		}
		else if (salario > 1500.00 && salario < 2500.00) {
			imposto = salario * 0.15;
			salario -= imposto;
			System.out.println("Seu IR é de 15%. \nSeu salario é:" + salario);
		}
		else if (salario > 2500.00) {
			imposto = salario * 0.25;
			salario -= imposto;
			System.out.println("Seu IR é de 25%. \nSeu salario é:" + salario);
		}
		
		}
	if (genero == 3) {
		System.out.println(nome + ", agora me informe seu salario");
		salario = leia.nextDouble();
		if (salario <= 1500.00) {
			System.out.println("Você esta insente!");
		}
		else if (salario > 1500.00 && salario < 2500.00) {
			imposto = salario * 0.15;
			salario -= imposto;
			System.out.println("Seu IR é de 15%. \nSeu salario é:" + salario);
		}
		else if (salario > 2500.00) {
			imposto = salario * 0.25;
			salario -= imposto;
			System.out.println("Seu IR é de 25%. \nSeu salario é:" + salario);
		}
		
		}
	}
}
