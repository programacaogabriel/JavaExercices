import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * Exerc�cio 02 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
		 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou
		 * �mpar. Exemplos: Entrada: Sa�da: 12 PAR Entrada: Sa�da: -27 IMPAR Entrada:
		 * Sa�da: 0 PAR
		 */

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Digite o valor:  ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("O numero � PAR!");
		} else {
			System.out.println("O n�mero � IMPAR!");
		}

	}

}
