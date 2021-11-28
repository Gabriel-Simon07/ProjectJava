package JavaEstrutural;

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {

		int numero1 = 89;
		int numero2 = 60;

		System.out.println(numero1 & numero2);
		System.out.println(numero1 | numero2);
		System.out.println(numero1 ^ numero2);

		Scanner scanner = new Scanner(System.in);

		int mask = 0b00100000; // Aqui poderia colocar tanto o número 32 quanto o valor em binário 0b00100000
		int n = scanner.nextInt();

		if ((n & mask) != 0) {
			System.out.println("O sexto bit é verdadeiro");
		} else {
			System.out.println("O sexto bit é falso");
		}
	}

}
