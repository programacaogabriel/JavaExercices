import java.util.Scanner;

public class Vetores6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0, maior = 0, menor = 100;
		System.out.println("Digite a quantidade de valores");
		count = sc.nextInt();

		int[] vet = new int[count];

		for (int i = 0; i < count; i++) {
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < count; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
			}
		}
			for (int i = 0; i < count; i++) {
				if (vet[i] < menor) {
					menor = vet[i];
				}
			}
		

		System.out.println("Valor maior " + maior);
		System.out.println("Valor menor " + menor);

	}

}
