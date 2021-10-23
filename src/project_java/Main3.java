package project_java;

public class Main3 {

	public static void main(String[] args) {
		int x,y,z;
		
		x = 10;
		y = 10;
		z = 10;
		
		int valorCalculado = 10 + (x * y) / z;
		
		System.out.printf("O valor total calculado é %d", valorCalculado);
		
		System.out.println("----------");
		
		float baseMenor, baseMaior, altura, area;
		baseMenor = 6;
		baseMaior = 8;
		altura = 5;
		area = 0;
		
		area = (baseMaior + baseMenor)/2*altura;
		
		System.out.printf("O valor da área é %.2f", area);
		
		System.out.println("----------");
		
		int valor = 0;
		double valor_com_casting = 10;
		
		valor = (int)valor_com_casting;
		 
		System.out.println("Valor usando o casting : " + valor);
	}

}
