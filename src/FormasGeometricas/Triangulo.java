package FormasGeometricas;

public class Triangulo {

	double a;
	double b;
	double c;
	
	public double area() {
		double p = (this.a + this.b + this.c) / 2.0;
		return Math.sqrt(p * (p - this.a)* (p - this.b)* (p - this.c));
	}
}
