import java.util.Scanner;

public class Vetores5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 10,soma=0;
		int[] vet = new int[count];

		System.out.println("Insira 10 valores");
		for (int i = 0; i < count; i++) {
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < count; i++) {
			if(vet[i]%2==0) {
				soma+=1;
			}
		}
		
		System.out.println();
		System.out.println("São "+soma+" valores pares");

	}

}
