package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		/*
		 * 24) Fa�a um algoritmo que pergunte a dist�ncia que um passageiro deseja
		 * percorrer em Km. Calcule o pre�o da passagem, cobrando R$0.50 por Km para
		 * viagens at� 200Km e R$0.45 para viagens mais longas.
		 */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double km;
		double valorFinal=0;
		
		
		System.out.println("Viagem Seu JOJO");
		System.out.println();
		System.out.print("Quantos KM voc� deseja percorrer: ");
		km = sc.nextDouble();
		
		if(km<=200) {
			valorFinal=km*0.50;
			System.out.println("Sua viagem custar� R$ "+valorFinal);			
		}else {
			valorFinal=km*0.40;
			System.out.println("Sua viagem custar� R$ "+valorFinal);
		}
		sc.close();

	}

}
