package listaDeExercicios;

import java.util.Scanner;

public class Exer56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 56) Crie um programa que leia v�rios n�meros pelo teclado e mostre no final o
		 * somat�rio entre eles. Obs: O programa ser� interrompido quando o n�mero 1111
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
