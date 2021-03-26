package Testes;

import java.util.Scanner;

public class Bang3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		long cpf;
		int numero, senha, continuar, debito, movimento, conta;
		double saldo = 0.00, funcaoDebito, funcaoCredito, limiteContaCorrente = 1000.00;
		boolean ativa;
		
		System.out.println("BEM VINDO AO BANG-3 \nAO TIRO CERTO NA MELHOR EXCOLHA!");
		System.out.println("SELECIONE A CONTA DESEJADA:");
		System.out.println("1- CONTA CORRENTE \n2- CONTA POUPANÇA \n"
				+ "3- CONTA ESPECIAL \n4- CONTA EMPRESA \nCONTA ESTUDANTIL \n"
				+ "6 - SAIR");
		conta = leia.nextInt();
		if (conta == 1) {
			System.out.print("CONTA CORRENTE! \nDIGITE O CPF:");
			cpf = leia.nextLong();
			System.out.print("DIGITE A SENHA:");
			senha = leia.nextInt();
			System.out.println("SALDO ATUAL: R$" + saldo
					+"\nDESEJA FAZER UM MOVIMENTO?  \nDIGITE 1 PARA SIM"
					+ " OU 2 PARA SAIR. \n1- SIM  /  2- SAIR? \n8-EMPRESTIMO  ");
			continuar = leia.nextInt();
			if (continuar == 1) {
				System.out.println("1- DEBITOU OU 2- CREDITO?");
				debito = leia.nextInt();
				if (debito == 1) {
					System.out.print("VALOR DO MOVIMENTO:");
					movimento = leia.nextInt();
					if(saldo < 0 || movimento > saldo ) {
						System.out.println("SALDO INSUFICIENTE! \n"
								+ "DESEJA USAR LIMITE DE CONTA CORRENTE\nSEU LIMITE É: "+limiteContaCorrente+ "R$ \n"
								+ "DIGITE 1 - PARA SIM \n2-PARA SAIR");
						continuar = leia.nextInt();
						if(movimento < limiteContaCorrente) {
							for (int x = 1; x <=10; x++) {
							if (continuar == 1 || limiteContaCorrente > 0 ) {
							System.out.print("OPERAÇÃO REALIZADA!! \n");
							saldo += movimento;
							limiteContaCorrente -= movimento;
							System.out.print("SALDO: "+ saldo + "\n");
						    System.out.println("LIMITE DISPONIVEL"+limiteContaCorrente
			    			+"\nDESEJA FAZER UM MOVIMENTO? \n1 PARA SIM \n"+ "OU 2 PARA SAIR. \n1- SIM  /  2- SAIR?");
							continuar = leia.nextInt();
							System.out.print("\nVALOR DO MOVIMENTO:");
							movimento = leia.nextInt();
							} else {
									break;
								}
							}
							}
						}
					}
				}
			}
		}
	}
