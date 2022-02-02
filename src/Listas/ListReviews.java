package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListReviews {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Alex");
		nomes.add("Bob");
		nomes.add("Anna");
		nomes.add("Amarok");
		nomes.add(1, "Marco");
		
		System.out.println("Tamanho da lista");
		System.out.println(nomes.size());
		System.out.println("----------");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("Removendo índice da lista");
		//nomes.remove(0);
		nomes.remove("Anna");
		System.out.println("----------");
		
		System.out.println("Removendo índices pela inicial");
		nomes.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("----------");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("Encontrado o índice do Bob " + nomes.indexOf("Bob"));
		
		System.out.println("----------");
		System.out.println("Filtrando por letra");
		
		List<String> filtroPorLetra = nomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
	
		for(String nome : filtroPorLetra) {
			System.out.println(nome);
		}
		System.out.println("----------");
		System.out.println("Encontrado o primeiro índice com aquele caracter");
		String primeiro = nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

		System.out.println(primeiro);

	}

}
