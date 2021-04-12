package Vet;

import java.util.Scanner;

public class Vetores18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0,valor;
		System.out.println("Digite o valor dos vetores");
		count=sc.nextInt();
		int [] vet = new int[count];
		
		System.out.println("Digite os valores");
		for(int i=0; i<vet.length;i++) {
			vet[i]=sc.nextInt();
		}
		
		
		System.out.println("Escolha o número");
		for(int i=0; i<vet.length;i++) {
			System.out.print(vet[i]+" ");
		}
		
		valor=sc.nextInt();
		for(int i=0; i<vet.length;i++) {
			if(valor==vet[i]) {
				int x=1;
				while(x<=10) {
					System.out.println(valor+"x"+x+":"+ valor*x+" ");
					x++;
				}
			}
		}
		
		
	sc.close();	
	}
}
