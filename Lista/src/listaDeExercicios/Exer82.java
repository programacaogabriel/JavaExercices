package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer82 {

	public static void main(String[] args) {
		/*
		 * 82) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as
		 * em um vetor. No final, mostre: a) Qual é a média da turma b) Quantos alunos
		 * estão acima da média da turma c) Qual foi a maior nota digitada d) Em que
		 * posições a maior nota aparece
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int i, v = 10, v1 = 10, v2 = 10, alunosAcimaMedia = 0;
		double mediaTurma = 0.0, nota = 0.0, posicoesMaior = 0.0;
		String name,name1="X";

		String vet[] = new String[v];
		double vet1[] = new double[v1];
		double vet2[] = new double[v2];
		for (i = 0; i < 10; i++) {
			System.out.print("Digite o nome do " + i + " aluno: ");
			vet[i] = name = sc.next();
			System.out.print("Digite a nota:  ");
			vet1[i] = nota = sc.nextDouble();
			System.out.println();
			mediaTurma = mediaTurma + nota;
			
			if (vet1[i] > posicoesMaior) {
				posicoesMaior=vet1[i];
				vet2[i] = i;
				name1=vet[i];
			}
		}

		mediaTurma = mediaTurma / 10;

		for (i = 0; i < 10; i++) {
			if (vet1[i] > mediaTurma) {
				alunosAcimaMedia = alunosAcimaMedia + 1;
			}
		}
		System.out.printf("A média da turma %.2f\n", mediaTurma);
		System.out.println("Quantos alunos estão acima da média da turma: " + alunosAcimaMedia);
		System.out.println("A maior nota digitada: "+posicoesMaior+" pertence ao "+name1);
		System.out.print("Em que posições a maior nota aparece: ");
		for(i=0;i<10;i++) {
			if(vet2[i]!=0) {
				System.out.print(vet2[i]+"º");
			}
		}
		

		sc.close();

	}

}
