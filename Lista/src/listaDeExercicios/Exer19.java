package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		/*
		 * 19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a
		 * sua média e mostre na tela. No final, analise a média e mostre se o aluno
		 * teve ou não um bom aproveitamento (se ficou acima da média 7.0).
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		float n1,n2,nFinal;
		
		
		System.out.println("M e d i a");
		System.out.println();
		System.out.println("Digite as 2 notas para realizar a média");
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		nFinal=(n1+n2)/2;
		System.out.println("\n A media final foi de "+nFinal);
		
		sc.close();
	}

}
