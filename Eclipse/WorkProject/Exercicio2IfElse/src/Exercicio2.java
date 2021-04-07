import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * Exercício 02 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar. Exemplos: Entrada: Saída: 12 PAR Entrada: Saída: -27 IMPAR Entrada:
		 * Saída: 0 PAR
		 */

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Digite o valor:  ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("O numero é PAR!");
		} else {
			System.out.println("O número é IMPAR!");
		}

	}

}
