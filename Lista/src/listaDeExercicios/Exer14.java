package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		/*
		 * 14) A locadora de carros precisa da sua ajuda para cobrar seus servi�os.
		 * Escreva um programa que pergunte a quantidade de Km percorridos por um carro
		 * alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o pre�o
		 * total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double km;
		int dias;
		
		
		System.out.println("Locadora Carro Feliz");
		System.out.println();
		System.out.print("Digite a quantidade de KM percorridos: ");
		km = sc.nextDouble();
		System.out.print("Quantos dia ficar� com o ve�culo: ");
		dias = sc.nextInt();
		
		double totalFinal= (90*dias)+(km*0.20);
		System.out.println("\nVoc� ir� pagar R$ "+totalFinal+" pela loca��o");
		sc.close();
	}

}
