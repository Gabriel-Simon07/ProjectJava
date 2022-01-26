package Aluno;

import java.util.Locale;
import java.util.Scanner;

public class AlunoMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.println("Informe o nome do aluno: ");
		aluno.nome = scanner.next();

		System.out.println("Informe a primeira nota: ");
		aluno.nota1 = scanner.nextDouble();
		System.out.println("Informe a segunda nota: ");
		aluno.nota2 = scanner.nextDouble();
		System.out.println("Informe a terceira nota: ");
		aluno.nota3 = scanner.nextDouble();

		System.out.println("A quantidade final de nota é : " + aluno.somaNotas());

		if (aluno.somaNotas() < 60.0) {
			System.out.println("EM EXAME");
			System.out.printf("Faltando %.2f pontos%n", aluno.qtdFaltanteNota());
		} else {
			System.out.println("PASSOU");
		}
		scanner.close();
	}

}
