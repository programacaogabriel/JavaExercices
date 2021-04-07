package listaDeExercicios;

import java.util.Scanner;

public class Exer72 {

	public static void main(String[] args) {
		try (/*72) Crie um programa que preencha automaticamente (usando lógica, não apenas
						atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
						5 10 15 20 25 30 35 40 45 50
						0 1 2 3 4 5 6 7 8 9*/
		Scanner sc = new Scanner(System.in)) {
			int i,n=11;
			
			int vet[] = new int[n];
			
			for(i=0;i<n;i++) {
				vet[i]=5*i;
			}
			
			for(i=0;i<n;i++) {
				System.out.println(vet[i]);
			}

			sc.close();
		}
	}

}
