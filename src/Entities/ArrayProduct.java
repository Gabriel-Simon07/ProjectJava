package Entities;

import java.util.Locale;
import java.util.Scanner;

public class ArrayProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int qtdProdutos = scanner.nextInt();
		Product[] array = new Product[qtdProdutos];

		for (int i = 0; i < array.length; i++) {
			scanner.nextLine();
			String nome = scanner.next();
			double preco = scanner.nextDouble();
			array[i] = new Product(nome, preco);
		}

		double soma = 0.0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i].getPreco();
		}
		double media = soma / qtdProdutos;
		System.out.println("A m�dia dos valores dos produtos � de " + media);
		scanner.close();
	}

}
