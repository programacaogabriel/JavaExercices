package utils;

	public class dollarBuy {
	public double priceDollar;
	public double buyDollar;
	

	
	
	public double currencyConveter(){
		return (priceDollar*buyDollar)+(priceDollar*buyDollar)*0.06;
	}
	
		
	public String toString() {
		return "Valor $"+String.format("%.2f",currencyConveter());
	}
	
}
