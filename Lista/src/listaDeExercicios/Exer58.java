package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer58 {

	public static void main(String[] args) {
		/*
		 * 58) Fa�a um algoritmo que leia a idade de v�rios alunos de uma turma. O
		 * programa vai parar quando for digitada a idade 999. No final, mostre quantos
		 * alunos existem na turma e qual � a m�dia de idade do grupo
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int alunosTurma=0,valor=0, idade=0;
		double mediaIdadeGrupo;
		
		System.out.println("Idade Turma");
		do {
			idade=idade+valor;
			System.out.print("Digite a idade:  ");
			valor=sc.nextInt();
			if(valor!=999) {
				alunosTurma++;
			}
			
		}while(valor!=999);
		
		mediaIdadeGrupo=idade/alunosTurma;
		System.out.println("Idade M�dia: "+mediaIdadeGrupo);
		System.out.print("Numero de alunos:  "+alunosTurma);
		
		sc.close();
	}

}
