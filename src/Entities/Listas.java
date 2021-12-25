package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> listaNome = new ArrayList<>();
		
		listaNome.add("Maria");
		listaNome.add("João");
		listaNome.add("Cisa");
		listaNome.add("Gustavo");
		listaNome.add("Morgana");
		listaNome.add("Nicolas");
		
		listaNome.add(2, "Monalisa");

		listaNome.forEach(nomes -> System.out.println(nomes.toString()));
		
		listaNome.removeIf(nome -> nome.charAt(0) == 'M');
		
		System.out.println("----------");
		
		System.out.println("Index of Morgana" + listaNome.indexOf("Maria"));
	
		listaNome.removeIf(nome -> nome.charAt(0) == 'M');
		for(String nomes : listaNome) {
			System.out.println(nomes);
		}
		
		System.out.println("----------");
		
		List <String> resultados = listaNome.stream().filter(nome -> nome.charAt(0) == 'N').collect(Collectors.toList());
		for(String nomes : resultados) {
			System.out.println(nomes);
		}
		
		System.out.println("----------");
		
		String nomes = listaNome.stream().filter(nome -> nome.charAt(0) == 'H').findFirst().orElse(null);
		System.out.println(nomes);
	}
	

}
