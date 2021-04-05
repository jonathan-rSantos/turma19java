package ListaDeExercicios;


import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		OrdemCrescente oc = new OrdemCrescente();
		
		
		//Faça um programa que entre com três números e coloque em ordem crescente
		int numero1, numero2, numero3;
		
		System.out.println("Digite 3 numeros, iremos coloca-los em ordem crescente. \n1º numero:");
		numero1 = leia.nextInt();
		System.out.println("2º numero:");
		numero2 = leia.nextInt();
		System.out.println("3º numero:");	
		numero3 = leia.nextInt();
			
		if (numero1 > numero2 && numero2 > numero3) {
			System.out.println(numero1+","+ numero2 + "," + numero3);
		}
		if (numero1 > numero2 && numero2 < numero3 && numero3 < numero1) {
			System.out.println(numero1 + "," + numero3 + "," + numero2);
		}
		if (numero1 > numero2 && numero2 < numero3 && numero3 > numero1) {
			System.out.println(numero3 + "," + numero1 + "," + numero2);
		}
		if (numero1 < numero2 && numero2 > numero3 && numero3 < numero1) {
			System.out.println(numero2 + "," + numero1 + "," + numero3);
		}
		if (numero1 == numero2 && numero3 > numero2) {
			System.out.println(numero3 + "," + numero1 + "," + numero2);
		}
		if (numero1 > numero2 && numero1 > numero3 && numero2 == numero3) {
		System.out.println(numero1 + "," + numero2 + "," + numero3);
		}
		if(numero1 < numero2 && numero2 < numero3) {
			System.out.println(numero3 + "," + numero2 + "," + numero1);
		}
		if(numero2 > numero1 && numero2 > numero3) {
			System.out.println(numero2 + "," + numero3 + "," + numero1);
		}
		if (numero1 == numero2 && numero1 == numero3) {
			System.out.println("Não há ordem crescente, numeros iram ficar assim: " + numero1 
					+ "," + numero2 + "," + numero3);
		}
	}
}
