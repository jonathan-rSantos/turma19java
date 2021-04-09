package Application;

import java.util.Scanner;

import Entity.Basico;
import Entity.Graduacao;
import Entity.Medio;
import Entity.Mestrado;
import Entity.Pos;

public class CadEstudante {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		
		char opcao;
		
		do {
		System.out.println("ESCOLA ED+");
		System.out.println("AQUI OU VAI OU VAI MESMO!!\n");
		System.out.println("1- BASICO \n2-M�DIO \n3- GRADUA��O \n4- P�S \n5- MESTRADO \n6- SAIR");
		System.out.print("DIGITE A OP��O SELECIONADA: ");
		opcao = sc.next().charAt(0);
		if (opcao == '1') 
		{
			System.out.println("Digite sua matricula: ");
			String matricula = sc.next();
			System.out.println("Digite seu CPF: ");
			String cpf = sc.next();
			System.out.println("Digite a data de aniversario da conta: ");
			int diaAniversario = sc.nextInt();
			 
			Basico alunoBasico = new Basico (matricula,cpf,diaAniversario);
			
			System.out.println("Digite sua nota: ");
			double nota = sc.nextDouble();
			alunoBasico.incluirPontos(nota);
			if (alunoBasico.getPontos() <= 5) {
				System.out.println("AINDA N�O!!");
			}
			else {
				System.out.println("PARAB�NS!!");
			}
			System.out.println("Qual dia de hoje? ");
			double diaAtual = sc.nextDouble();
			alunoBasico.bonusAniversario(diaAtual);
			System.out.println("PONTOS ATUAIS: " + alunoBasico.getPontos());
			System.out.println("continuar 1- SIM OU 6 - N�O? ");
			opcao = sc.next().charAt(0);
		}
		else if (opcao == '2' ) {
			System.out.println("Digite sua matricula: ");
			String matricula = sc.next();
			System.out.println("Digite seu CPF: ");
			String cpf = sc.next();
			
			Medio alunoMedio = new Medio(matricula, cpf);
			
			System.out.println("Digite sua nota: ");
			double nota = sc.nextDouble();
			alunoMedio.incluirPontos(nota);
			
			if (alunoMedio.getPontos() <= 5) {
				System.out.println("AINDA N�O!!");
			}
			else {
				System.out.println("PARAB�NS!!");
			}
			System.out.println("continuar 1- SIM OU 6 - N�O? ");
			opcao = sc.next().charAt(0);
			System.out.println("Deseja imprimir boletim? 1- Sim e 6- N�o");
			char boletim = sc.next().charAt(0);
			if(boletim == '1') {
				alunoMedio.imprimirBoletim(boletim);
			}
			
		}
		else if (opcao == '3') {
			System.out.println("Digite sua matricula: ");
			String matricula = sc.next();
			System.out.println("Digite seu CPF: ");
			String cpf = sc.next();
			
			Graduacao alunoGraduacao = new Graduacao(matricula,cpf);
			
			System.out.println("Digite sua nota: ");
			double nota = sc.nextDouble();
			alunoGraduacao.incluirPontos(nota);
			
			if (alunoGraduacao.getPontos() <= 5) {
				System.out.println("AINDA N�O!!");
				System.out.println("TEMOS 2 PONTOS DE BONUS P�S GRADUA��O 1- PARA ADICIONAR NOTA / 6- PARA N�O.");
				char opcaoPos = sc.next().charAt(0);
				if(opcaoPos == '1') {
					System.out.println("Adicionar 1 ou 2 pontos? ");
					int pontos = sc.nextInt();
					alunoGraduacao.usarBonusGraduacao(pontos);
					
					if(alunoGraduacao.getPontos() >= 6) {
						System.out.println("\nPARAB�NS!!");
					}
					else if (alunoGraduacao.getPontos() <=5){
						System.out.println("\nMESMO ASSIM AINDA N�O, INFELIZMENTE!!");
					}
				}
				else {
					
				}
			}
			else {
				System.out.println("PARAB�NS!!");
			}
			System.out.println("continuar 1- SIM OU 6 - N�O? ");
			opcao = sc.next().charAt(0);
			
		}
		else if (opcao == '4') {
			System.out.println("Digite sua matricula: ");
			String matricula = sc.next();
			System.out.println("Digite seu CPF: ");
			String cpf = sc.next();
			System.out.println("A qualquer momento voc� pode pedir bonus pos!\n0- para solicitar");
			Pos alunoPos = new Pos (matricula, cpf);
			
			System.out.println("Digite sua nota: ");
			double nota = sc.nextDouble();
			alunoPos.incluirPontos(nota);
			
			if (alunoPos.getPontos() <= 5 ) {
				System.out.println("AINDA N�O!!");
			}
			else {
				System.out.println("PARAB�NS!!");
			}
			
			System.out.println("Limite de 5 pontos, digite valor: ");
			double pontosPos = sc.nextDouble();
			alunoPos.pedirCreditoPos(pontosPos);
			
			if (alunoPos.getPontos() <= 5) {
				System.out.println("AINDA N�O!!");
			}
			else {
				System.out.println("PARAB�NS!!");
			}
		}
		//FALTA POSSSS
		
		
		}while (opcao != '6');
		
		
		
		
		
		
		
	}

}
