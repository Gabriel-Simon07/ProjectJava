package JavaEstrutural;

public class VetorUsandoSplit {

	public static void main(String[] args) {
		
		String string = "macaco leao cachorro";
		String[] vetor = string.split(" ");
		String posicao1 = vetor[0];
		String posicao2 = vetor[1];
		String posicao3 = vetor[2];
	
		System.out.println("As tr�s posi��es do vetor : \n" + "Posicao 1 = " + posicao1 + "\nPosi��o 2  = " + posicao2 +
				"\nPosi��o3 = " + posicao3);
	}

}
