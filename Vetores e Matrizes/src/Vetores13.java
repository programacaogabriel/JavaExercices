import java.util.Scanner;

public class Vetores13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0,valorMaior=0,valorMenor=0,maior=0,menor=1000;
	
		System.out.println("Digite a quantidade de vetores");
		count=sc.nextInt();
		int[] vet = new int[count];
		for(int i =0; i<vet.length;i++) {
			vet[i]=sc.nextInt();
		}
		
		for(int i=0; i<vet.length;i++) {
			if(vet[i]>maior) {
				maior=vet[i];
				valorMaior=i;
			}
			
			if(vet[i]<menor) {
				menor=vet[i];
			valorMenor=i;
			}
		}
		
		System.out.println("A posição do Maior valor "+valorMaior);
		System.out.println("A posição do Menor valor "+valorMenor);
	}

}
