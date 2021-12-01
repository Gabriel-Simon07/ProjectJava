package JavaPOO;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		double p;

		System.out.println("Informe os lados do tri�ngulo X : ");
		xA = scanner.nextDouble();
		xB = scanner.nextDouble();
		xC = scanner.nextDouble();

		System.out.println("Informe os lados do tri�ngulo Y : ");
		yA = scanner.nextDouble();
		yB = scanner.nextDouble();
		yC = scanner.nextDouble();

		p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (xA + xB + xC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("O valor do tri�ngulo X %.4f%n", areaX);
		System.out.printf("O valor do tri�ngulo Y %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("A �rea X � maior �rea");
		} else {
			System.out.println("A �rea Y � maior �rea");
		}

		scanner.close();
	}

}
