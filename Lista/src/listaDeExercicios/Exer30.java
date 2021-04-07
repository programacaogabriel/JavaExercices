package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		/*30) [DESAFIO] Refa�a o algoritmo 25, acrescentando o recurso de mostrar que tipo
	de tri�ngulo ser� formado:
	 - EQUIL�TERO: todos os lados iguais
	 - IS�SCELES: dois lados iguais
	 - ESCALENO: todos os lados diferentes*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double a,b,c;
		System.out.println("Triangulo");
		System.out.println();
		System.out.println("Digite o 1� valor");
		a=sc.nextDouble();
		System.out.println("Digite o 2� valor");
		b=sc.nextDouble();
		System.out.println("Digite o 3� valor");
		c=sc.nextDouble();
		
		if(a< (b+c) && b<(a+c) && c<(a+b)) {
			System.out.println("Os n�meros forman um triangulo");
		}else {
			System.out.println("Os n�meros n�o forman um triangulo");
		}
		
		if(a==b && b==c && c==a) {
			System.out.println("EQUIL�TERO");
		}else if(a==b || a==c || c==a || c==b)
			System.out.println("IS�SCELES");
		else {
			System.out.println("ESCALENO");
		}
		sc.close();

	}

}
