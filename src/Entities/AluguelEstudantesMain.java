package Entities;

import java.util.Locale;
import java.util.Scanner;

public class AluguelEstudantesMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Aluguel[] aluguel = new Aluguel[10];

		System.out.println("Informe a quantidade de quartos alugados: ");
		int qtdAlunos = scanner.nextInt();

		for (int i = 1; i <= qtdAlunos; i++) {
			System.out.println("Aluguel " + i + " : ");
			System.out.println("Nome : ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.println("Email : ");
			String email = scanner.nextLine();
			System.out.println("Qual o número do quarto : ");
			int numeroQuarto = scanner.nextInt();

			aluguel[numeroQuarto] = new Aluguel(nome, email);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("\nQuartos alugados :");
			if (aluguel[i] != null) {
				System.out.println("Quarto número " + i + " : " + aluguel[i]); 
			}
		}

		scanner.close();
	}

}
