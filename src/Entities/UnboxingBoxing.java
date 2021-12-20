package Entities;

public class UnboxingBoxing {

	public static void main(String[] args) {
		
		int valor = 20;
		Object obj = valor;
		
		System.out.println(obj);
	
		int valor2 = (int) obj;
		System.out.println(valor2);
	}
	

}
