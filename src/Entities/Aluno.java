package Entities;

public class Aluno {

	String nome;
	double nota1;
	double nota2;
	double nota3;

	public double somaNotas() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public double qtdFaltanteNota() {
		if(somaNotas() < 60) {
			return 60 - somaNotas();
		} else {
			return 0.0;
		}
	}
}
