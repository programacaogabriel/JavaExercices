import java.util.Scanner;

public class Vetores14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0,v=0;
		System.out.println("Digite a quantidade de valores");
		count = sc.nextInt();

		int[] vet = new int[count];
		int[] vet1 = new int[count];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}

		System.out.println("Numeros iguais");
		for (int i = 0; i < vet.length; i++) {
			for(int j=i+1;j<vet.length;j++) {
				if(vet[j]==vet[i]) {
					v=vet[i];
					System.out.println(v);
				}
			}
			
			
			}
		}

	}


