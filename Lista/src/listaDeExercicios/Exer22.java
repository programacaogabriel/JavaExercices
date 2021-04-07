package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*
		 * 21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
		 * BISSEXTO.
		 */
		int ano;
		System.out.println("Ano bissexto");
		System.out.println("Digite o ano");
		ano = sc.nextInt();
		if( ano%4==0 || ano%400==0){
			System.out.println("O ano é bissexto");
		}else {
			System.out.println("O ano não é bissexto");
		}
		sc.close();
		
	}

}
