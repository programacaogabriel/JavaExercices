package listaDeExercicios;

import java.util.Random;
import java.util.Scanner;

public class Exer80 {

	public static void main(String[] args) {
		/*
		 * 80) Fa�a um algoritmo que preencha um vetor de 30 posi��es com n�meros entre
		 * 1 e 15 sorteados pelo computador. Depois disso, pe�a para o usu�rio digitar
		 * um n�mero (chave) e seu programa deve mostrar em que posi��es essa chave foi
		 * encontrada. Mostre tamb�m quantas vezes a chave foi sorteada
		 */
		Random generator = new Random();
		int i, n = 29, valor = 0, g = 29, chave = 0, posicao = 0, j = 29;
		int vet[] = new int[n];
		int vet1[] = new int[g];
		int vet2[] = new int[j];
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Digite um valor Chave: ");
			valor = sc.nextInt();
			for (i = 0; i < n; i++) {
				vet[i] = generator.nextInt(10);
				if (valor == vet[i]) {
					vet1[i] = vet[i];
					vet2[i] = i;
					chave = chave + 1;
					
				}
			}
			System.out.println();
			System.out.println("N�meros: ");
			for (i = 0; i < n; i++) {
				System.out.print(vet[i] + " ");
			}
			System.out.println();
			System.out.println("N�mero Digitado: ");
			for (i = 0; i < n; i++) {
				System.out.print(vet1[i] + " ");
			}

			System.out.println();
			System.out.println("As posi��es foram ");
			for (i = 0; i < n; i++) {
				if (vet2[i] != 0) {
					System.out.print(vet2[i] + "� ");
				}
			}
			System.out.println("\nChave foi sorteada " + chave + " vezes");

			sc.close();
		}
	}
}
