package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.xml.crypto.Data;

import entities.contract.HourContract;
import entities.department.Department;

public class Program {

	public static void main(String[] args) throws ParseException {
		  Scanner sc = new Scanner(System.in);
		  Locale.setDefault(Locale.US);
		  SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		  
		  System.out.print("Enter department name: ");
		  String departmentName = sc.nextLine();
		  
		  System.out.print("Enter worker data");
		  System.out.print("Name: ");
		  sc.nextLine();
		  String workerName = sc.nextLine();
		  System.out.print("Level: ");
		  String workerLevel = sc.nextLine();
		  System.out.print("Base salary: ");
		  double baseSalary = sc.nextDouble();
		  
		  Worker worker = new Worker(workerName, workerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		  
		  System.out.print("How many contracts to this worker? ");
		  int n = sc.nextInt();
		  
		  for(int i=0; i<=n ; i++) {
			  System.out.print("Enter contract #"+ i + " data: ");
			  System.out.print("Date  (DD/MM/YYYY): ");
			  Data contractDate = (Data) sdf.parse(sc.next());
			  System.out.print("Value Per Hour: ");
			  double valuePerHour = sc.nextDouble();
			  System.out.print("Duration hours: ");
			  int hours = sc.nextInt();
			  HourContract contract = new HourContract(contractDate,valuePerHour,hours);
			  worker.addContract(contract);
		  }
		  System.out.println();
		  System.out.println("Enter month and year to calculate income(MM/YYYY): ");
		  String monthAndYear = sc.next();
		  int month = Integer.parseInt(monthAndYear.substring(0,2));
		  int year = Integer.parseInt(monthAndYear.substring(3));
		  System.out.println("Name: "+worker.getName());
		  System.out.println("Departmente: "+worker.getDepartment().getName());
		  System.out.println("Income for "+ monthAndYear+ ":"+String.format("%.2f",worker.income(year, month)));
		  		  
		  
		 sc.close(); 
	}

}
