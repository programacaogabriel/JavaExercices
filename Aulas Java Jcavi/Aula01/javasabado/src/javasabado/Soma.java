package javasabado;

import java.util.Scanner;

/**
 * 
 * @author Administrador
 *
 */
public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorSoma1, valorSoma2, resultado;

		System.out.println("Programa de Soma");
		System.out.println("Digite o Primeiro valor");
		valorSoma1 = sc.nextInt();
		System.out.println("Digite o Segundo valor");
		valorSoma2 = sc.nextInt();

		resultado = valorSoma1 + valorSoma2;

		final int VALORMAXIMO = 30; //CONSTANTE SEMPRE SERÁ ESTE VALOR

		System.out.println();
		System.out.println("O valor da soma dos numeros é igual a " + resultado);
		System.out.println("O valor da constante é "+VALORMAXIMO);
		System.out.println("O valor da soma com o valor maximo " + (resultado+VALORMAXIMO));

		
		sc.close();
	}

}
