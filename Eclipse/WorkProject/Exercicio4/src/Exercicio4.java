import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 04 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
		 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
		 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
		 * casas decimais. Exemplos: Entrada: Sa�da: 25 100 5.50 NUMBER = 25 SALARY = U$
		 * 550.00 Entrada: Sa�da: 1 200 20.50 NUMBER = 1 SALARY = U$ 4100.00 Entrada:
		 * Sa�da: 6 145 15.55 NUMBER = 6 SALARY = U$ 2254.75
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n, hrs;
		double sal, tot;

		System.out.println("Pagamento Funcion�rio");
		System.out.println();

		System.out.print("Digite o c�digo do funcion�rio:  ");
		n = sc.nextInt();
		System.out.print("Digite a Quantidade de Horas trabalhadas:  ");
		hrs = sc.nextInt();
		System.out.print("Digite o sal�rio por horas:   ");
		sal = sc.nextDouble();
		tot = hrs * sal;
		System.out.println();

		System.out.println(" O n�mero do funcion�rio � " + n + " e receber� um sal�rio de $ " + tot);
		sc.close();

	}

}
