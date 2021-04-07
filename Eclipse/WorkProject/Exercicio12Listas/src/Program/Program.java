package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.lista;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		lista list = new lista(null, null, null);

		System.out.print("How many employess will be registered?");
		int n = sc.nextInt();

		List<lista> lista = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();

			lista cons = new lista(name, salary, id);
			lista.add(cons);

		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		//Integer pos = position(lista,idSalary);
		lista cons = list.stream().filter(x ->x.getId()== id).findFirst().orElse(null);
		if( cons == null){
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage= sc.nextDouble();
			cons.upSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(lista x : lista) {
			System.out.println(cons);
		}
		
		

		sc.close();
	}

	/*public static Integer position(List<lista> lista, int id) {
		for(int i = 0; i<lista.size();i++) {
			if(lista.get(i).getId( )== id) {
				return i;
			}
		}
		return null;*/
	}


