package exercicios;

import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a sua temperatura em Fahrenheit? ");
		Double temperaturaFahrenheit = entrada.nextDouble();
		
		System.out.println("O resultado da sua convers�o �: "+(temperaturaFahrenheit-32) * 5/9 +"�C");
		
		
		entrada.close();
		
		
	};

}
