import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Exercício 01 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 
		 *Exemplos:
Entrada: Saída:
10
30
SOMA = 40
Entrada: Saída:
-30
10
SOMA = -20
Entrada: Saída:
0
0
SOMA = 0
		 *
		 */

		int x, y, s;

		x = 10;
		y = 40;

		s = x = y;
		System.out.println("O valor da soma é " + s);
		System.out.println();

		x = -30;
		y = -10;
		s = -30 - (-10);
		System.out.println("O valor da conta é " + s);
		System.out.println();

		x = 40;
		y = 40;
		s = x - y;
		System.out.println("O valor da conta é " + s);
		System.out.println();
		
		System.out.println("Digite o valor de x:  ");
		x = sc.nextInt();
		System.out.println("Digite o valor de y:  ");
		y = sc.nextInt();
		s= x+y;
		System.out.println("O valor é igual a: "+s);
	
	sc.close();
	
	}

}
