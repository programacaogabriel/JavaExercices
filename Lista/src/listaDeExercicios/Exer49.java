package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer49 {

	public static void main(String[] args) {
		/*
		 * 49) Crie um programa que leia 6 n�meros inteiros e no final mostre quantos
		 * deles s�o pares e quantos s�o �mpares.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int par = 0, impar = 0, valor = 0,numero=0;

		System.out.println("Digite 6 valores");
		while (valor < 6) {
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}
			valor++;
		}
		System.out.println("total de n�meros Par: "+par);
		System.out.println("total de n�meros Impar: "+impar);
		sc.close();
	}

}
