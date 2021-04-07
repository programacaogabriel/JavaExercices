import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Exercício 04 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais. Exemplos: Entrada: Saída: 25 100 5.50 NUMBER = 25 SALARY = U$
		 * 550.00 Entrada: Saída: 1 200 20.50 NUMBER = 1 SALARY = U$ 4100.00 Entrada:
		 * Saída: 6 145 15.55 NUMBER = 6 SALARY = U$ 2254.75
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n, hrs;
		double sal, tot;

		System.out.println("Pagamento Funcionário");
		System.out.println();

		System.out.print("Digite o código do funcionário:  ");
		n = sc.nextInt();
		System.out.print("Digite a Quantidade de Horas trabalhadas:  ");
		hrs = sc.nextInt();
		System.out.print("Digite o salário por horas:   ");
		sal = sc.nextDouble();
		tot = hrs * sal;
		System.out.println();

		System.out.println(" O número do funcionário é " + n + " e receberá um salário de $ " + tot);
		sc.close();

	}

}
