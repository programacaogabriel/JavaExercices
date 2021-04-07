package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		/*
		 * 17) Escreva um programa que pergunte a velocidade de um carro. Caso
		 * ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado.
		 * Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km acima da
		 * velocidade permitida.
		 */
		double multa= 0;
		
		System.out.println("Radar Federal");
		System.out.print("Calculando velocidade: ");
		double velocidade =sc.nextDouble();
			
		if(velocidade >80.0) {
			multa=(velocidade-80)*5.0;
			System.out.println("Carro acima da velocidade multa de R$"+multa);
		}else {
			System.out.println("Carro na velocidade correta");
		}
		
	
		sc.close();
	}

}
