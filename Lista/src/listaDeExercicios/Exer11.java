package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		/*
		 * 11) Desenvolva uma l�gica que leia os valores de A, B e C de uma equa��o do
		 * segundo grau e mostre o valor de Delta.
		 y = b2-4*a*c*/

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int a,b,c;
		System.out.println("Equa��o de segundo grau");
		System.out.println("Digite os valores de  A , B , C");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int delta= (int) (Math.pow(b, 2)-4*a*c);
		System.out.println("\n O valor � de "+delta);
		
		sc.close();

	}

}
