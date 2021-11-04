package project_java;

import java.util.Scanner;

public class ExercicioJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valorPrimeiro;
		int valorSegundo;
		int valorTotal;
		
		System.out.println("Informe o primeiro valor: ");
		valorPrimeiro = scanner.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		valorSegundo = scanner.nextInt();
		
		valorTotal = valorPrimeiro + valorSegundo;
		
		System.out.printf("O valor total é %d", valorTotal);
	}

}
