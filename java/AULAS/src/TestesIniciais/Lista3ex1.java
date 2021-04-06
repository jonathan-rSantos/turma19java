package TestesIniciais;

import java.util.*;
import java.math.*;
public class Lista3ex1 { 
	
	public static void main(String[] args) {     
		
		Scanner sc = new Scanner(System.in); 
		double numA = 1;      
		int cont = 1;   
		
		System.out.print("Digite um número: ");
		numA = sc.nextDouble();  
		while (numA > 0) {    
			if (cont == 1 || cont % 5 == 0) {          
				System.out.print("\n----------------------------------------------------------------"
						+ "\nTabela Whatever \n----------------------------------------------------------------");  
				}           
			
			System.out.print("\n|" + numA + "             " + numA + "²=" + Math.pow(numA, 2) 
			+ "              " + numA + "¹/²=" + Math.sqrt(numA) + "|");            cont++;
			System.out.print("                          ");   
			numA = sc.nextDouble();        }     
		System.out.print("\n----------------------------------------------------------------\n"); 
		}
	}