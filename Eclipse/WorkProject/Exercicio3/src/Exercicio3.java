import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * Exercício 03 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 * 
		 * Exemplos: Entrada: Saída: 5 6 7 8 DIFERENCA = -26 Entrada: Saída: 5 6 -7 8
		 */
		Scanner sc = new Scanner(System.in);

		int a, b, c, d, total;

		System.out.println("Escreva quatros valores inteiros para realizar a diferenca ( A*B-C*D )");
		System.out.print("A: ");
		a = sc.nextInt();
		System.out.print("B: ");
		b = sc.nextInt();
		System.out.print("C: ");
		c = sc.nextInt();
		System.out.print("D: ");
		d = sc.nextInt();
		
		total = (a*b)-(c*d);
		System.out.println(" O valor total da diferença "+total);
		
		sc.close();
	}

}
