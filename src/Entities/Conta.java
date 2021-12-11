package Entities;

public class Conta {

	int numeroConta;
	String nomeTitular;
	double valorDeposito;
	
	public Conta(int numeroConta, String nomeTitular, double valorDeposito) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.valorDeposito = valorDeposito;
	}
	
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public String setNomeTitular(String nome) {
		return this.nomeTitular = nome;
	}
	
	public String getNumeroConta() {
		return nomeTitular;
	}
	
	
	
}
