package listaDeExercicios;

import java.util.Scanner;

public class Exer53 {

	public static void main(String[] args) {
		/*
		 * 53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no
		 * final: a) Quantos homens foram cadastrados 
		 * b) Quantas mulheres foram
		 * cadastradas 
		 * c) A média de idade do grupo 
		 * d) A média de idade dos homens e)
		 * Quantas mulheres tem mais de 20 anos
		 */
		int valor = 0, homens = 0, mulheres = 0, idMediaG = 0,idMediaM=0, idMediaH = 0;
		char sexo;
		Scanner sc = new Scanner(System.in);

		System.out.println("Contagem de dados");
		System.out.println("Digite sua idade");
		System.out.println("Digite seu sexo H / M");
		while (valor < 5) {
			int id = sc.nextInt();
			sexo = sc.next().charAt(0);
			if (sexo == 'H') {
				homens = homens + 1;
			} else {
				mulheres = mulheres + 1;
			}
			
			if(id>=20 && sexo=='H') {
				idMediaH=idMediaH+id;
			}if(id>=20 && sexo=='M'){
				idMediaM=idMediaM+id;
			}else {
				idMediaG=idMediaG+id;
			}
					valor++;
		}
		
		idMediaH=idMediaH/5;
		idMediaM=idMediaM/5;
		idMediaG=idMediaG/5;
		System.out.println(" Homens: "+homens);
		System.out.println(" Mulheres: "+mulheres);
		System.out.println(" Id Media H: "+idMediaH);
		System.out.println(" Id Media M: "+idMediaM);
		System.out.println(" Id Media Grupo: "+idMediaG);
		sc.close();

	}

}
