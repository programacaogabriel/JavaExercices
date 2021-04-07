package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		/*
		 * 34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e
		 * no peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
		 * indivíduo dentro de certas faixas. - abaixo de 18.5: Abaixo do peso - entre
		 * 18.5 e 25: Peso ideal - entre 25 e 30: Sobrepeso - entre 30 e 40: Obesidade -
		 * acima de 40: Obseidade mórbida Obs: O IMC é calculado pela expressão
		 * peso/altura² (peso dividido pelo quadrado da altura)
		 */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double altura,peso;
		altura=0;
		peso=0;
		System.out.println(" I M C");
		System.out.println();
		System.out.print("Digite sua altura: ");
		altura=sc.nextDouble();
		System.out.print("Digite seu peso: ");
		peso=sc.nextDouble();
		
		double valorTotal= peso/(Math.pow(altura,2));
		System.out.printf("\nSeu valor é %.2f\n",valorTotal);
		
		if(valorTotal == 18.5) {
			System.out.println("Abaixo do peso");
		}else if(valorTotal > 18.5 && valorTotal <25) {
			System.out.println(" Peso ideal");
		}else if(valorTotal >25 && valorTotal <30) {
			System.out.println("Sobrepeso");
		}else if( valorTotal >30 && valorTotal<40) {
			System.out.println("Obesidade");
		}else if(valorTotal >40) {
			System.out.println("Obseidade mórbida");
		}else {
			System.out.println("Obesidade Master");
		}
		
		sc.close();

	}

}
