package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		/*
		 * 15) Crie um programa que leia o número de dias trabalhados em um mês e mostre
		 * o salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha
		 * R$25 por hora trabalhada.
		 */

		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double dias;
		
		
		System.out.print("Quantos dia o funcionario trabalhou: ");
		dias = sc.nextDouble();
		
	 double	diasTotal = dias*(8*25);
	 	System.out.println("\nO funcionário receberá "+diasTotal);
	
	sc.close();
	}

}
