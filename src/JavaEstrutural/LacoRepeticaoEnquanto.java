package JavaEstrutural;

import java.util.Locale;
import java.util.Scanner;

public class LacoRepeticaoEnquanto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um valor :");
		double valor = scanner.nextDouble();
		double soma = 0;
		
		while (valor != 0) {
			soma+=valor;
			valor = scanner.nextDouble();
		}
		System.out.printf("O valor total é %.2f", soma);

		scanner.close();
	}

}
