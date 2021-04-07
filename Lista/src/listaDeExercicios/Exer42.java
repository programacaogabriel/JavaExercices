package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer42 {

	public static void main(String[] args) {
		/*
		 * 42) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
		 * qualquer e mostre uma contagem até esse valor: Ex: Digite um valor: 35
		 * Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int numero, n = 0;
		System.out.println("Digite ao valor que deseja chegar");
		numero = sc.nextInt();
		while (n <= numero) {
			System.out.print(n+" ");
			n++;
		}
		System.out.println("ACABOU!");
		sc.close();
	}

}
