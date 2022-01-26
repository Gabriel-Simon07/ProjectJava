package CotacaoDolar;

import java.util.Locale;
import java.util.Scanner;

public class CotacaoDolarMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Preço do dólar : ");
		CotacaoDolar.precoDolar = scanner.nextDouble();

		System.out.println("Quantos dólares : ");
		CotacaoDolar.qtdDolar = scanner.nextDouble();

		System.out.printf("Valor em dólar convertido para R$ %.2f", CotacaoDolar.dolarConvertidoReais());

	}

}
