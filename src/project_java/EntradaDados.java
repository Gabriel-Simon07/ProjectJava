package project_java;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String saidaNome;
		int saidaIdade;
		double saidaAltura;
		char saidaSexo;
		
		saidaNome = scanner.next();
		saidaIdade = scanner.nextInt();
		
		Locale.setDefault(Locale.US);
		saidaAltura = scanner.nextDouble();
		saidaSexo = scanner.next().charAt(0);
		
		System.out.printf("Meu nome � %s, tenho %d anos, minha altura � %.2f e meu sexo"
				+ " � %s.", saidaNome, saidaIdade, saidaAltura, saidaSexo);
		
		scanner.close();
	}

}
