package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer45 {

	public static void main(String[] args) {
		/*
		 * 45) O programa acima vai ter um problema quando digitarmos o primeiro valor
		 * maior que o último. Resolva esse problema com um código que funcione em
		 * qualquer situação.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int valor, valorFinal, incremento;

		System.out.print("Digite o Primeiro valor: ");
		valor = sc.nextInt();
		System.out.print("Digite o valor do Incremento: ");
		incremento = sc.nextInt();
		System.out.print("Digite o valor Final: ");
		valorFinal = sc.nextInt();

		while (valorFinal < valor) {
			System.out.println("Valores errados");
			System.out.println();
			System.out.print("Digite o Primeiro valor: ");
			valor = sc.nextInt();
			System.out.print("Digite o valor Final: ");
			valorFinal = sc.nextInt();
		}
			System.out.println("");
			while (valor <= valorFinal) {
				System.out.print(valor + " ");
				valor = valor + incremento;
			}
			System.out.print("Acabou! ");
			
		
	
		sc.close();
	}

}
