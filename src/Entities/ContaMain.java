package Entities;

import java.util.Locale;
import java.util.Scanner;

public class ContaMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.println("Informe o número da conta: ");
		conta.numeroConta = scanner.nextInt();
		
		System.out.println("Informe o nome do titular: ");
		conta.nomeTitular = scanner.next();
		
		System.out.println("Informe o valor a ser depositado: ");
		conta.valorDeposito = scanner.nextDouble();
		
		conta.deposito(3);
		
		System.out.println(conta.toString());
	}

}
