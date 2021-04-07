
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int valor,soma=0;
		
		System.out.println("Digite a quantidade de numeros");
		valor =sc.nextInt();
		
		int [] vet= new int[valor];
		
		for(int i =0; i<valor;i++) {
			vet[i]=sc.nextInt();
		}
		
		for(int i=0; i<valor ;i++) {
			soma+=vet[i];
			if(i==4) {
				vet[i]=100;
			}
		}
		for(int i =0; i<valor; i++) {
			System.out.println(vet[i]+" ");
		}System.out.println();
		System.out.println(soma);
		
		

	}
}
