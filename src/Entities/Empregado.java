package Entities;

public class Empregado {

	String nome;
	double salarioBruto;
	double imposto;
	
	public double salarioLiquido() {
		return this.salarioBruto - this.imposto;
	}
	
	public void aumentoSalario(double percentual) {
		this.salarioBruto += this.salarioBruto * percentual / 100;
	}
	
	public String toString() {
		return "Empregado: " + this.nome + ", R$ " + salarioLiquido();
	}
}
