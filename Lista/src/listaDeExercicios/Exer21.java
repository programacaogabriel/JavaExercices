package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		/*
		 * 22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a
		 * sua situa��o em rela��o ao alistamento militar. - Se estiver antes dos 18
		 * anos, mostre em quantos anos faltam para o alistamento. - Se j� tiver depois
		 * dos 18 anos, mostre quantos anos j� se passaram do alistamento.
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int idade;

		System.out.println(" Alistamento Militar ");
		System.out.println();
		System.out.print("DIgite a sua idade: ");
		idade = sc.nextInt();

		if (idade > 18) {
			int valor = idade - 18;
			System.out.println("Voc� deve se alistar pois j� fazem "+valor+" anos");
		} else if(idade==18){
			System.out.println("Voc� J� pode se alistar");
		}else {
			System.out.println("Voc� ainda n�o pode se alistar");
		}
	sc.close();
	}

}
