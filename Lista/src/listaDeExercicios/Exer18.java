package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		/*18) Fa�a um programa que leia o ano de nascimento de uma pessoa, calcule a idade
		dela e depois mostre se ela pode ou n�o votar.*/
		
		int ano;
		
		System.out.println("  Idade  ");
		System.out.print("Digite o ano de nascimento: ");
		ano = sc.nextInt();
		
		
		if (2020-ano>=16) {
			System.out.println(" Voc� J� pode votar!");
		}else {
			System.out.println("Voc� ainda n�o poder� votar");
		}
	
		sc.close();
	}

}
