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
		System.out.println(" Digite [2] para a Subtração");
		System.out.println(" Digite [3] para a Multiplição");
		System.out.println(" Digite [4] para a Divisão");
		op = sc.nextInt();

		switch (op) {
		case 1:
			System.out.print("O valor da soma será de " +(x + y) + " pontos.");
			break;
		case 2:
			System.out.print("O valor da subtracao será de " + (x - y) + " pontos.");
			break;
		case 3:
			System.out.print("O valor da multiplicação será de " + (x * y) + " pontos.");
			break;
		case 4:
			System.out.print("O valor da divisão será de " + (x / y) + " pontos.");
			break;
			default:
			System.out.println("Operação Inválida");
		}
	}

}