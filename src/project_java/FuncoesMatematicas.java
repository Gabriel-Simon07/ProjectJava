package project_java;

public class FuncoesMatematicas {

	public static void main(String[] args) {

		double x, y, z, A, B, C;
		x = 3.0;
		y = 4.0;
		z = -5.0;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.abs(25.0);

		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de  25 = " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("O valor absoluto de " + y + " = " + A);
		System.out.println("O valor absoluto de " + z + " = " + B);
	}

}
