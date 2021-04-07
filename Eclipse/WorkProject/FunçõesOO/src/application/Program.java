package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

//Construtor
public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter Product Data ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
	
		
		Product produto = new Product(name,price);
		
		System.out.println();
		System.out.println("Product Data: " + produto);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update Data: " + produto);

		System.out.println();
		System.out.println("Enter the number of products to be removed in stock\" ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);

		System.out.println();
		System.out.println("Update Data: " + produto);
		sc.close();
	}

}
