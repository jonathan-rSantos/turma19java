package Applicaiton;

import java.util.Scanner;

import Entity.Cachorro;
import Entity.Cavalo;
import Entity.Preguica;

public class ImplemetAnimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	Cachorro megan = new Cachorro("AU AU", "CORRE");
	Cavalo potranco = new Cavalo("BRLUUUM", "CORRE");
	Preguica cid = new Preguica("AAAAH", "SOBE ARVORE");
	
	//Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior 
	//e invoque o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.
	

	System.out.print("Cachorro faz o som: "+ megan.getEmitirSom() + "\n");
	System.out.print("Cavalo faz o som: "+ potranco.getEmitirSom()+ "\n");
	System.out.print("Preguiça faz o som: "+ cid.getEmitirSom()+ "\n");
	
	
	
	}	
	
}
