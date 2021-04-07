package listaDeExercicios;

import java.util.Scanner;

public class Exer81 {

	public static void main(String[] args) {
		/*
		 * 81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor.
		 * No final, mostre: a) Qual � a m�dia de idade das pessoas cadastradas b) Em
		 * quais posi��es temos pessoas com mais de 25 anos c) Qual foi a maior idade
		 * digitada (podem haver repeti��es) d) Em que posi��es digitamos a maior idade
		 */
		Scanner sc = new Scanner(System.in);
		int i, n = 7, g = 7, j = 7, idade = 0, mediaIdade = 0, posicoes = 0, maiorIdade = 0, posicaoMaiorIdade = 0;

		int vet[] = new int[n];
		int vet1[] = new int[g];
		int vet2[] = new int[j];
		System.out.println("Digite as idades");
		for (i = 1; i < n; i++) {
			vet[i] = idade = sc.nextInt();
			mediaIdade = mediaIdade + vet[i];

			if (vet[i] >= 25) {
				vet1[i] = i;
			}

			if (vet[i] > maiorIdade) {
				maiorIdade = idade;
				vet2[i] = i;
			}
		}

		mediaIdade = mediaIdade / n;
		System.out.println("A m�dia de idade das pessoas cadastradas: " + mediaIdade);
		System.out.print("Posi��es temos pessoas com mais de 25 anos: ");
		for (i = 1; i < n; i++) {
			if (vet1[i] != 0) {
				System.out.print(vet1[i] + "� ");
			}
		}
		System.out.println();
		System.out.println("A maior idade digitada : " + maiorIdade);
		System.out.print("Posi��es digitamos a maior idade: ");
		for (i = 1; i < n; i++) {
			if (vet2[i] != 0) {
				System.out.print(vet2[i]+"� ");
			}
		}
		sc.close();

	}

}
