package exerciciosjava;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner sc = new Scanner(System.in);
		double paozinho = 0.12, broa = 1.50, totalPaes = 0, totalBroas=0,total=0;
		
		char vendas = 's';
		int numeroPaes, numeroBroas;
		
		
		System.out.println("Bem vindo a Padaria HotPão");
		while (vendas == 's') {
			
			System.out.println("Digite:\n 1= Pães\n 2= Broas\n 3= Finalizar Vendas");
			int valorGerado = sc.nextInt();

			switch (valorGerado) {
			case 1:
				System.out.print("Digite o número de Pães: ");
				numeroPaes = sc.nextInt();
				totalPaes+= (paozinho*numeroPaes);
				break;
			case 2:
				System.out.print("Digite o número de Broas: ");
				 numeroBroas=sc.nextInt();
				 totalBroas+=(broa*numeroBroas);
				break;
			case 3:
				System.out.println("Vendas Finalizadas");
				break;
			default:
				System.out.println("Valor não definido no sistema");
			}
			
			total= totalPaes+totalBroas;
			System.out.printf("Sua venda está no valor de %.2f", total);
			
			System.out.println();
			System.out.println("Deseja adicionar outra venda? S/N");
			vendas = sc.next().charAt(0);
			
			
		}
		System.out.printf("Sua venda está no valor de R$ %.2f", total);
		double porcentagem = total*0.1;
		System.out.println();
		System.out.printf("O valor para ser guardado em sua poupança é de R$ %.2f",porcentagem);
		
sc.close();

	}

}
