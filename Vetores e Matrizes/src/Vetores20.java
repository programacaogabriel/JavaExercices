import java.util.Random;
import java.util.Scanner;

public class Vetores20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Digite o valor dos vetores");
		count = sc.nextInt();
		Random valor = new Random();

		int vet[] = new int[10];
		int vet1[] = new int[10];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = valor.nextInt(50);
		}

		System.out.println("Estes são os valores");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 != 0) {
				vet1[i] = vet[i];
			}
		}

		System.out.println("Valores Impares");
		for (int i = 0; i < vet.length; i++) {
			if (vet1[i] != 0) {
				System.out.print(vet1[i]+" ");
			}
		}

		sc.close();
	}
}
