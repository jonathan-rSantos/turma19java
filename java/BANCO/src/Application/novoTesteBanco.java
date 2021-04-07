package Application;

import java.util.Scanner;

import Entity.Conta;

public class novoTesteBanco {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta contaDoJhow= new Conta("BANG-3", "\nTIRO CERTO NA MELHOR OPÇÃO!");
		System.out.println(contaDoJhow.nomeBanco+contaDoJhow.logotipo);
		
		System.out.print("Digite numero da conta: ");
		contaDoJhow.numero = sc.nextInt();
		System.out.print("Digite o CPF: ");
		contaDoJhow.cpf = sc.next();
		System.out.print("Opcao 1- debito // 2- credito?");
		char opcao = sc.next().charAt(0);
		if (opcao== '1') {
		System.out.print("Digite o valor: ");
		double valor = sc.nextDouble();
		contaDoJhow.credito(valor);
		}
		
		System.out.printf("CPF: %s\n" ,contaDoJhow.cpf);
		System.out.printf("Numero da conta: %d\n", contaDoJhow.numero);
		System.out.printf("Saldo: %.2f", contaDoJhow.getSaldo());

	
	}

}
