import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Exerc�cio 01 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
		 * Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses n�meros com uma mensagem explicativa, conforme exemplos.
		 
		 *Exemplos:
Entrada: Sa�da:
10
30
SOMA = 40
Entrada: Sa�da:
-30
10
SOMA = -20
Entrada: Sa�da:
0
0
SOMA = 0
		 *
		 */

		int x, y, s;

		x = 10;
		y = 40;

		s = x = y;
		System.out.println("O valor da soma � " + s);
		System.out.println();

		x = -30;
		y = -10;
		s = -30 - (-10);
		System.out.println("O valor da conta � " + s);
		System.out.println();

		x = 40;
		y = 40;
		s = x - y;
		System.out.println("O valor da conta � " + s);
		System.out.println();
		
		System.out.println("Digite o valor de x:  ");
		x = sc.nextInt();
		System.out.println("Digite o valor de y:  ");
		y = sc.nextInt();
		s= x+y;
		System.out.println("O valor � igual a: "+s);
	
	sc.close();
	
	}

}
