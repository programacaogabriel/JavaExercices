package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {
		
		/*10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
	mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
	sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
	*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double total=0.0;
		double pintura=0.0;
		
		System.out.println("Vamos Pintar");
		System.out.print("\n Digite a altura de sua parede: ");
		double altura = sc.nextDouble();
		System.out.print("\n Digite a largura de sua parede: ");
		double largura = sc.nextDouble();
		total= altura*largura;
		pintura = total/2;
		System.out.println("\nVocê possui uma parede de "+total+" metros quadrados e irá precisar de "+pintura+" litros de tinta");
		
	sc.close();
	}
}
