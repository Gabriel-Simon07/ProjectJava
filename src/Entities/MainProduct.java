package Entities;

import java.util.Locale;
import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Adicione as informa��es do produto : ");
		System.out.println("Nome : ");
		product.nome = scanner.next();
		System.out.println("Price : ");
		product.preco = scanner.nextDouble();
		System.out.println("Quantidade em estoque : ");
		product.quantidade = scanner.nextInt();

		System.out.println("Nome : " + product.nome + ", pre�o " + product.preco + ", quantidade em estoque "
				+ product.quantidade);

		scanner.close();
	}

}
