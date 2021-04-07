import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 03 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
		 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
		 * crescente ou decrescente. Exemplos: Entrada: Sa�da: 6 24 Sao Multiplos
		 * Entrada: Sa�da: 6 25 Nao sao Multiplos Entrada: Sa�da: 24 6 Sao Multiplos
		 */
		
		Scanner sc = new Scanner(System.in);
		
		float x,y;
		x=0;
		y=0;
		System.out.println("Sistema de multiplos");
		System.out.println();
		System.out.print("Digite o primeiro valor:  ");
		x=sc.nextInt();
		System.out.print("Digite o segundo valor:  ");
		y=sc.nextInt();
		
		if(x%y==0 || y%x==0) {
			System.out.println(" S�o Multiplos");
		}else {
			System.out.println(" N�o S�o Multiplos");
		}
		sc.close();
	}

}
