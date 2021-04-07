import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op;

		System.out.println("Sistema de dias");
		System.out.print("Qual dia da Semana você estaria disponível: ");
		System.out.println();
		System.out.println(" [1] - Para segunda-feira");
		System.out.println(" [2] - Para Terça-feira");
		System.out.println(" [3] - Para Quarta-feira");
		System.out.println(" [4] - Para Quinta-feira");
		System.out.println(" [5] - Para Sexta-feira");
		System.out.println(" [6] - Para Sábado");
		System.out.print(" Digite aqui:  ");
		op = sc.nextInt();

		switch (op) {
		case 1:
			System.out.println(" Você irá trabalhar na Segunda-feira");
			break;
		case 2:
			System.out.println(" Você irá trabalhar na Terça-feira");
			break;
		case 3:
			System.out.println(" Você irá trabalhar na Quarta-feira");
			break;
		case 4:
			System.out.println(" Você irá trabalhar na Quinta-feira");
			break;
		case 5:
			System.out.println(" Você irá trabalhar na Sexta-feira");
			break;
		case 6:
			System.out.println(" Você irá trabalhar no Sábado");
		default:
			System.out.println(" Dados Inválidos ");
			break;

		}

		double bonus = (op > 5) ? 500 : 150;
		System.out.printf(" Irá receber um bonus de R$ %.2f", bonus);

	}

}
