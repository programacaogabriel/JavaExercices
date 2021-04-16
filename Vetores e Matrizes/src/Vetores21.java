import java.util.Scanner;

public class Vetores21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 10;
		System.out.println("Vetores");

		int[] vetA = new int[count];
		int[] vetB = new int[count];
		int[] vetC = new int[count];

		System.out.println("Digite os valores de A");
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores de B");
		for (int i = 0; i < vetB.length; i++) {
			vetB[i] = sc.nextInt();
		}
		
		for(int i =0; i<vetA.length;i++) {
			vetC[i]=vetA[i]-vetB[i];
		}
		
		
		System.out.println("Valor Final");
		for(int i =0; i<vetA.length;i++) {
			System.out.print(vetC[i]+" ");
		}
		sc.close();
	}

}
