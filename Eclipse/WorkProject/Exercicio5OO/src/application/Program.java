package application;

import java.util.Locale;
import java.util.Scanner;

import utils.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		/*
		 * Banco: número da conta; nome do titular; valor do deposito incial em que ele
		 * abriu a conta, caso queria, senão conta = 0; numero da conta não poderá ser
		 * alterado, somente o nome do títular, caso casamento; Para cada saque
		 * realizado será cobrado uma taxa de $ 5.00, não poderá ficar negativado.
		 */

		System.out.println("Banco Javali Cansado");
		System.out.println();

		System.out.print("Enter the account number:  ");
		int number = sc.nextInt();
		System.out.print("Enter the account holder:  ");
		String name = sc.next();
		System.out.print("Is There a Inicial Deposit( Y / N ): ");
		char opcao = sc.next().charAt(0);

		

		if (opcao == 'y') {
			System.out.print("Enter inicial Deposit Value: ");
			double valor = sc.nextDouble();
			bank = new Bank(number,name,valor);
			} else {
			bank = new Bank(number,name);
			}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		
		
		//Deposito
		System.out.println();
		System.out.print("Enter a deposit Value: ");
		double deposit = sc.nextDouble();
		bank.addValue(deposit);	
		System.out.println("Update account data: ");
		System.out.println(bank);
		
		//Saque do valor
		System.out.println();
		System.out.print("Enter a withDraw Value: ");
		double remove = sc.nextDouble();
		bank.removeValue(remove);
		System.out.println("Update account data: ");
		System.out.println(bank);
		
		sc.close();
	}
}