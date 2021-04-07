import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.println("Aumento de salário");
		System.out.println();
		System.out.print("Nome:  ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary:  ");
		employee.glossSalary = sc.nextDouble();
		System.out.print("Tax:  ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		System.out.println();
		System.out.print("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.print("Update Data: "+employee);
		
		sc.close();
	}

}
