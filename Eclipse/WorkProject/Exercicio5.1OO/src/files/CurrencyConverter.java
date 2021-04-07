package files;

public class CurrencyConverter {

	public static double IOF = 0.06;

	public static double valor(double moeda, double compra) {
		return moeda * compra * (1.0 + IOF);
	}

}
