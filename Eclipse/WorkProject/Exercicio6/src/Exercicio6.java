import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 06 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java
		 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla
		 * precis�o: A, B e C. Em seguida, calcule e mostre: a) a �rea do tri�ngulo
		 * ret�ngulo que tem A por base e C por altura. b) a �rea do c�rculo de raio C.
		 * (pi = 3.14159) c) a �rea do trap�zio que tem A e B por bases e C por altura.
		 * d) a �rea do quadrado que tem lado B. e) a �rea do ret�ngulo que tem lados A
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
		System.out.println("A area do tri�ngulo: "+area);
		System.out.println("O circulo do triangulo "+cir);
		System.out.println("O trap�zio � igual a "+trap);
		System.out.println("O quadrado � igual a "+quad);
		System.out.println("O ret�ngulo � igual a "+ret);
		sc.close();
	}

}
