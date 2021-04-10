package Applicaiton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import Entity.List;

public class Estoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//Crie uma um programa para trabalhar com estoque de uma loja
		
//o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque
//o programa deverá atender as seguintes funcionalidades:
		//Armazenar dados da List
		//Remover dados da list;
		//Atualizar dados da list.
		//Apresentar todos os dados da list.
		
		
		Collection <String> lista = new ArrayList<>();
		lista.add("Tenis");   //Adiciona valor a List
		lista.add("Blusa");
		lista.add("Bermuda");
		lista.add("Meia");
		
		/*
		lista.remove("Tenis");  // Remove valor da List
		System.out.println("Lista de produtos: " + lista);	
		*/
		
		for (String produtos : lista) {
			System.out.println("Lista de produtos: " + produtos);	
		}   // Apresenta todos os dados
		
		Collection <String> lista2 = Arrays.asList("Bone" , "Chinelo");  // nova list  // list 2
		lista.addAll(lista2);  // adiciona tudo da primeira list e mais intens da nova List
		//System.out.println("Lista de produtos: " + lista);	
		
		//System.out.println("Contem tenis na lista?" + lista.contains("Tenis")); // verificação dos dados
		//System.out.println("Lista: " + lista );// verificação dos dados
		
		
		//lista.clear();// Limpa List
		//System.out.println("Lista de produtos: " + lista);	
		
		
		
		/*if ( lista.isEmpty()) 
		{
		System.out.println("Lista vazia... ");	
		}
		else {
			System.out.println("Lista de produtos: " + lista);	
		}
		*/
		
		
		
		
		

	}

}
