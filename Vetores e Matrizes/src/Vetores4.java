import java.util.Scanner;

public class Vetores4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 8, soma = 0,x,y,resultado;
		System.out.println("Digite os 8 valores");

		int[] vet = new int[count];

		for (int i = 0; i < count; i++) {
			vet[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Valores Digitados");
		System.out.println("+++++++++++++++++");
		for (int i = 0; i < count; i++) {
			System.out.print(vet[i]+" ");
		}
		
		System.out.println();
		System.out.println("Digite 2 numeros para a soma");
		x=sc.nextInt();
		y=sc.nextInt();
		
		for(int i=0;i<count;i++) {
			if(vet[i]==x) {
				x=vet[i];
			}if(vet[i]==y) {
				y=vet[i];
			}
					
		}
		soma=x+y;
		System.out.println();
		System.out.println("A soma dos valores "+soma);
	}

}
