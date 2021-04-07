package listaDeExercicios;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		/*
		 * 2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de
		 * boasvindas para ela: Ex: Qual é o seu nome? João da Silva Olá João da Silva,
		 * é um prazer te conhecer!
		 */
		Scanner sc = new Scanner(System.in);
		String name;

		System.out.println("Qual é o se nome? ");
		name = sc.next();
		System.out.println("Olá "+name+" é um prazer te conhecer!");
		
		sc.close();
	}

}
