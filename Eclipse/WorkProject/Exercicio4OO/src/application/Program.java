package application;

import java.util.Locale;
import java.util.Scanner;

import utils.dollarBuy;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		dollarBuy dollar = new dollarBuy();

		System.out.print("Whats is dollar price? ");
		dollar.priceDollar = sc.nextDouble();
		System.out.print("How many dollar will be bougth? ");
		dollar.buyDollar = sc.nextDouble();

		System.out.println(dollar);

	
	sc.close();
	}

}
