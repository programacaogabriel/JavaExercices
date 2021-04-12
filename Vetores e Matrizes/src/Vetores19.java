package Vet;

import java.util.Scanner;

public class Vetores19 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int count =0;
		System.out.println("Digite o valor dos Vetores");
		count=sc.nextInt();
		int [] vet= new int[count];
		
		for(int i=0;i<vet.length;i++) {
			vet[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<vet.length;i++) {
			System.out.println((vet[i]+ 5*i)%(vet[i]+1));
		}
		
		
		sc.close();
	}

}
