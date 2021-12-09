package Entities;

import java.util.Locale;
import java.util.Scanner;

public class CotacaoDolarMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Pre�o do d�lar : ");
		CotacaoDolar.precoDolar = scanner.nextDouble();

		System.out.println("Quantos d�lares : ");
		CotacaoDolar.qtdDolar = scanner.nextDouble();

		System.out.printf("Valor em d�lar convertido para R$ %.2f", CotacaoDolar.dolarConvertidoReais());

	}

}
