import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Exercício 01 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não. Exemplos: Entrada: Saída: -10 NEGATIVO Entrada: Saída: 8 NAO
		 * NEGATIVO Entrada: Saída: 0 NAO NEGATIVO
		 */

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Digite um valor: ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("O numero é Positivo");
		} else if (num < 0) {
			System.out.println("O numero é Negativo");
		} else {
			System.out.println("O numero é 0");
		}
	}

}
