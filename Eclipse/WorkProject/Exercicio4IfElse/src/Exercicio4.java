import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 04 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do
		 * jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo
		 * uma dura��o m�nima de 1 hora e m�xima de 24 horas. Exemplos: Entrada: Sa�da:
		 * 16 2 O JOGO DUROU 10 HORA(S) Entrada: Sa�da: 0 0 O JOGO DUROU 24 HORA(S)
		 * Entrada: Sa�da: 2 16 O JOGO DUROU 14 HORA(S)
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema de horas de Games");

		int a, b, r1;
		System.out.print("Digite a hora que voc� iniciou o Game: ");
		a = sc.nextInt();
		System.out.print("Digite a hora que voc� encerrou o Game: ");
		b = sc.nextInt();
		if (a < b) {
			r1 = (b - a);
		} else {
			r1 = 24 - (b + a);
		}
		
		System.out.print("A dura��o do Game "+r1);
		
		sc.close();
	}

}
