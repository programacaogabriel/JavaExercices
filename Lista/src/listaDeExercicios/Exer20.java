package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*
		 * 20) Desenvolva um programa que leia um n�mero inteiro e mostre se ele � PAR
		 * ou �MPAR.
		 */
		int parImpar=0;
		
			System.out.println("Numero Par ou Impar");
			parImpar = sc.nextInt();
			int valor = parImpar%2;
			
			if(valor==0) {
				System.out.println("O numero � par");
			}else {
				System.out.println("O numero � impar");
			}
			sc.close();
			
	}

}
