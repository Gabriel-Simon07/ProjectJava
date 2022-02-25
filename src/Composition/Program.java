package Composition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter the department's name : ");
		String departmentName = scanner.nextLine();
		System.out.println("Enter work  data : ");
		System.out.println("Name : ");
		String workerName = scanner.nextLine();
		System.out.println("Level : ");
		String workerLevel = scanner.nextLine();
		System.out.println("Base salary : ");
		double baseSalary = scanner.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), 
				baseSalary, new Department(departmentName));
		
		System.out.println("How many contracts to this worker ?");
		int numberContracts = scanner.nextInt();
		
		for(int i= 1; i <= numberContracts; i++) {
			System.out.println("Enter contract #" + i  + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scanner.next());
			System.out.print("Value per hour: ");
			double valueHour = scanner.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = scanner.nextInt();
			HourContract contract = new HourContract(contractDate, valueHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scanner.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 1));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear	+ " : " + String.format("%.2f", worker.income(year, month)));
		scanner.close();
	}

}
