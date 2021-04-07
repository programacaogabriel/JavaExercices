package application;

import java.util.Locale;
import java.util.Scanner;

import files.CurrencyConverter;

public class Programa03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double moeda = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double compra=sc.nextDouble();
		
		double result = CurrencyConverter.valor(moeda, compra);
		System.out.printf("Amount to be paid in reais: %.2f",result);
		
		sc.close();

	}

}
