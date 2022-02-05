package Matrizes;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lines = sc.nextInt();
		int columns = sc.nextInt();
		int[][] matriz = new int[lines][columns];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
					System.out.println("++++++++++++++++++++++++++++");
				}
			}
		}
		
		sc.close();
		
	}

}
