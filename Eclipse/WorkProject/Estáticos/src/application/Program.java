package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the Radius: ");
		double radius=sc.nextDouble();
		
		double c = Calculadora.circunference(radius);
		
		double v = Calculadora.volume(radius);
		
		System.out.printf("The circunference %.2f\n",c);
		System.out.printf("The volume %.2f\n",v);
		System.out.println("The number of PI \n"+Calculadora.PI);

	}

}
