package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
		 * na tela a sua média na disciplina. Ex: Nota 1: 4.5 Nota 2: 8.5 A média entre
		 * 4.5 e 8.5 é igual a 6.5
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Pegando dados 
		System.out.println("Media alunos");
		System.out.print("Digite a 1º nota: ");
		float nota1 = sc.nextFloat();
		System.out.print("Digite a 2º nota: ");
		float nota2 = sc.nextFloat();
		//Média
		float notaFinal = (nota1+nota2)/2;
		
		//Nota Final
		
		System.out.println("\nA média entre "+nota1+" e "+nota2+" é igual a "+notaFinal);
	
	sc.close();
	
	}

}
