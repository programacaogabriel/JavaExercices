package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer69 {

	public static void main(String[] args) {
		/*
		 * 69) [DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de
		 * uma PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos
		 * da PA e a soma entre todos os valores da sequência.
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int primeiroTermo, razao, i, valor = 0, total = 0;
		System.out.print("Digite o primeiro termo:  ");
		primeiroTermo = sc.nextInt();
		System.out.print("Digite o valor da razão:  ");
		razao = sc.nextInt();

		if (razao > primeiroTermo) {
			valor = razao - primeiroTermo;
			total = primeiroTermo + (10 - 1) * valor;
		} else {
			System.out.println("Dados incorretos");
		}
		
		for (i = 0; i <= 10; i++) {
			System.out.print(i+",");
			i=i+valor;
			
		}
		sc.close();
		System.out.println("Valor total "+total);
		
		

	}

}
