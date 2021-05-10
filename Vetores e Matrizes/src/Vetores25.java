import java.util.Scanner;

public class Vetores25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 100;

		int[] vet = new int[count];

		for (int i = 0; i <= count; i++) {
			if(i>=100) {
				break;
			}
			vet[i]= 7*i;
				System.out.println(vet[i]);
			}

		

		sc.close();
	}

}
