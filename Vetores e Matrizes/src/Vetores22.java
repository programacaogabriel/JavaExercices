import java.util.Scanner;

public class Vetores22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 10;
		System.out.println("Vetores de valor - PAR OU IMPAR");
		int vet[] = new int[count];
		int vetPar[] = new int[count];
		int vetImpar[] = new int[count];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				vetPar[i] = vet[i];
			} else if (vet[i] % 2 != 0) {
				vetImpar[i] = vet[i];
			} else {
				System.out.println("Valor NULO");
			}
		}
		System.out.println("Valores Pares");
		for (int i = 0; i < vet.length; i++) {
			if (vetPar[i] != 0) {
				System.out.print(vetPar[i] + " ");
			}
		}
		System.out.println();
		System.out.println();

		System.out.println("Valores Impares");
		for (int i = 0; i < vet.length; i++) {
			if(vetImpar[i]!=0) {
			System.out.print(vetImpar[i] + " ");
			}
		}

sc.close();
	}
}
