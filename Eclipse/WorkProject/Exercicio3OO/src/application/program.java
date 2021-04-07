package application;

import java.util.Locale;
import java.util.Scanner;

import entities.notas;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		notas media = new notas();
		
		System.out.println("Média de Provas");
		System.out.println();
		System.out.print("Digite o nome do aluno:  ");
		media.name = sc.next();
		System.out.print("Digite a nota da prova:  ");
		media.n1 = sc.nextDouble();
		System.out.print("Digite a nota do primeiro trabalho:  ");
		media.n2 = sc.nextDouble();
		System.out.print("Digite a nota do segundo trabalho:  ");
		media.n3 = sc.nextDouble();

		System.out.println(media);

		if (media.media() < 60.00) {
			System.out.println("Reprovado");
			System.out.println("O Estudante precisa tirar "+media.mediaF()+" para chegar a média.");
		}else {
			System.out.println("Aprovado");
		}

		sc.close();
	}

}
