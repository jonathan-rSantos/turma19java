package Exemplo;

import java.util.Scanner;

public class CelsiusEmFahrenheit {
	
	public static void main(String[] args) {
		
	
	Scanner leia = new Scanner (System.in);
	double celsius, fahrenheit;
	
	//FORMULA (1 °C × 9/5) + 32
	
	System.out.println("Digite a temperatura em celsius: ");
	celsius = leia.nextInt();
	fahrenheit = (celsius * 9/5) + 32;
	
	System.out.println("O" + celsius + "° Celsius equivale há: " + fahrenheit +"F");
	}
}
