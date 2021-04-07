import java.util.Scanner;

public class Vetores12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0, maior = 0, menor = 100, valorMaior = 0, valorMenor = 0, soma = 0, media = 0;
		System.out.println("Digite a quantidade de vetores");
		count = sc.nextInt();

		int vet[] = new int[count];

		System.out.println("Digite os valores");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior=vet[i];
				valorMaior = i;
			}
		}

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < menor) {
				menor=vet[i];
				valorMenor = i;

			}

			soma += vet[i];
		}
		media = soma / count;

		System.out.println("O maior valor " + maior);
		System.out.println("O menor valor " + menor);
		System.out.println("A media dos valores é de " + media);

	}

}
