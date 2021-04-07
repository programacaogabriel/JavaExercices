package application;

import java.util.Locale;
import java.util.Scanner;

import files.Notas;

public class Programa02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Notas notas = new Notas();
		
		System.out.println("Media Do Aluno");
		System.out.println();
		System.out.print("Insira o nome: ");
		notas.name=sc.next();
		System.out.print("Nota 1: ");
		notas.nota1=sc.nextDouble();
		System.out.print("Nota 2: ");
		notas.nota2=sc.nextDouble();
		System.out.print("Nota 3: ");
		notas.nota3=sc.nextDouble();
		System.out.println();
		System.out.printf("Media: %.2f",notas.media());
		System.out.println();
		System.out.println(notas);
		
		if (notas.media()<6) {
			System.out.println("Recuperação");
			System.out.println("Falta "+notas.passou());
		}else {
			System.out.println("Passou");
		}
		
		sc.close();
	}

}
