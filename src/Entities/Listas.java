package Entities;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {

		List<String> listaNome = new ArrayList<>();
		
		listaNome.add("Maria");
		listaNome.add("João");
		listaNome.add("Cisa");
		listaNome.add("Gustavo");
		listaNome.add("Morgana");
		
		listaNome.add(2, "Monalisa");

		listaNome.forEach(nomes -> System.out.println(nomes.toString()));
		
		listaNome.removeIf(nome -> nome.charAt(0) == 'M');
	}

}
