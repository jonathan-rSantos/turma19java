package Exemplo;

import java.util.Scanner;

import Classes.Pessoa;

public class ExemploCadastroDeDuasPessoas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
//NOME, 'ANO' DE NASCIMENTO, GENERO    [PORÉM] MOSTRAR IDADE DA PESSOA CADASTRADA && CADASTRAR OUTRA PESSOA
//E COMPARAR QUEM É MAIS VELHO, MAIS NOVO OU SE TEM A MESMA IDADE 
		Pessoa aluno1 = new Pessoa();
		Pessoa aluno2 = new Pessoa();
		
			System.out.println("CADASTRO!!!");
			
			System.out.print("Digite o nome: ");
			aluno1.nome = sc.next();
			System.out.print("Digite ano de nascimento");
			aluno1.anoNascimento = sc.nextInt();
			System.out.println("Digite seu genero: (1- Feminino / 2- Masculino / 3- Outros");
			aluno1.genero = sc.next().toUpperCase().charAt(0);
			
			System.out.print("Digite o nome: ");
			aluno2.nome = sc.next();
			System.out.print("Digite ano de nascimento");
			aluno2.anoNascimento = sc.nextInt();
			System.out.println("Digite seu genero: (1- Feminino / 2- Masculino / 3- Outros");
			aluno2.genero = sc.next().toUpperCase().charAt(0);
			
			System.out.println(aluno1.nome + " tem: " + aluno1.calcularIdade());
			System.out.println(aluno2.nome + " tem: " + aluno2.calcularIdade());
			
			if ( aluno1.calcularIdade(2021) < aluno2.calcularIdade(2021)) {
				System.out.println(aluno2.tratamento() + aluno2.nome + " é o mais velha!!");
			}
			else if (aluno1.calcularIdade(2021) > aluno2.calcularIdade(2021) && aluno1.calcularIdade(2021) != aluno2.calcularIdade(2021) ){
			System.out.println(aluno1.tratamento() + aluno1.nome +  " é o mais velho!!!");
			}
			else {
				System.out.println("Eles tem a mesma idade!!");
			}
			
			}
			
		}
		
		

	
	
	
