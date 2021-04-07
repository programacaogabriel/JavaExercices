package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {

		/*
		 * 26) Escreva um algoritmo que leia dois números inteiros e compare-os,
		 * mostrando na tela uma das mensagens abaixo: - O primeiro valor é o maior - O
		 * segundo valor é o maior - Não existe valor maior, os dois são iguais
		 */
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n1,n2;
		System.out.println("Qual número será o maior");
		System.out.println();
		System.out.println("Digite o 1º valor");
		n1=sc.nextInt();
		System.out.println("Digite o 2º valor");
		n2=sc.nextInt();
		
		if(n1>n2) {
			System.out.println("O primeiro valor: "+n1+" é o maior");
		}else if(n2>n1) {
			System.out.println("O segundo valor:  "+n2+" é o maior");
		}else {
			System.out.println("Não existem valores maiores, ambos são iguais");
		}
		
		sc.close();
	}
}