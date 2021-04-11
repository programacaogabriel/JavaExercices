import java.util.Scanner;

public class Vetores17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		System.out.println("Digite o valor dos vetores");
		count=sc.nextInt();
		
		int vet [] = new int[count];
		
		System.out.println("Digite os numeros");
		for(int i =0; i<vet.length;i++) {
			vet[i]=sc.nextInt();
		}
	
		System.out.println();
		System.out.println("Valores ");
		for(int i=0; i<vet.length;i++) {
			if(vet[i]<0) {
				vet[i]=0;
			}
			System.out.print(vet[i]+" ");
		}
	}

}
