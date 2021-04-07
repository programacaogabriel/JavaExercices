package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/*38) Escreva um programa que mostre na tela a seguinte contagem:
			6 7 8 9 10 11 Acabou!*/
		
		int num=6;
		
		while(num <=11) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println("ACABOU!");
		
		sc.close();
	}
	

}
