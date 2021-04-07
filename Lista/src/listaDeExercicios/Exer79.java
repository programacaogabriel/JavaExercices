package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer79 {

	public static void main(String[] args) {
		try (/*
				 * 79) Desenvolva um programa que leia 10 números inteiros e guarde-os em um
				 * vetor. No final, mostre quais são os números pares que foram digitados e em
				 * que posições eles estão armazenados.
				 */
		Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);

			int v = 0, i, n = 10, g = 10;

			int vet[] = new int[n];
			int vet1[] = new int[g];
			System.out.println("Digite 10 valores: ");
			for (i = 0; i < 10; i++) {
				v = sc.nextInt();
				if (v % 2 == 0) {
					vet[i] = v;
					vet1[i] = i;
				}
			}
			System.out.println("Valores Pares são estes: ");
			for (i = 0; i < 10; i++) {

				if (vet[i] != 0) {
					System.out.print(vet1[i] + ": ");
					System.out.println(vet[i]);
				}
			}

			sc.close();
		}
	}
}
