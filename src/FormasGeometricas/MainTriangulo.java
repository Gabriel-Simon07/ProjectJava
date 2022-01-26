package FormasGeometricas;

import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class MainTriangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
	
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		double p;

		System.out.println("Informe os lados do triângulo X : ");
		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble(); 

		System.out.println("Informe os lados do triângulo Y : ");
		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();
		
		double areaX = x.area();

		double areaY = y.area();

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
