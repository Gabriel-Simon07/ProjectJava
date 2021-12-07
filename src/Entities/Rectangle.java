package Entities;

public class Rectangle {

	double altura;
	double largura;

	public double area() {
		return this.largura * this.altura;
	}

	public Double perimetro() {
		return (this.largura + this.altura) * 2;
	}

	public Double diagonal() {
		return Math.sqrt((this.largura * this.largura) + (this.altura * this.altura));
	}
}
