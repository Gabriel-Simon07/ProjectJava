package project_java;

import java.util.Scanner;

public class LacoRepeticaoFor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int valor = scanner.nextInt();
		int soma = 0;
		
		
		for (int i = 0; i < valor; i++) {
			int valorInformado = scanner.nextInt();
			soma+=valorInformado;
		}
		System.out.println(soma);
	}

}
