import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 01 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
		 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero �
		 * negativo ou n�o. Exemplos: Entrada: Sa�da: -10 NEGATIVO Entrada: Sa�da: 8 NAO
		 * NEGATIVO Entrada: Sa�da: 0 NAO NEGATIVO
		 */

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Digite um valor: ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("O numero � Positivo");
		} else if (num < 0) {
			System.out.println("O numero � Negativo");
		} else {
			System.out.println("O numero � 0");
		}
	}

}
