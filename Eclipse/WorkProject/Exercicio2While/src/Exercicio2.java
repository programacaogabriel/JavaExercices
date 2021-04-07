import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Exercício 02 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma). Exemplo: Entrada: Saída: 2 2 3 -2 -8 -1 -7 1 0 2 primeiro quarto
		 * terceiro segundo
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ponto x e y");
		System.out.print(" x:  ");
		int x = sc.nextInt();
		System.out.print(" y:  ");
		int y = sc.nextInt();

		while (x != 0 || y != 0) {
				if(x<0 && y<0) {
					System.out.println("3º Quadrante");
					
				}else if(x<0 && y>0) {
					System.out.println("2º Quadrante");
				}else if(x>0 && y>0) {
					System.out.println("1º Quadrante");
				}else {
					System.out.println("4º Quadrante");
				}
			System.out.println("Digite novamente: ");
			System.out.print(" x:  ");
			x=sc.nextInt();
			System.out.print(" y:  ");
			y=sc.nextInt();
		}
		
		System.out.println("Sistema encerrado");
	}

}
