package Listas;

public class ForEach {

	public static void main(String[] args) {

		String[] nomes = new String[] {"Maria", "João", "Nicolas"};
		
		for(int i =0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
	}

}
