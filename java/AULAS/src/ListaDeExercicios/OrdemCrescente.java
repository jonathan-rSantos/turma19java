package ListaDeExercicios;


import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		OrdemCrescente oc = new OrdemCrescente();
		
		
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente
		int numero1, numero2, numero3;
		
		System.out.println("Digite 3 numeros, iremos coloca-los em ordem crescente. \n1� numero:");
		numero1 = leia.nextInt();
		System.out.println("2� numero:");
		numero2 = leia.nextInt();
		System.out.println("3� numero:");	
		numero3 = leia.nextInt();
			
		if (numero1 < numero2 && numero2 < numero3) {
			System.out.println(numero1 + ","+ numero2 + "," + numero3);
		}
		else if (numero1 < numero2 && numero2 > numero3) {
			System.out.println(numero1 + ","+ numero3 + "," + numero2);
		}
		else if (numero1 > numero2 && numero2 > numero3) {
			System.out.println(numero3 + "," + numero2 + "," + numero1);
		}
		else if (numero1 > numero2 && numero2 < numero3 ) {
			System.out.println(numero2 + "," + numero3 + "," + numero1);
		}
	}
}
