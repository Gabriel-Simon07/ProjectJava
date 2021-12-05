package Entities;

public class Product {

	String nome;
	double preco;
	int quantidade;

	public double valorTotalEmEstoque() {
		return this.preco * this.quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;	
	}

}
