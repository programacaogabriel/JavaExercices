import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 02 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo ser� encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situa��o sem escrever mensagem
		 * alguma). Exemplo: Entrada: Sa�da: 2 2 3 -2 -8 -1 -7 1 0 2 primeiro quarto
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
					System.out.println("3� Quadrante");
					
				}else if(x<0 && y>0) {
					System.out.println("2� Quadrante");
				}else if(x>0 && y>0) {
					System.out.println("1� Quadrante");
				}else {
					System.out.println("4� Quadrante");
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
