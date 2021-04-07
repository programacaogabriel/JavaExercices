import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 05 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java
		 * 
		 * 
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por defini��o, fatorial
		 * de 0 � 1.
		 * 
		 * 
		 * 
		 * Exemplos: Entrada: Sa�da: 4 24 Entrada: Sa�da: 1 1 Entrada: Sa�da: 5 120
		 * Entrada: Sa�da: 0 1
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, v, i, z,v1;
		z=1;
		v1=1;
		System.out.print("Digite o valor do n�mero fatorial: ");
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
			System.out.println("O Valor � " + v);

		}
		sc.close();
	}

}
