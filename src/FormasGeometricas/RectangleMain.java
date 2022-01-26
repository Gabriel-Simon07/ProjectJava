package FormasGeometricas;

import java.util.Locale;
import java.util.Scanner;

public class RectangleMain {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Informe a largura do retângulo : ");
		rectangle.largura = scanner.nextDouble();
		System.out.println("Informe a altura do retângulo : ");
		rectangle.altura = scanner.nextDouble();
		
		System.out.println("ÁREA " + rectangle.area());
		System.out.println("DIAGONAL " + rectangle.diagonal());
		System.out.println("PERÍMETRO " + rectangle.perimetro());
	}	
}
