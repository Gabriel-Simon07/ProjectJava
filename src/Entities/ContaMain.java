package Entities;

import java.util.Locale;
import java.util.Scanner;

public class ContaMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Conta conta;

		System.out.println("Informe o número da conta: ");
		int numeroConta = scanner.nextInt();

		System.out.println("Informe o nome do titular: ");
		String nomeTitular = scanner.next();

		System.out.println("Tem deposito inicial (y/n)? ");
		char resposta = scanner.next().charAt(0);

		if (resposta == 'y') {
			System.out.println("Informe o valor a ser depositado: ");
			double valorDeposito = scanner.nextDouble();
			conta = new Conta(numeroConta, nomeTitular, valorDeposito);
			conta.deposito(valorDeposito);
		} else {
			conta = new Conta(numeroConta, nomeTitular);
		}
		
		System.out.println(conta.toString());
		
	}

}
