package Entities;

import java.util.Locale;
import java.util.Scanner;

public class EmpregadoMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Empregado empregado = new Empregado();
		
		System.out.println("Nome: ");
		empregado.nome = scanner.next();
		System.out.println("Sal�rio Bruto: ");
		empregado.salarioBruto = scanner.nextDouble();
		System.out.println("Imposto: ");
		empregado.imposto = scanner.nextDouble();
		
		System.out.println(empregado.toString());
		
		System.out.println("Qual o percentual de aumento do sal�rio : ");
		empregado.aumentoSalario(scanner.nextDouble());
		
		System.out.println("Dados atualizados " + empregado.aumentoSalario());
	}

}
