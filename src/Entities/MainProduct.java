package Entities;

import java.util.Locale;
import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Adicione as informações do produto : ");
		System.out.println("Nome : ");
		product.nome = scanner.next();
		System.out.println("Price : ");
		product.preco = scanner.nextDouble();
		System.out.println("Quantidade em estoque : ");
		product.quantidade = scanner.nextInt();
		
		System.out.println("Informações do produto: " + product + "\n");
		
		System.out.println("Informe a quantidade de produtos a serem inseridas no estoque: ");
		int qtdProdutos = scanner.nextInt();
		product.adicionarProdutos(qtdProdutos);
		
		System.out.println("\nInformações do produto atualizados: " + product);
		
		System.out.println("Informe a quantidade de produtos a serem retiradas do estoque: ");
		int qtdProdutosRetirar = scanner.nextInt();
		product.removerProdutos(qtdProdutosRetirar);
		
		System.out.println("\nInformações do produto atualizados: " + product);
		scanner.close();
	}

}
