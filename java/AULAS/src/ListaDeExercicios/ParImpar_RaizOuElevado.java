package ListaDeExercicios;

import java.util.Scanner;
public class ParImpar_RaizOuElevado {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero;
		double elevado;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		if (numero%2 == 0 ) {
			System.out.println("Este numero é par");
			Math.sqrt(numero);
			System.out.printf("A raiz quadrada do valor é: %.3f" , Math.sqrt(numero));
		}
		if (numero%2 == 1) {
			System.out.println("Este numero é impar");
			elevado = numero * numero;
			System.out.printf("Valor elevado ao quadrado é: %.1f" , elevado);
		}
	}
}
