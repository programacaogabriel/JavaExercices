package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		/*
		 * 6) Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e
		 * seu sucessor. Ex: Digite um n�mero: 9 O antecessor de 9 � 8 O sucessor de 9 �
		 * 10
		 */
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Entre com qualquer valor");
		int valor =sc.nextInt();
		System.out.println("\nO antecessor de "+valor+" � "+(valor-1)+" o sucessor � o numero "+(valor+1)); 
		
		sc.close();
	
	}

}
