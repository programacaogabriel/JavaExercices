package listaDeExercicios;

import java.util.Scanner;

public class Exer84 {

	public static void main(String[] args) {
		/*
		 * 84) Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
		 * valores em dois vetores, em posições relacionadas. No final, mostre uma
		 * listagem contendo apenas os dados das pessoas menores de idade.
		 */
		Scanner sc = new Scanner(System.in);

		int i, idade,  n = 9;
		String nome,nomeMaior;
		int vetidade[] = new int[n];
		int vetidadeMaior[]= new int[n];
		String vetnome[] = new String[n];
		String vetnomeMaior[] = new String[n];
		
		System.out.println("Programa de maior idade, digite o nome e a idade.");
		for (i = 0; i < n; i++) {
			System.out.println("A " + i + "º Pessoa");
			vetnome[i]=nome=sc.next();
			vetidade[i] = idade = sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			if(vetidade[i]>18) {
				vetnomeMaior[i]=vetnome[i];
				vetidadeMaior[i]=vetidade[i];
				System.out.print(vetnomeMaior[i]+" :");
				System.out.print(vetidadeMaior[i]);
				System.out.println();
			}
		}

		sc.close();
	}

}
