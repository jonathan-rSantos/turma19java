package ListaDeExercicios;

import java.util.Scanner;
public class ParImpar_RaizOuElevado {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero;
		double raiz, elevado;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		if (numero%2 == 0 ) {
			System.out.println("Este numero é par");
			Math.sqrt(numero);
			System.out.println("A raiz quadrada do valor é:"  + Math.sqrt(numero));
		}
		if (numero%2 == 1) {
			System.out.println("Este numero é impar");
			elevado = numero * numero;
			System.out.println("Valor elevado ao quadrado é: " + elevado);
		}
	}
}
