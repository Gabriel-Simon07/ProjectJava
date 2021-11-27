package project_java;

import java.util.Locale;
import java.util.Scanner;

public class LacoRepeticaoDoWhile {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		char acao;			
		
		do {
			System.out.print("Digite a temperatura em Celsius : \n");
			
			double celsius = scanner.nextDouble();
			double fahrenheit = 9 * celsius / 5 + 32;
			
			System.out.print(fahrenheit + " F°\n");
			
			System.out.print("Deseja repetir (S/N)\n");
			acao = scanner.next().charAt(0);
		}
		while(acao != 'n');
		scanner.close();
	}

}
