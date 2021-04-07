package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		/*
		 * 28) Faça um programa que leia a largura e o comprimento de um terreno
		 * retangular, calculando e mostrando a sua área em m². O programa também
		 * devemostrar a classificação desse terreno, de acordo com a lista abaixo: -
		 * Abaixo de 100m² = TERRENO POPULAR - Entre 100m² e 500m² = TERRENO MASTER -
		 * Acima de 500m² = TERRENO VIP
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double largura,comprimento;
		System.out.println("Seu terreno");
		System.out.println();
		System.out.println("Digite a largura e comprimento do terreno");
		largura=sc.nextDouble();
		comprimento=sc.nextDouble();
		double total=largura*comprimento;
		
		if(total<100) {
			System.out.println("Terreno popular");
		}else if(total>100 && total<500) {
			System.out.println("Terreno Master");
		}else {
			System.out.println("Terreno Vip");
		}
		
		sc.close();
		sc.close();
	}

}
