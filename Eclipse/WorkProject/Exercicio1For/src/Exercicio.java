import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		/*
		 * Exercício 01 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso. Exemplo: Entrada:8
		 * Saída: 1 3 5 7
		 */
		Scanner sc = new Scanner(System.in);

		int x,i;
	
		
		
		System.out.print("Digite um valor:  ");
		x = sc.nextInt();
		
		
		System.out.println("O numero impar ate "+ x);
		for(i=0;i<=x;i++) {
			if(i%2!=0) {
			System.out.println(i);
			}
		}
		sc.close();
	}

}
