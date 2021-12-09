package Entities;

import java.util.Locale;
import java.util.Scanner;

public class CircuferenciaMain {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio : ");
		double raio = scanner.nextDouble();
		
		double circuferenciaRaio = 	Circuferencia.circuferencia(raio);
		
		double volumeRaio = 	Circuferencia.volume(raio);
		
		System.out.printf("O valor da circunferência %.2f : ", circuferenciaRaio);
		System.out.printf("O valor do volume %.2f : ", volumeRaio);
		System.out.printf("O valor de PI %.2f : ", 	Circuferencia.PI);
		
		scanner.close();
	}

	
	
}
