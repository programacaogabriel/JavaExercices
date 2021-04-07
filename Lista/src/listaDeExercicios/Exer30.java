package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		/*30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
	de triângulo será formado:
	 - EQUILÁTERO: todos os lados iguais
	 - ISÓSCELES: dois lados iguais
	 - ESCALENO: todos os lados diferentes*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double a,b,c;
		System.out.println("Triangulo");
		System.out.println();
		System.out.println("Digite o 1º valor");
		a=sc.nextDouble();
		System.out.println("Digite o 2º valor");
		b=sc.nextDouble();
		System.out.println("Digite o 3º valor");
		c=sc.nextDouble();
		
		if(a< (b+c) && b<(a+c) && c<(a+b)) {
			System.out.println("Os números forman um triangulo");
		}else {
			System.out.println("Os números não forman um triangulo");
		}
		
		if(a==b && b==c && c==a) {
			System.out.println("EQUILÁTERO");
		}else if(a==b || a==c || c==a || c==b)
			System.out.println("ISÓSCELES");
		else {
			System.out.println("ESCALENO");
		}
		sc.close();

	}

}
