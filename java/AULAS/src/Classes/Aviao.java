package Classes;

import java.util.Scanner;

public class Aviao {
	
	public int poltronas = 400;
	public int totalPassageiros;
	public boolean porta;
	Scanner sc = new Scanner(System.in);
	
	
	public void fechaPorta () {
		char opcao;
	
		System.out.println("1- TODOS // 2- FALTA PASSAGEIROS.");
	 opcao = sc.next().charAt(0);
	if (opcao == '1') {
		System.out.println("OK, QUANTOS PASSGEIROS EMBARCARAM?");
		totalPassageiros = sc.nextInt();
		poltronas-=totalPassageiros;
		System.out.println("OTIMO, VAMOS PROSSEGUIR!\n2- Porta será fechado, você concorda?\n1- CONCORDO // 2- DISCORDO.");
	}
	else if (opcao == '2') {
		System.out.println("OK, QUANTOS PASSGEIROS EMBARCARAM?");
		totalPassageiros = sc.nextInt();
		System.out.println("OTIMO, VAMOS PROSSEGUIR!\n2- Porta será fechado, você concorda?\n1- CONCORDO // 2- DISCORDO.");
		poltronas-=totalPassageiros;
	}
	
	do {
		opcao = sc.next().charAt(0);
	if ( opcao == '1') 
	{
		System.out.println("TOTAL DE PASSEGEIROS: " + totalPassageiros + "\nPOLTRONAS INOCUPADAS: "+poltronas
				+ "\n\n\nPORTA SENDO FECHADA!!\nAPERTE O CINTO E VAMOS DECOLAR EM INSTANTES.");
	}
	else if (opcao == '2') {
		System.out.println("OK, FICARÁ PAUSADO ATÉ QUE SEJÁ DIGITADO (1)"
				+ "\n1- FECHARA PORTA!!!");
	
	}
	}while ( opcao == '2');

	
	}




}
