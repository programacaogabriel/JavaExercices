package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		/*
		 * 13) Fa�a um algoritmo que leia o sal�rio de um funcion�rio, calcule e mostre
		 * o seu novo sal�rio, com 15% de aumento.
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		double salario;
		int tax;
		String nome;
		System.out.println("Aumento de sal�rios");
		System.out.println();
		System.out.print("Digite o nome do funcion�rio:  ");
		nome=sc.nextLine();
		System.out.print("Digite o sal�rio atual: R$: ");
		salario=sc.nextDouble();
		System.out.print("Digite a taxa de aumento: ");
		tax=sc.nextInt();
		
		double salarioFinal= salario+((salario*tax)/100);
		
		System.out.println("\nO aumento de salario do funcion�rio "+nome+" foi de R$"+salarioFinal);
		
	sc.close();
	}

}
