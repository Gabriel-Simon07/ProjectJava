package Entities;

public class Conta {

	int numeroConta;
	String nomeTitular;
	double valorDeposito;
	
	public Conta() {
	}
	
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
	
	public double deposito(double valorDeposito) {
		return this.valorDeposito += valorDeposito;
	}
	
	public double saques(double valorSaque) {
		double taxa = 5;
		double taxaDesconto = taxa - this.valorDeposito;
		return taxaDesconto -= valorSaque;
	}
	
	public String toString() {
		return "Número da conta: " + this.numeroConta + " Nome do titular: " + this.nomeTitular + " Valor: " + this.valorDeposito;
	}
}
