package AlugarQuartos;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Aluno[] aluno = new Aluno[10];
	
		System.out.println("Quantidade de quartos alugados:");
		int qtdQuartos = scanner.nextInt();
		
		for(int i=0; i < qtdQuartos; i++) {
			System.out.println("Nome do aluno :");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.println("Email :");	
			String email = scanner.nextLine();
			System.out.println("Número do quarto :");
			int numeroQuarto = scanner.nextInt();
			
			aluno[numeroQuarto] = new Aluno(nome, email);
		}
		
		for(int i=0; i < 10; i++) {
			System.out.println("Quartos alugados: \n");
			if(aluno[i] != null) {
				System.out.println("Número do quarto" + i + " " + aluno[i]);
			}
		}
		
		scanner.close();
	}
}
