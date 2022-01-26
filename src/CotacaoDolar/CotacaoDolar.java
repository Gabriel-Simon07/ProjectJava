package CotacaoDolar;

public class CotacaoDolar {

	static double precoDolar;
	static double qtdDolar;
	static double iof = 6;

	public static double valorDolarIof() {
		return  (precoDolar * qtdDolar) * iof / 100;
	}

	public static double dolarConvertidoReais() {
		return  (precoDolar * qtdDolar) + valorDolarIof();
	}

}
