import java.util.Scanner;

public class Vetores23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 10;
		float valor = 0;
		float vet[] = new float[count];
		float vetX[] = new float[5];
		float vetY[] = new float[5];
		float vetF[] = new float[count];

		System.out.println("Preencha os vetores");

		for (int i = 0; i <= 4; i++) {
			vetX[i] = sc.nextFloat();
		}
		for (int i = 0; i <= 4; i++) {
			vetY[i] = sc.nextFloat();
		}

		System.out.println();
		System.out.println("valores de Y");
		for (int i = 0; i < 5; i++) {
			if (vetY[i] != 0) {

				System.out.print(vetY[i] + " ");
			}

		}
		System.out.println();
		System.out.println("Valores de X");
		for (int i = 0; i < 5; i++) {
			if (vetX[i] != 0) {
				System.out.print(vetX[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Valores ");
		for (int i = 0; i < 5; i++) {
			vetF[i] = vetX[i] * vetY[i];
			System.out.print(vetF[i] +" ");
			
		}

		sc.close();
	}
}