package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer16Desafio {

	public static void main(String[] args) {

		/*
		 * 16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de
		 * um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
		 * ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro.
		 * Calcule quantos dias de vida um fumante perderá e exiba o total em dias.
		 */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int cigarros,anos;
		
		System.out.println(" Fumante ");
		System.out.println();
		System.out.println("Quantos cigarros você fuma por dia? ");
		cigarros = sc.nextInt();
		System.out.println("Quantos anos você já fumou? ");
		anos = sc.nextInt();
		
		
		int tempo= ((anos*365)*24)*60;
		int tempo1= (10*cigarros)*365;
		int tempoFinal= tempo-tempo1;
		
		System.out.println("\nVocê fumou "+tempo+" minutos e tem "+tempoFinal+" minutos de vida" );	
		System.out.println("\nVocê perdeu "+(tempo-tempoFinal)+" de minutos de vida.");
		
	sc.close();
	
	}

}
