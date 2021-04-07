package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {

		/*
		 * 23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
		 * para todos, mas especialmente para mulheres. Faça um programa que leia nome,
		 * sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
		 * que: - Homens ganham 5% de desconto - Mulheres ganham 13% de desconto
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String nome;
		char sexo;
		double valor, valorFinal;

		System.out.print("Digite o seu nome: ");
		nome = sc.next();
		System.out.print("Digite o seu sexo M / F: ");
		sexo = sc.next().charAt(0);
		System.out.print("Digite o valor do produto: ");
		valor = sc.nextDouble();

		if (sexo == 'F') {
			valorFinal = valor - ((valor * 13) / 100);
		} else {
			valorFinal = valor - ((valor * 5) / 100);
		}
		System.out.println("\nOlá "+nome+" seu desconto será de R$ "+valorFinal);
		sc.close();

	}

}
