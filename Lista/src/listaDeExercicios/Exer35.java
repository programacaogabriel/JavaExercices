package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		/*
		 * 35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
		 * aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia
		 * para carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um
		 * programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de
		 * aluguel e quantos Km foram percorridos. No final mostre o preço a ser pago de
		 * acordo com a tabela a seguir: - Carros populares (aluguel de R$90 por dia) -
		 * Até 100Km percorridos: R$0,20 por Km - Acima de 100Km percorridos: R$0,10 por
		 * Km - Carros de luxo (aluguel de R$150 por dia) - Até 200Km percorridos:
		 * R$0,30 por Km - Acima de 200Km percorridos: R$0,25 por Km
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int car, days;
		double km;
		double valorEmprestimo=0, valorKm=0;
		
		
		System.out.println(" Auto Guru");
		System.out.println();
		System.out.println(" Choose your car:");
		System.out.println("[1] - Popular ");
		System.out.println("[2] - Lux ");
		car = sc.nextInt();
		System.out.print("How many days you doing stay with car: ");
		days = sc.nextInt();
		System.out.print("How many km will you run?: ");
		km = sc.nextDouble();

		if (car == 1) {
			valorEmprestimo = (90.0 * days);
		 if (km <=100) {
			valorKm = km * 0.20;			
		} else  {
			valorKm = km * 0.10;
		}
		}
		
		if(car ==2) {
			valorEmprestimo = (150.0 * days);
		if (km < 200) {
			valorKm = (km * 0.30);
		}else {
			valorKm = (km * 0.25);
		}
		}
		
			
		double valorFinal = valorKm + valorEmprestimo;
		System.out.printf(" You pay  $" + valorFinal);
		sc.close();
	}

}
