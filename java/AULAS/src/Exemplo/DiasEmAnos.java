package Exemplo;

import java.util.Scanner;

public class DiasEmAnos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idadeDias, idadeAnos, idadeMeses;
		
		System.out.println("Digite sua idade apenas em dias totais: ");
		idadeDias = leia.nextInt();
		idadeAnos = idadeDias / 365;
		idadeMeses = (idadeDias % 365) / 30;
		idadeDias = (idadeDias % 365) % 30;
		
		System.out.println(idadeAnos+" anos, "
		+idadeMeses+" meses, "+ idadeDias+ " dias!");
	}
}
