package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer46 {

	public static void main(String[] args) {
		/*46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
	8 + 10 + 12 + 14 + ... + 98 + 100.*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int valor = 6, valorFinal = 0;
		
		while(valor<100) {
			System.out.print(valor+" ");
			valor=valor+2;
			valorFinal=valorFinal+valor;
			
		}
		System.out.println();
		System.out.println("Soma dos números "+ valorFinal);
		
		sc.close();

	}

}
