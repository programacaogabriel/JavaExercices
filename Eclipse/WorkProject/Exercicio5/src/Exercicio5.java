import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 05 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
		 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
		 * valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
		 * o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		 * Exemplos: Entrada: Sa�da: 12 1 5.30 16 2 5.10 VALOR A PAGAR: R$ 15.50
		 * Entrada: Sa�da: 13 2 15.30 161 4 5.20 VALOR A PAGAR: R$ 51.40 Entrada: Sa�da:
		 * 1 1 15.10 2 1 15.10 VALOR A PAGAR: R$ 30.20
		 */
		
		int cod,qdc;
		double valor, total,total1,totalF;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Soma Final de Valores de Compras");
		System.out.print("Escreva o C�digo da 1� pe�a:  ");
		cod = sc.nextInt();
		System.out.print("Escreva a quantidade de pe�as:  ");
		qdc = sc.nextInt();
		System.out.print("Escreva o valor de cadas pe�a:R$ ");
		valor = sc.nextDouble();
		total = qdc*valor;
		System.out.print("Escreva o C�digo da 2� pe�a:  ");
		cod = sc.nextInt();
		System.out.print("Escreva a quantidade de pe�as:  ");
		qdc = sc.nextInt();
		System.out.print("Escreva o valor de cadas pe�a:R$ ");
		valor = sc.nextDouble();
		total1 = qdc*valor;
		totalF = total+total1;
		System.out.println();
		System.out.printf("Valor a pagar R$%.2f", totalF);
		sc.close();
	}

}
