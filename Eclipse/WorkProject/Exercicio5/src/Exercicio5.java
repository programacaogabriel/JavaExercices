import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Exercício 05 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 * Exemplos: Entrada: Saída: 12 1 5.30 16 2 5.10 VALOR A PAGAR: R$ 15.50
		 * Entrada: Saída: 13 2 15.30 161 4 5.20 VALOR A PAGAR: R$ 51.40 Entrada: Saída:
		 * 1 1 15.10 2 1 15.10 VALOR A PAGAR: R$ 30.20
		 */
		
		int cod,qdc;
		double valor, total,total1,totalF;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Soma Final de Valores de Compras");
		System.out.print("Escreva o Código da 1º peça:  ");
		cod = sc.nextInt();
		System.out.print("Escreva a quantidade de peças:  ");
		qdc = sc.nextInt();
		System.out.print("Escreva o valor de cadas peça:R$ ");
		valor = sc.nextDouble();
		total = qdc*valor;
		System.out.print("Escreva o Código da 2º peça:  ");
		cod = sc.nextInt();
		System.out.print("Escreva a quantidade de peças:  ");
		qdc = sc.nextInt();
		System.out.print("Escreva o valor de cadas peça:R$ ");
		valor = sc.nextDouble();
		total1 = qdc*valor;
		totalF = total+total1;
		System.out.println();
		System.out.printf("Valor a pagar R$%.2f", totalF);
		sc.close();
	}

}
