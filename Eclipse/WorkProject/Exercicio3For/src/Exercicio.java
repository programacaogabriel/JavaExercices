import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		/*
		 * Exercício 03 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1079.java
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5. Exemplo: Entrada: Saída: 3 6.5 4.3 6.2 5.1 4.2
		 * 8.1 8.0 9.0 10.0 5.7 6.3 9.3
		 */
		Scanner sc = new Scanner(System.in);
		int i, x;
		float a,b,c,v1;
		
		Locale.setDefault(Locale.US);
		System.out.print("Digite o valor das repetições:  ");
		x = sc.nextInt();
		
		System.out.println("Digite os 3 valores reais");
		for(i=1;i<=x;i++) {
			System.out.println(i+" sequencia de valor: ");
			a=sc.nextFloat();
			b=sc.nextFloat();
			c=sc.nextFloat();
			v1= (a/2)+(b/3)+(c/5);
			System.out.printf("O valor da média real %.2f",v1);
			
		}
	}

}
