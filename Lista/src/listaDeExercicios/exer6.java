package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		/*
		 * 6) Faça um programa que leia um número inteiro e mostre o seu antecessor e
		 * seu sucessor. Ex: Digite um número: 9 O antecessor de 9 é 8 O sucessor de 9 é
		 * 10
		 */
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Entre com qualquer valor");
		int valor =sc.nextInt();
		System.out.println("\nO antecessor de "+valor+" é "+(valor-1)+" o sucessor é o numero "+(valor+1)); 
		
		sc.close();
	
	}

}
