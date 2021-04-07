import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Exercício 06 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,area,trap,quad,ret,cir;
		
		System.out.println("Calculando um Triangulo");
		System.out.println();
		System.out.print("Digite o valor de A : ");
		a = sc.nextDouble();
		System.out.print("Digite o valor de B : ");
		b = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = sc.nextDouble();
		
		area = (a*c)/2;
		cir = (Math.pow(c,2.0))*3.14159;
		trap = ((a+b)*c)/2;
		quad = Math.pow(b, 4.0);
		ret = a*b;
		
		System.out.println();
		System.out.println("A area do triângulo: "+area);
		System.out.println("O circulo do triangulo "+cir);
		System.out.println("O trapézio é igual a "+trap);
		System.out.println("O quadrado é igual a "+quad);
		System.out.println("O retângulo é igual a "+ret);
		sc.close();
	}

}
