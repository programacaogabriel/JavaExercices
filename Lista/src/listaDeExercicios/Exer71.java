package listaDeExercicios;

import java.util.Scanner;

public class Exer71 {

	public static void main(String[] args) {
		/*71) Fa�a um programa que preencha automaticamente um vetor num�rico com 8
	posi��es, conforme abaixo:
	999 999 999 999 999 999 999 999*/
	Scanner sc=new Scanner(System.in);
	
	int i,n=8;
	int []vet = new int[n];
	
	
	for(i=0;i<n;i++) {
		vet[i]=999;
	}
	
	for(i=0;i<n;i++) {
		System.out.print("  "+i+" ");
		
	}
	System.out.println();
	for(i=0;i<n;i++) {
		
		System.out.print(" "+vet[i]);
	}
	
	
	sc.close();
	}

}
