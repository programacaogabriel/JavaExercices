package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer54 {

	public static void main(String[] args) {
		/*
		 * 54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas,
		 * mostrando no final: a) Qual foi a média de altura do grupo 
		 * b) Quantas pessoas pesam mais de 90Kg 
		 * c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m 
		 * d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		double peso = 0, altura = 0, mPeso = 0, mAltura = 0, pesadas = 0, levesPesoAlt = 0, pesadasPesoAlt = 0;

		System.out.println("Digite o peso e depois altura");
		while (numero < 5) {
			System.out.println(numero+"º Pessoa");
			peso = sc.nextDouble();
			altura = sc.nextDouble();
			mPeso = mPeso + peso;
			mAltura = mAltura + altura;

			if (peso > 90) {
				pesadas = pesadas + 1;
			}
			
			if (peso < 50 && altura < 1.60) {
				levesPesoAlt = levesPesoAlt + 1;
			} else if (peso > 100 && altura > 1.90) {
				pesadasPesoAlt = pesadasPesoAlt + 1;
			}

			mPeso = mPeso + peso;
			mAltura = mAltura + altura;
			numero++;
		}
		
		System.out.printf("Media do grupo Peso: %.2f\n",mPeso);
		System.out.printf("Media do grupo Altura: %.2f\n",mAltura);
		System.out.println("Pessoas acima de 90kg: "+ pesadas);
		System.out.println("Pessoas que pesam menos de 50Kg tem menos de 1.60m: "+levesPesoAlt);
		System.out.println("Pessoas que medem mais de 1.90m pesam mais de 100Kg: "+ pesadasPesoAlt);
		sc.close();
	}

}
