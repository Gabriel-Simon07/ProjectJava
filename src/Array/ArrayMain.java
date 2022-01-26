package Array;

import java.util.Locale;
import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Informe a quantidade de medidas");
		int qtdIdades = scanner.nextInt();
		double[] array = new double[qtdIdades];
		
		
		for(int i = 0; i < qtdIdades; i++) {
			System.out.println("Informe a altura " + i);
			array[i] = scanner.nextDouble();
		}
		
		double soma = 0.0;
		for(int i = 0; i < qtdIdades; i++) {
			soma += array[i];
		}
		double media = soma / qtdIdades;
		
		System.out.println("A média das alturas é de: " + media);
		
		scanner.close();
	}

}
