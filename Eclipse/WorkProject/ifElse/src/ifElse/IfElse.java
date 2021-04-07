package ifElse;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = 0;
		
		System.out.println(" Digite a hora do dia ");
		x = sc.nextInt();
		
		if(x>=4 && x<12 ) {
			System.out.println("Bom dia!");
		}else {
			if(x>13 && x< 18) {
				System.out.println("Boa tarde!");
			}else {
				System.out.println("Boa noite!");
			}
		}
		
		
		sc.close();
	}

}
