import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		double soma = 0, div = 0, mult = 0, sub = 0, x, y;
		int op;
		
		//Calculadora

		Scanner sc = new Scanner(System.in);

		System.out.println("Programa de Calculos");
		System.out.println();
		System.out.print("Digite o primeiro valor:  ");
		x = sc.nextDouble();
		System.out.print("Digite o segundo valor:  ");
		y = sc.nextDouble();

		System.out.println(" Digite [1] para a Soma");
		System.out.println(" Digite [2] para a Subtra��o");
		System.out.println(" Digite [3] para a Multipli��o");
		System.out.println(" Digite [4] para a Divis�o");
		op = sc.nextInt();

		switch (op) {
		case 1:
			System.out.print("O valor da soma ser� de " +(x + y) + " pontos.");
			break;
		case 2:
			System.out.print("O valor da subtracao ser� de " + (x - y) + " pontos.");
			break;
		case 3:
			System.out.print("O valor da multiplica��o ser� de " + (x * y) + " pontos.");
			break;
		case 4:
			System.out.print("O valor da divis�o ser� de " + (x / y) + " pontos.");
			break;
			default:
			System.out.println("Opera��o Inv�lida");
		}
	}

}