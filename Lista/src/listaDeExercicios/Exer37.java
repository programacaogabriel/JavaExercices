package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		/*
		 * 37) Uma empresa precisa reajustar o sal�rio dos seus funcion�rios, dando um
		 * aumento de acordo com alguns fatores. Fa�a um programa que leia o sal�rio
		 * atual, o g�nero do funcion�rio e h� quantos anos esse funcion�rio trabalha na
		 * empresa. No final, mostre o seu novo sal�rio, baseado na tabela a seguir: -
		 * Mulheres - menos de 15 anos de empresa: +5% - de 15 at� 20 anos de empresa:
		 * +12% - mais de 20 anos de empresa: +23% - Homens - menos de 20 anos de
		 * empresa: +3% - de 20 at� 30 anos de empresa: +13% - mais de 30 anos de
		 * empresa: +25%
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		char sexo;
		int anos;
		double taxS=0,sala;
		String name;

		System.out.print("Digite se nome: ");
		name = sc.next();
		System.out.print("Digite seu sexo [H] ou [M]: ");
		sexo=sc.next().charAt(0);
		System.out.print("Digite o Sal�rio: ");
		sala=sc.nextDouble();
		System.out.println("Quantos anos na empresa: ");
		anos=sc.nextInt();
		
		if(sexo=='M') {
			if(anos<15) {
				taxS=sala+((sala*5)/100);
			}else if(anos>=15 && anos<=20) {
				taxS=sala+((sala*12)/100);
			}else {
				taxS=sala+((sala*23)/100);
			}
		}
		
		if(sexo=='H') {
			if(anos<20) {
				taxS=sala+((sala*3)/100);
			}else if(anos>=20 && anos<=30) {
				taxS=sala+((sala*13)/100);
			}else {
				taxS=sala+((sala*25)/100);
			}
			
		}
		
		System.out.println("Ol� "+name+" seu novo sal�rio ser� de R$"+taxS);
		
		sc.close();
	}

}
