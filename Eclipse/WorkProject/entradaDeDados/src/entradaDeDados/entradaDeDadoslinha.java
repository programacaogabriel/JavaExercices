package entradaDeDados;

import java.util.Scanner;

public class entradaDeDadoslinha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;
		int x;

		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados Digitados");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
