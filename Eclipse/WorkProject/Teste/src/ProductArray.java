import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Set a Value");
		int n = sc.nextInt();
/*		System.out.print("Digite a quantidade de produtos:  ");
		int quantity=sc.nextInt();
		System.out.print("Digite o produto: ");
		String name=sc.next();
		System.out.print("Digite o preço:  ");
		double price=sc.nextDouble();
	*/	
	
		
		Product vect[] = new Product[n];
		System.out.println("Digite o nome, preço e quantidade");
		for(int i=0;i<n;i++) {
			sc.nextLine();
		String	name =sc.nextLine();
		double	price =sc.nextDouble();
		int	quantity =sc.nextInt();
			vect[i] = new Product(quantity, price, name);
		}
		
		
		double sum=0.0;
		for(int i =0;i<n;i++) {
			sum +=vect[i].getPrice();
		}
		
		double avg = sum/n;
		System.out.printf("Average Price = %.2f%n", avg);
		sc.close();
	}

}
