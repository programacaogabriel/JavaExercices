package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class exer9 {

	public static void main(String[] args) {
		/*
		 * 9) Fa�a um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em
		 * R$) e mostre quantos d�lares ela pode comprar. Considere US$1,00 = R$3,45.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Valor em d�lares: ");
		System.out.print("Escreva quanto reais voc� possui R$");
		double valor = sc.nextDouble();
		double valorFinal= valor/4.58;
		
		System.out.printf("\nO Valor em dollares em sua carteira � de %.3f",valorFinal);
		sc.close();
	}

}
