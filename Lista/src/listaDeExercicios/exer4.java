package listaDeExercicios;

import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		/*
		 * 4) Desenvolva um algoritmo que leia dois números inteiros e mostre o
		 * somatório entre eles. Ex: Digite um valor: 8 Digite outro valor: 5 A soma
		 * entre 8 e 5 é igual a 13.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Soma");
		System.out.println();
		System.out.print("Digite o 1º numero: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o 2º numero: ");
		int n2 = sc.nextInt();
		int soma = n1+n2;
		System.out.println("A soma e igual a "+soma);
		
		sc.close();
	}

}
