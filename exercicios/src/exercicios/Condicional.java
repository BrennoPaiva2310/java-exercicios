package exercicios;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o dia da semana: ");
		String diaSemana = entrada.nextLine();

		if (diaSemana.equalsIgnoreCase("Domingo") == true) {
			System.out.println("1");
		} else if (diaSemana.equalsIgnoreCase("Segunda") == true) {
			System.out.println("2");
		} else if (diaSemana.equalsIgnoreCase("Ter�a") == true || diaSemana.equalsIgnoreCase("Ter�a") == true ) {
			System.out.println("3");
		} else if (diaSemana.equalsIgnoreCase("Quarta") == true) {
			System.out.println("4");
		} else if (diaSemana.equalsIgnoreCase("Quinta") == true) {
			System.out.println("6");
		} else if (diaSemana.equalsIgnoreCase("Sexta") == true) {
			System.out.println("6");
		} else if (diaSemana.equalsIgnoreCase("Sabado") == true || diaSemana.equalsIgnoreCase("S�bado") == true) {
			System.out.println("7");
		} else {
			System.out.println("Dia Invalido");
		}

	entrada.close();
	}

}
