import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Exercício 03 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente. Exemplos: Entrada: Saída: 6 24 Sao Multiplos
		 * Entrada: Saída: 6 25 Nao sao Multiplos Entrada: Saída: 24 6 Sao Multiplos
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
			System.out.println(" São Multiplos");
		}else {
			System.out.println(" Não São Multiplos");
		}
		sc.close();
	}

}
