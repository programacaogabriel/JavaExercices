import java.util.Scanner;

public class Vetores9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Digite a quantidade de vetores");
		count = sc.nextInt();

		int[] vet = new int[count];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}

		for (int i = vet.length-1; i > 0; i--) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
			}
		}

	}

}
