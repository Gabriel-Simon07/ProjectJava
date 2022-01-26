package Empregado;

import java.util.Locale;
import java.util.Scanner;

public class EmpregadoMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Empregado empregado = new Empregado();
		
		System.out.println("Nome: ");
		empregado.nome = scanner.next();
		System.out.println("Salário Bruto: ");
		empregado.salarioBruto = scanner.nextDouble();
		System.out.println("Imposto: ");
		empregado.imposto = scanner.nextDouble();
		
		System.out.println(empregado.toString());
		
		System.out.println("Qual o percentual de aumento do salário : ");
		empregado.aumentoSalario(scanner.nextDouble());
		
		System.out.println("Dados atualizados " + empregado.toString());
	}

}
