package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer47 {

	public static void main(String[] args) {
		/*
		 * 47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500
		 * + 450 + 400 + 350 + 300 + ... + 50 + 0
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int valor = 500;
		while (valor <= 0) {
			System.out.print(valor + " + ");
			valor = valor - 50;

		}
		sc.close();

	}

}
