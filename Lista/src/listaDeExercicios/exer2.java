package listaDeExercicios;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		/*
		 * 2) Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de
		 * boasvindas para ela: Ex: Qual � o seu nome? Jo�o da Silva Ol� Jo�o da Silva,
		 * � um prazer te conhecer!
		 */
		Scanner sc = new Scanner(System.in);
		String name;

		System.out.println("Qual � o se nome? ");
		name = sc.next();
		System.out.println("Ol� "+name+" � um prazer te conhecer!");
		
		sc.close();
	}

}
