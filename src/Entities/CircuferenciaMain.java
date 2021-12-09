package Entities;

import java.util.Locale;
import java.util.Scanner;

public class CircuferenciaMain {

	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio : ");
		double raio = scanner.nextDouble();
		
		double circuferenciaRaio = circuferencia(raio);
		
		double volumeRaio = volume(raio);
		
		System.out.printf("O valor da circunferência %.2f : ", circuferenciaRaio);
		System.out.printf("O valor do volume %.2f : ", volumeRaio);
		System.out.printf("O valor de PI %.2f : ", PI);
		
		scanner.close();
	}

	public static double circuferencia(double raio) {
		return 2 * PI * raio;
	}
	
	public static double volume(double raio) {
		return  4 * PI * raio * raio * raio / 3;
	}
	
}
