package Composition;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the department's name : ");
		String departmentName = scanner.nextLine();
		System.out.println("Enter work  data : ");
		System.out.println("Name : ");
		String workerName = scanner.nextLine();
		System.out.println("Level : ");
		String workerLevel = scanner.nextLine();
		System.out.println("Base salary : ");
		double baseSalary = scanner.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		
		
		
		
		
		scanner.close();
	}

}
