import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Exercício 05 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java Com
		 * base na tabela abaixo, escreva um programa que leia o código de um item e a
		 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 * Exemplos: Entrada: Saída: 3 2 Total: R$ 10.00 Entrada: Saída: 2 3 Total: R$
		 * 13.50
		 */
		Scanner sc = new Scanner(System.in);
		int a, b;
		double r;

		System.out.println("Lanchonete Javali Feliz");
		System.out.print("Escolha seu produto, digite o Código:  ");
		a = sc.nextInt();
		System.out.print("Quantos você irá querer? ");
		b = sc.nextInt();
		
		if (a == 1) {
			r = b * 4.00;
		} else if (a == 2) {
			r = b * 4.50;
		} else if (a == 3) {
			r = b * 5.00;
		} else if (a == 4) {
			r = b * 2.00;
		} else  {
			r = b * 1.50;
		}
			System.out.println("Tenha um bom dia!!");
	        System.out.println("Total do seu lanche:  "+r);
		
		sc.close();
	
	}

}
