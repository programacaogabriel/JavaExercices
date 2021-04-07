package listaDeExercicios;

import java.util.Random;
import java.util.Scanner;

public class Exer83 {

	public static void main(String[] args) {

		 /*83) [DESAFIO] Crie uma lógica que preencha um vetor 
de 20 posições com números aleatórios (entre 0 e 99) gerados
pelo computador. Logo em seguida, mostre os números 
gerados e depois coloque o vetor em ordem crescente,
mostrando no final os valores ordenados.*/
		
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		
		int i,j,n=20,temp;
		int vet[] = new int[n];
		
		for(i=0;i<n;i++) {
			vet[i]=generator.nextInt(99);
		}
		
		

		for(i=0;i<n;i++) {
			System.out.print(vet[i]+" ");
		}
		System.out.println();
		System.out.println();
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(vet[i]>vet[j]) {
				temp=vet[i];
				vet[i]=vet[j];
				vet[j]=temp;
				
				}
				
			}
			System.out.print(vet[i]+" ");
		}

		
	}

}
