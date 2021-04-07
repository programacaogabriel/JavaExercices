package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*39) Faça um algoritmo que mostre na tela a seguinte contagem:
			10 9 8 7 6 5 4 3 Acabou!*/
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n =10;
		while(n>=3) {
			System.out.print(n+" ");
			n--;
		}
		System.out.println("Acabou!");
	sc.close();
	}
	

}
