package JavaEstrutural;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c;

		System.out.println("Informe os valores : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		int valores = max(a, b, c);
		maior(valores);
	}

	public static int max(int a, int b, int c) {
		int maiorValor;
		if (a > b && a > c) {
			maiorValor = a;
		} else if (b > c) {
			maiorValor = b;
		} else {
			maiorValor = c;
		}
		return maiorValor;
	}

	public static void maior(int maiorValor) {
		System.out.println("O maior valor é " + maiorValor);
	}

}
