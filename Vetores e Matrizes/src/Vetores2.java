import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros=0,count=6;
		System.out.println("Digite os 6 valores");
		
		int []vet = new int[count];
		
		for(int i=0; i<count;i++) {
			vet[i]=sc.nextInt();
		}
		
		System.out.println("Valores Capturados");
		for(int i=0; i<count;i++) {
			System.out.print(vet[i]+" ");
		}
		

	}

}
