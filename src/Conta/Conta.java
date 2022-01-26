package Conta;

public class Conta {

	private int numeroConta;
	private String nomeTitular;
	private double valorDeposito;
	
	public Conta() {
	}
	
	public Conta(int numeroConta, String nomeTitular, double valorDepositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(valorDepositoInicial);
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
	
	public void deposito(double valorDeposito) {
		this.valorDeposito += valorDeposito;
	}
	
	public void saques(double valorSaque) {
		valorDeposito -= valorSaque + 5;
	}
	
	public String toString() {
		return "Dados da conta: \nNúmero da conta: " + this.numeroConta + " Nome do titular: " + this.nomeTitular + " Valor: " + this.valorDeposito;
	}
}
