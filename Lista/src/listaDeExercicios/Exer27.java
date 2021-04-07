package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		/*
		 * 27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
		 * mostrando uma mensagem no final, de acordo com a média atingida: - Média até
		 * 4.9: REPROVADO - Média entre 5.0 e 6.9: RECUPERAÇÃO - Média 7.0 ou superior:
		 * APROVADO
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		float n1,n2,mediaFinal;
		
		System.out.println("Média notas");
		System.out.println();
		System.out.println("Digite a nota da prova e a nota do trabalho");
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		mediaFinal=(n1+n2)/2;
		if(mediaFinal<=4.9) {
			System.out.println("Aluno reprovado");
		}else if(mediaFinal >=5.0 && mediaFinal<=6.9) {
			System.out.println("Aluno em recuperação");
		}else {
			System.out.println("Aluno aprovado");
		}
		
		sc.close();
	}

}
