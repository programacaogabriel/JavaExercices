import java.util.Locale;
import java.util.Scanner;

public class Vetores7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0,position=0,maior=0;
		System.out.println("Digite a quantidade de valores");
		count = sc.nextInt();

		int[] vet = new int[count];

		for (int i = 0; i < count; i++) {
			vet[i]=sc.nextInt();
		}
		
		for(int i =0;i<count;i++) {
			if(vet[i]>maior) {
				maior=vet[i];
				position=i;
			}
		}
		
		System.out.println("O maior valor é "+maior);
		System.out.println("A posição é a "+position);
	}

}
