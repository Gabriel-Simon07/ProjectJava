package project_java;

import java.util.Locale;

public class Main2 {

	public static void main(String[] args) {
		String procuct1 = "Computer";
		String procuct2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s which price is %.2f%n%s"
				+ "Record: %d years old, code %d and gender %s %nMeasue with "
				+ "eight decimal places: %.8f%nRouded (three decimal places): "
				+ "%.3f%n", 
				procuct1, price1, procuct2, age, code, gender, measure, measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
