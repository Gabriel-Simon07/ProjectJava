package project_java;

public class Main3 {

	public static void main(String[] args) {
		int x,y,z;
		
		x = 10;
		y = 10;
		z = 10;
		
		int valorCalculado = 10 + (x * y) / z;
		
		System.out.printf("O valor total calculado � %d", valorCalculado);
		
		System.out.println("----------");
		
		float baseMenor, baseMaior, altura, area;
		baseMenor = 6;
		baseMaior = 8;
		altura = 5;
		area = 0;
		
		area = (baseMaior + baseMenor)/2*altura;
		
		System.out.printf("O valor da �rea � %.2f", area);
		
	}

}
