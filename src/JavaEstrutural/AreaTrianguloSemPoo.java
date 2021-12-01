package JavaEstrutural;

import java.util.Locale;
import java.util.Scanner;

public class AreaTrianguloSemPoo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		double p;

		System.out.println("Informe os lados do triângulo X : ");
		xA = scanner.nextDouble();
		xB = scanner.nextDouble();
		xC = scanner.nextDouble(); 

		System.out.println("Informe os lados do triângulo Y : ");
		yA = scanner.nextDouble();
		yB = scanner.nextDouble();
		yC = scanner.nextDouble();

		p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (xA + xB + xC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("O valor do triângulo X %.4f%n", areaX);
		System.out.printf("O valor do triângulo Y %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("A área X é maior área");
		} else {
			System.out.println("A área Y é maior área");
		}

		scanner.close();
	}

}
