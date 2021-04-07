package application;

import java.util.Locale;
import java.util.Scanner;

import files.Conta;

public class BancoSC {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta bancosc;

		System.out.println("BancoSc");
		System.out.print("Informe o Número da conta: ");
		int conta = sc.nextInt();
		System.out.print("Informe o dono da conta: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Deseja inserir algun valor? ");
		char response =sc.next().charAt(0);
		if( response == 's') {
			System.out.println("Entre com o valor R$");
			double dinheiro = sc.nextDouble();
			bancosc = new Conta(name, conta, dinheiro);
		}else {
			bancosc = new Conta(name, conta);
		}
		


		System.out.println();
		System.out.println(bancosc);
		System.out.println();
		System.out.println("Deseja acessar o menu? [S/N]");
		char menu = sc.next().charAt(0);
		char resp = 's';
		while (resp == 's') {
			if (menu == 's') {
				System.out.println("Escolha a operação");
				System.out.println("1 -- Depósito");
				System.out.println("2 -- Saque");
				System.out.println("3 -- Transferencia");
				int numero = sc.nextInt();

				switch (numero) {
				case 1:
					System.out.print("Deseja realizar um depósito de quanto? ");
					double dinheiro = sc.nextDouble();
					bancosc.addDinheiro(dinheiro);
					break;
				case 2:
					System.out.print("Deseja realizar um saque de quanto? ");
					dinheiro = sc.nextDouble();
					bancosc.removeDinheiro(dinheiro);
					break;
				case 3:
					System.out.println("Deseja realizar a transferencia de qual valor?");
					dinheiro = sc.nextDouble();
					bancosc.transferenciaDinheiro(dinheiro);
					break;
				default:

				}

			} else {
				System.out.println("Agradecemos a abertura de sua conta");
			}
			System.out.println(bancosc);
			System.out.println("Deseja realizar outra operação [S/N]");
			resp = sc.next().charAt(0);
		
		}
		

		sc.close();

	}

}
