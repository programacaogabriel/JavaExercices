package listaDeExercicios;

import java.util.Scanner;

public class Exer56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 56) Crie um programa que leia vários números pelo teclado e mostre no final o
		 * somatório entre eles. Obs: O programa será interrompido quando o número 1111
		 * for digitado
		 */
		int valor = 0, valorF = 0, valorTotal = 0,numero=0;
		System.out.println("Numeros");

		do {

			valor=sc.nextInt();
			valorTotal=valorTotal+valor;
			++valor;
		} while (valor <= 1112);
		System.out.println("Valor Total "+valorTotal);

	}

}
