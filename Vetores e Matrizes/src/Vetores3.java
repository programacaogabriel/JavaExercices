import java.util.Scanner;

public class Vetores3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=10;
		double [] vet = new double [count];
		double [] vet1 = new double[count];
		
		
		
		System.out.println("Insira 10 valores Reais");
		for(int i=0; i<count;i++) {
			vet[i]=sc.nextInt();
		}
		
		for(int i=0;i<count;i++) {
			vet1[i]=Math.pow(vet[i],2);
		}
		
		System.out.println(" Primeiros valores");
		for(int i=0;i<count;i++) {
			System.out.print(vet[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println(" Valores ao quadrado");
		for(int i=0;i<count;i++) {
			System.out.print(vet1[i]+" ");
		}
		
		
		
	}

}
