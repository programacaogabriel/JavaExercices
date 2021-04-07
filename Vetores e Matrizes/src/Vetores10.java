import java.util.Locale;
import java.util.Scanner;

public class Vetores10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma=0;
		int count = 0;
		System.out.println("Digite o valor dos vetores");
		count = sc.nextInt();

		double[] vet = new double[count];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
		}

		for (int i = vet.length - 1; i >= 0; i--) {
			 soma+=vet[i];
		}
		
		double resultado = soma/count;
		System.out.printf("O valor da media é igual a: %.2f",resultado);

	}

}
