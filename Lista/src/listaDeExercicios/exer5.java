package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia as duas notas de um aluno em uma mat�ria e mostre
		 * na tela a sua m�dia na disciplina. Ex: Nota 1: 4.5 Nota 2: 8.5 A m�dia entre
		 * 4.5 e 8.5 � igual a 6.5
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Pegando dados 
		System.out.println("Media alunos");
		System.out.print("Digite a 1� nota: ");
		float nota1 = sc.nextFloat();
		System.out.print("Digite a 2� nota: ");
		float nota2 = sc.nextFloat();
		//M�dia
		float notaFinal = (nota1+nota2)/2;
		
		//Nota Final
		
		System.out.println("\nA m�dia entre "+nota1+" e "+nota2+" � igual a "+notaFinal);
	
	sc.close();
	
	}

}
