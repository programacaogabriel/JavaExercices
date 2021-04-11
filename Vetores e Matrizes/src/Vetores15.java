import java.util.Scanner;

public class Vetores15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		{
			int count = 0;
			System.out.println("Digite p valor dos vetores");
			count = sc.nextInt();

			int vet[] = new int[count];

			for (int i = 0; i < vet.length; i++) {
				vet[i] = sc.nextInt();
			}

			for (int i = 0; i < vet.length; i++) {
				for (int j = i + 1; j < vet.length; j++) {
					if (vet[i] == vet[j]) {
						vet[i]=0;
						vet[j]=0;
					}
				
				}
			
			}
			System.out.println("Valores sem numeros repetidos");
			for (int i = 0; i < vet.length; i++) {
				if(vet[i]!=0) {
					System.out.println(vet[i]+" ");
				}
			}

			

		}
	sc.close();
	}
	
}
