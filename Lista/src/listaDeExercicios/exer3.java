package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		/*
		 * 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando
		 * no final uma mensagem. Ex: Nome do Funcionário: Maria do Carmo Salário:
		 * 1850,45 O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println(" Empreja Javali Cansado ");
		System.out.println();
		System.out.print("Digte o nome do funcionárioa: ");
		String name = sc.next();
		System.out.print("Digite o seu salário: ");
		double salario = sc.nextDouble();
		System.out.print("Digite o mês: ");
		int valor = sc.nextInt();

		String mes = "Janeiro";
		switch (valor) {
		case 1:
			mes = "Janeiro";
			break;
		case 2:
			mes = "Fevereiro";
			break;
		case 3:
			mes = "Março";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Maio";
			break;
		case 6:
			mes = "Junho";
			break;
		case 7:
			mes = "Julho";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Setembro";
			break;
		case 10:
			mes = "Outubro";
			break;
		case 11:
			mes = "Novembro";
		case 12:
			mes = "Dezembro";
			break;
		default:
			System.out.println("Mês inexistente");
			break;
		}

		System.out.println();
		System.out.println("Seguintes dados do Funcionario");
		System.out.println(name);
		System.out.printf("R$%.3f\n", salario);
		System.out.println(mes);

		sc.close();

	}

}
