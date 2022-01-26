package Array;

import java.util.Locale;
import java.util.Scanner;

public class ProgramArrayProduct {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		Product[] product = new Product[n];

		for (int i = 0; i < product.length; i++) {
			scanner.next();
			String name = scanner.nextLine();
			System.out.println(name);
			double preco = scanner.nextDouble();
			System.out.println(preco);

			product[i] = new Product(name, preco);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < product.length; i++) { 
			sum += product[i].getPreco();
		}
		
		double avg = sum / product.length;
		System.out.println(avg);
	}
}
