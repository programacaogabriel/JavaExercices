import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

import Util.Pensao;

public class Studantes {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("How many room will be rented?  ");
		int n =sc.nextInt();
		
		Pensao vect[] = new Pensao[n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.println("Rent #"+i);
			System.out.print("Name: ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Email:  ");
			String email=sc.next();
			System.out.print("Cash:  ");
			double aluguel =sc.nextDouble();
			System.out.print("Room:  ");
			int quartos =sc.nextInt();
			System.out.println();
			vect [i]= new Pensao(aluguel, name, email, quartos);
		}
		
		System.out.println("Busy rooms: ");
		for(int i=0;i<vect.length;i++) {
			System.out.println(vect[i]);
		}
		System.out.println("++++++++++Laço For Each");
		for( Pensao obj : vect) {
			System.out.println(obj);
		}
	
		sc.close();	
	}

}
