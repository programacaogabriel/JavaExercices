package application;

import java.util.Locale;
import java.util.Scanner;

import files.Salario;


public class Program01 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			Salario salario = new Salario();
			
			System.out.print("Name: ");
			salario.name=sc.next();
			System.out.print("GrossSalary: ");
			salario.grossSalary=sc.nextDouble();
			System.out.print("Tax: ");
			salario.tax=sc.nextDouble();
			
			System.out.println();
			System.out.println("Employe: "+salario);
			System.out.println();
			System.out.println("Wich a percentage to increase salary? ");
			double percentage=sc.nextDouble();
			salario.increaseSalary(percentage);
			System.out.println();
			System.out.println("Update data: "+salario);
			
			
			sc.close();

	}

}
