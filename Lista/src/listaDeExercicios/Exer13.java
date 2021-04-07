package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		/*
		 * 13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre
		 * o seu novo salário, com 15% de aumento.
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		double salario;
		int tax;
		String nome;
		System.out.println("Aumento de salários");
		System.out.println();
		System.out.print("Digite o nome do funcionário:  ");
		nome=sc.nextLine();
		System.out.print("Digite o salário atual: R$: ");
		salario=sc.nextDouble();
		System.out.print("Digite a taxa de aumento: ");
		tax=sc.nextInt();
		
		double salarioFinal= salario+((salario*tax)/100);
		
		System.out.println("\nO aumento de salario do funcionário "+nome+" foi de R$"+salarioFinal);
		
	sc.close();
	}

}
