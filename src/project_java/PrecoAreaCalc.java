package project_java;

import java.util.Locale;
import java.util.Scanner;

public class PrecoAreaCalc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double largura = scanner.nextDouble();
		double comprimento = scanner.nextDouble();
		double metroQuadrado = scanner.nextDouble();
		
		double area, preco;
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		System.out.printf("O tamanho da �rea � de %.2f%n", area);
		System.out.printf("O pre�o do metro quadrado � de %.2f", preco);
		
		scanner.close();
	}

}
