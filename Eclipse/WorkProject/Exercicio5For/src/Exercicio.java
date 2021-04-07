import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		/*
		 * Exercício 05 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java
		 * 
		 * 
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 * 
		 * 
		 * 
		 * Exemplos: Entrada: Saída: 4 24 Entrada: Saída: 1 1 Entrada: Saída: 5 120
		 * Entrada: Saída: 0 1
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, v, i, z,v1;
		z=1;
		v1=1;
		System.out.print("Digite o valor do número fatorial: ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			 v=z*v1;
			 z=v;
			 v1++;
			/*
			 * 1*2=2 
			 * 2*3=6
			 * 6*4=24
			 */
			System.out.println("O Valor é " + v);

		}
		sc.close();
	}

}
