package Entities;

public class Product {

	String nome;
	double preco;
	int quantidade;

	public Product (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double valorTotalEmEstoque() {
		return this.preco * this.quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return this.nome + ", $" + String.format("%.2f", this.preco) + ", "
				+ this.quantidade + ", Total: $ " + String.format("%.2f", valorTotalEmEstoque());
	}
}
