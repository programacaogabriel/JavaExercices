package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
	PREÇO PROMOCIONAL, com 5% de desconto.*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double produto, valorFinal;
		
		System.out.print("Digite o valor do produto: R$");
		produto = sc.nextDouble();
		valorFinal = produto-(produto*5)/100;
		System.out.println("\nO valor do produto com 5% de desconto é igual a "+ valorFinal);
	
	sc.close();
	}

}
