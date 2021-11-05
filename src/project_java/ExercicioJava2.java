package project_java;

import java.util.Scanner;

public class ExercicioJava2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A;
		int B;
		int C;
		int D;
		int valorDiferenca;

		System.out.println("Informe o primeiro valor: ");
		A = scanner.nextInt();

		System.out.println("Informe o segundo valor: ");
		B = scanner.nextInt();

		System.out.println("Informe o segundo valor: ");
		C = scanner.nextInt();

		System.out.println("Informe o segundo valor: ");
		D = scanner.nextInt();

		valorDiferenca = (A * B - C * D);

		System.out.printf("O valor total é %d", valorDiferenca);

	}

}
