package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {

		/*
		 * 26) Escreva um algoritmo que leia dois n�meros inteiros e compare-os,
		 * mostrando na tela uma das mensagens abaixo: - O primeiro valor � o maior - O
		 * segundo valor � o maior - N�o existe valor maior, os dois s�o iguais
		 */
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n1,n2;
		System.out.println("Qual n�mero ser� o maior");
		System.out.println();
		System.out.println("Digite o 1� valor");
		n1=sc.nextInt();
		System.out.println("Digite o 2� valor");
		n2=sc.nextInt();
		
		if(n1>n2) {
			System.out.println("O primeiro valor: "+n1+" � o maior");
		}else if(n2>n1) {
			System.out.println("O segundo valor:  "+n2+" � o maior");
		}else {
			System.out.println("N�o existem valores maiores, ambos s�o iguais");
		}
		
		sc.close();
	}
}