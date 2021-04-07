package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer43 {

	public static void main(String[] args) {
		/*
		 * 43) Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
		 * marcando os números que forem divisíveis por 4, exatamente como mostrado
		 * abaixo: 30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = 30;
		
		while(n>=1) {
			if(n%4==0) {
			System.out.print("["+n+"] ");
			}else {
				System.out.print(n+" ");
			}
			
			n= n-1;
		}
		
		sc.close();
	}

}
