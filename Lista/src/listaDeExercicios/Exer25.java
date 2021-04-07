package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		/*
		 * 25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
		 * Analise seus comprimentos e diga se é possível formar um triângulo com essas
		 * retas. Matematicamente, para três segmentos formarem um triângulo, o
		 * comprimento de cada lado deve ser menor que a soma dos outros dois.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double a,b,c;
		System.out.println("Triangulo");
		System.out.println();
		System.out.println("Digite o 1º valor");
		a=sc.nextDouble();
		System.out.println("Digite o 2º valor");
		b=sc.nextDouble();
		System.out.println("Digite o 3º valor");
		c=sc.nextDouble();
		
		if(a< (b+c) && b<(a+c) && c<(a+b)) {
			System.out.println("Os números forman um triangulo");
		}else {
			System.out.println("Os números não forman um triangulo");
		}
		sc.close();
	}

}
