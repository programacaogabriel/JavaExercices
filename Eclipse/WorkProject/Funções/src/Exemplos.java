import java.util.Locale;
import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Entre com 3 números");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		int higher = max(n1, n2, n3);

		showResult(higher);

		sc.close();

	}

	public static int max(int a, int b, int c) {
		int aux;
		if (a > b && a > c) {
			aux = a;
		} else if (b > a && b > c) {
			aux = b;
		} else {
			aux = c;
		}
		return aux;
	}

	public static void showResult(int value) {

		System.out.println("higher = "+value);

	}
}
