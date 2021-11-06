package project_java;

import java.util.Scanner;

public class ContaTelefone {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double planoBasico = 50;
		int minutos;

		System.out.println("Informa a quantidade de minutos :");
		minutos = scanner.nextInt();

		if (minutos > 100) {
			planoBasico += (minutos - 100) * 2;
		} 
		System.out.printf("Valor final da conta = %.2f|%n", planoBasico);
	}

}
