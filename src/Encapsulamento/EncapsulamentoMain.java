package Encapsulamento;

import java.util.Locale;

public class EncapsulamentoMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Encapsulamento encapsulamento = new Encapsulamento();
		
		encapsulamento.setNome("Jo�o da Silva");
		encapsulamento.setPreco(2.50);
		
		
		System.out.println(encapsulamento.getNome());
		System.out.println(encapsulamento.getPreco());
	}

}
