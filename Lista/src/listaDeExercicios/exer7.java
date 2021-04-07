package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class exer7 {

	public static void main(String[] args) {
		/*
		 * 7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
		 * sua terça parte. Ex: Digite um número: 3.5 O dobro de 3.5 é 7.0 A terça parte
		 * de 3.5 é 1.16666
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o valor para revelarmos o dobro e a terceira parte: ");
		double valor = sc.nextDouble();
		
		double dobro = valor*2;
		double terceira = valor/3;
		
		System.out.printf("\nO dobro é igual a %.3f",dobro);
		System.out.printf("\nA terceira parte é igual a %.3f",terceira);
		
		sc.close();
				
	}

}
