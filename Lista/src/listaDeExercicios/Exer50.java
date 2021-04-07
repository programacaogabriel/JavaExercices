package listaDeExercicios;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exer50 {

	public static void main(String[] args) {
		/*
		 * 50) Desenvolva um programa que fa�a o sorteio de 20 n�meros entre 0 e 10 e
		 * mostre na tela: a) Quais foram os n�meros sorteados b) Quantos n�meros est�o
		 * acima de 5 c) Quantos n�meros s�o divis�veis por 3
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Random gerador = new Random();
		int valor, numero = 0, acima = 0, divisiveis = 0;

		System.out.println("Gerador Numerico");
		System.out.print("N�meros Sorteados:  ");
		while (numero < 20) {
			valor = gerador.nextInt(10);
			if (valor > 5) {
				acima = acima + 1;
			} if (valor == 3 || valor == 6 || valor ==9) {
				divisiveis = divisiveis + 1;
			}
			System.out.print(" "+valor);
			numero++;
		}
		System.out.println();
		System.out.println("Numeros acima de 5:  "+ acima);
		System.out.print("Divisiveis por 3:  "+divisiveis);
		sc.close();
	}

}
