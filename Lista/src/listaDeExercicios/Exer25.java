package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		/*
		 * 25) [DESAFIO] Crie um programa que leia o tamanho de tr�s segmentos de reta.
		 * Analise seus comprimentos e diga se � poss�vel formar um tri�ngulo com essas
		 * retas. Matematicamente, para tr�s segmentos formarem um tri�ngulo, o
		 * comprimento de cada lado deve ser menor que a soma dos outros dois.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double a,b,c;
		System.out.println("Triangulo");
		System.out.println();
		System.out.println("Digite o 1� valor");
		a=sc.nextDouble();
		System.out.println("Digite o 2� valor");
		b=sc.nextDouble();
		System.out.println("Digite o 3� valor");
		c=sc.nextDouble();
		
		if(a< (b+c) && b<(a+c) && c<(a+b)) {
			System.out.println("Os n�meros forman um triangulo");
		}else {
			System.out.println("Os n�meros n�o forman um triangulo");
		}
		sc.close();
	}

}
