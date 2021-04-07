package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer51 {

	public static void main(String[] args) {
		/*
		 * 51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na
		 * tela qual foi o maior e qual foi o menor preço digitados.
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double valor, valorMaior = 0, valorMenor = 100.00; 
				int numero = 0;

		System.out.println("Mercado Javali");
		System.out.println("Digite o valor dos preços");

		while (numero < 8) {
			valor = sc.nextDouble();
			if (valor > valorMaior) {
				valorMaior = valor;
			}
			if (valor < valorMenor) {
				valorMenor = valor;
			}
			numero++;
		}
		System.out.println(" Valor menor R$" + valorMenor);
		System.out.println(" Valor maior R$" + valorMaior);

		sc.close();
	}

}
