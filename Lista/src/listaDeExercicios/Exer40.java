package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer40 {

	public static void main(String[] args) {
		/*40) Crie um aplicativo que mostre na tela a seguinte contagem:
			0 3 6 9 12 15 18 Acabou!*/
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = 0;
		while(n<=18) {
			System.out.print(n+" ");
			n=n+3;
		}
		System.out.print("Acabou!");
		
		sc.close();
	}

}
