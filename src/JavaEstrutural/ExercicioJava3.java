package JavaEstrutural;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = 2;
		double valor;
		
		
		
		System.out.println("Informe o valor da �rea : ");
		valor = scanner.nextInt();
		
		double area = pi * (valor * raio);
		Locale.setDefault(Locale.US);
		System.out.printf("O valor da �rea : %.4f ", area);
	}

}
