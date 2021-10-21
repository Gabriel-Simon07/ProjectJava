package project_java;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int idade = 25;
		double altura = 1.895874;
		String nome = "Gabriel";
		
		System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e tenho "
				+ altura + " de altura.");
		System.out.printf("%.2f%n", altura);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", altura);
		System.out.printf("Minha altura é %.2f%n", altura);
		
		String nome_pessoa = "José";
		int idade_pessoa = 11;
		double salario_pessoa = 25.00;
		
		System.out.printf("Meu nome é %s, meu salário é de %.2f reais e "
				+ "tenho %d anos.", nome_pessoa, salario_pessoa, idade_pessoa);
		
	}

}
