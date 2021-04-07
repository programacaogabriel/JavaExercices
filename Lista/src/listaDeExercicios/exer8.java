package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class exer8 {

	public static void main(String[] args) {
		/*
		 * 8) Desenvolva um programa que leia uma distância em metros e mostre os
		 * valores relativos em outras medidas. Ex: Digite uma distância em metros:
		 * 185.72 A distância de 85.7m corresponde a: 0.18572Km 1.8572Hm 18.572Dam
		 * 1857.2dm 18572.0cm 185720.0mm
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double km,hm,dam,dm,cm,mm;
		
		
		
		System.out.println("Digite a distância em metro");
		double metros = sc.nextDouble();
		km = metros/1000;
		hm = metros/100;
		dam = metros/10;
		dm = metros/0.1;
		cm = metros/0.01;
		mm = metros/0.001;
		System.out.println();
		System.out.println("Quilometro "+km);
		System.out.println("Hectometro "+hm);
		System.out.println("Decamtro "+dam);
		System.out.println("Decimetro "+dm);
		System.out.println("Centímetro "+cm);
		System.out.println("Milimetros "+mm);
		
		
		sc.close();
		
	}

}
