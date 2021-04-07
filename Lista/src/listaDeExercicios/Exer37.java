package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		/*
		 * 37) Uma empresa precisa reajustar o salário dos seus funcionários, dando um
		 * aumento de acordo com alguns fatores. Faça um programa que leia o salário
		 * atual, o gênero do funcionário e há quantos anos esse funcionário trabalha na
		 * empresa. No final, mostre o seu novo salário, baseado na tabela a seguir: -
		 * Mulheres - menos de 15 anos de empresa: +5% - de 15 até 20 anos de empresa:
		 * +12% - mais de 20 anos de empresa: +23% - Homens - menos de 20 anos de
		 * empresa: +3% - de 20 até 30 anos de empresa: +13% - mais de 30 anos de
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
		System.out.print("Digite o Salário: ");
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
		
		System.out.println("Olá "+name+" seu novo salário será de R$"+taxS);
		
		sc.close();
	}

}
