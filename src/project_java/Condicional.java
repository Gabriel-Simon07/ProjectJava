package project_java;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		short valor;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um valor : ");
		valor = scanner.nextShort();
		
		if(valor > 4)
			System.out.println("Valor maior que 4");
		
		else if(valor == 4)
			System.out.println("Valor igual a 4");
		
		else
			System.out.println("Valor menor que 4");
		
		scanner.close();
	}

}
