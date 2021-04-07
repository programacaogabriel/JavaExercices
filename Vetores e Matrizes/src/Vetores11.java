import java.util.Scanner;

public class Vetores11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0, negativo = 0;
		float soma = 0;
		System.out.println("Digite a quantidade de valores");
		count = sc.nextInt();
		float[] vet = new float[count];

		System.out.println("Inicie o valores: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextFloat();
		}

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				negativo += 1;
			} else if (vet[i] > 0) {
				soma+= vet[i];
			}
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		System.out.println("Quantidade de numeros negativos: "+negativo);
		System.out.println("Soma : "+soma);
	}

}
