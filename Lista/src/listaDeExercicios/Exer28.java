package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		/*
		 * 28) Fa�a um programa que leia a largura e o comprimento de um terreno
		 * retangular, calculando e mostrando a sua �rea em m�. O programa tamb�m
		 * devemostrar a classifica��o desse terreno, de acordo com a lista abaixo: -
		 * Abaixo de 100m� = TERRENO POPULAR - Entre 100m� e 500m� = TERRENO MASTER -
		 * Acima de 500m� = TERRENO VIP
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
