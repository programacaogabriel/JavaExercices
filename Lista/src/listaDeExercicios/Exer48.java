package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer48 {

	public static void main(String[] args) {
		/*48) Faça um programa que leia 7 números inteiros e no final mostre o somatório
	entre eles.*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int valorF=7,numero=0,total=0,valor=0;
		
		System.out.println("Digite os valores para a soma");
		while(numero!=valorF) {
			valor=sc.nextInt();
			total=total+valor;
			numero++;
			
		}
		System.out.println("Valor Final: "+total);
	
	sc.close();
	}

}
