package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer41 {

	public static void main(String[] args) {
		/*
		 * 41) Desenvolva um programa que mostre na tela a seguinte contagem: 100 95 90
		 * 85 80 ... 0 Acabou!
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = 100;
		
		while(n>=0) {
			System.out.print(n+" ");
			n=n-5;
		}
		System.out.print("ACABOU!");
		sc.close();
	}

}
