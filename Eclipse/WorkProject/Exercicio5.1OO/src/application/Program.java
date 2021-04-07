package application;

import java.util.Locale;
import java.util.Scanner;

import files.Retangulo;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo calc = new Retangulo();
		
		System.out.println("Enter a rectangle width and heigth");
		calc.width=sc.nextDouble();
		calc.height=sc.nextDouble();
		
		System.out.println("Area "+calc.area());
		System.out.println("Perimetro "+calc.perimeter());
		System.out.println("Diagonal "+calc.diagonal());

		sc.close();
	}

}
