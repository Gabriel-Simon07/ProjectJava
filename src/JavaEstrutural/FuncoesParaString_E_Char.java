package JavaEstrutural;

public class FuncoesParaString_E_Char {

	public static void main(String[] args) {

		String original = "gAabrieL TU 123 123 Bi113 ";
		System.out.println(original.toLowerCase());
		System.out.println(original.toUpperCase());
		System.out.println("String com espaço em branco : " + original + "-");

		// o trim retira os espaços em branco no final da String
		System.out.println("String com espaço em branco retirado pelo trim(): " + original.trim() + "-");

		// Ele inicia uma nova string se baseando na posicao do caracter informado
		System.out.println(original.substring(2));

		// Ele vai imprimir somente os caracteres que estiverem dentro desse range de
		// valores
		System.out.println(original.substring(1, 8));

		// Ele vai repor o sempre que tiver *a* ele vai trocar pelo *x*
		System.out.println(original.replace('a', 'x'));
		
		System.out.println(original.replace("TU", "MOS"));
	}

}
