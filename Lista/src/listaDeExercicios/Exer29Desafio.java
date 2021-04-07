package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer29Desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*
		 * 29) Desenvolva um programa que leia o nome de um funcion�rio, seu sal�rio,
		 * quantos anos ele trabalha na empresa e mostre seu novo sal�rio, reajustado de
		 * acordo com a tabela a seguir: - At� 3 anos de empresa: aumento de 3% - entre
		 * 3 e 10 anos: aumento de 12.5% - 10 anos ou mais: aumento de 20%
		 */
		String nome;
		double salario, valorFinal;
		int anos;
		System.out.println("Aumento de sal�rio");
		System.out.println();
		System.out.print("Digite o nome do funcion�rio: ");
		nome = sc.next();
		System.out.print("Digite o sal�rio: ");
		salario = sc.nextDouble();
		System.out.print("Anos de trabalho: ");
		anos = sc.nextInt();

		if (anos <= 3) {
			valorFinal = salario + (salario * 3 / 100);
			System.out.println("O funcion�rio " + nome + " receber� um aumento de 3% R$" + valorFinal);
		}else if(anos >=3 && anos <=10) {
			valorFinal = salario + (salario * 12.5 / 100);
			System.out.println("O funcion�rio " + nome + " receber� um aumento de 12.5 R$" + valorFinal);
		}else {
			valorFinal = salario + (salario * 20 / 100);
			System.out.println("O funcion�rio " + nome + " receber� um aumento de 20% R$" + valorFinal);
		}
	
		sc.close();	
	}

}
