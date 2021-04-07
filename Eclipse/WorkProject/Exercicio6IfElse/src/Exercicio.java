import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		/*
		 * Exerc�cio 06 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java
		 * Voc� deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		 * (75,100]) este valor se encontra. Obviamente se o valor n�o estiver em nenhum
		 * destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�.
		 * Exemplos: Entrada: Sa�da: 25.01 Intervalo (25,50] Entrada: Sa�da: 25.00
		 * Intervalo [0,25] Entrada: Sa�da: 100.00 Intervalo (75,100] Entrada: Sa�da:
		 * -25.02 Fora de intervalo
		 */
		double valor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema de intervalos");
		System.out.println("Digite o valor:  ");
		valor = sc.nextDouble();
		
		if(valor>0 && valor <=25) {
			System.out.println("O Valor se encontra no Intervalo (0,25]");
		}else if(valor>25 && valor<=50) {
			System.out.println("O Valor se encontra no Intervalo (25,50)");
		}else if(valor>50 &&valor<=75) {
			System.out.println("\"O Valor se encontra no Intervalo (50,75)");
		}else if(valor>75 &&valor<=100) {
			System.out.println("\"O Valor se encontra no Intervalo (50,75)");
		}else {
			System.out.println("Valor fora do Intervalo");
		}
	}

}
