import java.util.Scanner;

public class Vetores8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		System.out.println("Digite a contagem de valores");
		count = sc.nextInt();

		int[] vet = new int[count];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();

		}
		System.out.println();
		System.out.println("Valores Inversos");

		for (int i = vet.length-1; i >=0; i--) {
			System.out.print(vet[i]+" " );
		}

	}

}
