import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 07 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1143.java
		 * Fazer um programa para ler um n�mero inteiro positivo N. O programa deve
		 * ent�o mostrar na tela N linhas, come�ando de 1 at� N. Para cada linha,
		 * mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo. Exemplo: Entrada: Sa�da: 5 1 1 1 2 4 8 3 9 27 4 16 64 5 25 125
		 */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n,i,v,v1;
		v=0;
		v1=0;
		System.out.print("Digite o valor: ");
			n=sc.nextInt();
		for(i=1;i<=n;i++) {
			System.out.print(i+" ");
			v=i*i;
			System.out.print(v+" ");
			v1=v*i;
			System.out.println(v1+" ");
		}
		sc.close();
		
}
}