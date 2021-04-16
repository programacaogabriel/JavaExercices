import java.util.Scanner;

public class Vetores23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 10;
		float valor=0;
		float vet[] = new float[count];
		float vetX[] = new float[count];
		float vetY[] = new float[count];
		float vetF[] = new float[count];
		
		System.out.println("Preencha os vetores");
	
		for(int i=0;i<vet.length;i++) {
			vet[i]=sc.nextFloat();
		}
		for(int i=0; i<vet.length;i++) {
			if(i<=4) {
				vetX[i]=vet[i];
			}if(i>=5) {
				vetY[i]=vet[i];
			}
			
		}
		
		System.out.println();
		System.out.println("valores de Y");
		for(int i=0;i<vet.length;i++) {
		if(vetY[i]!=0) {
			System.out.print(vetY[i]+" ");
		}
			
		}
		System.out.println();
		System.out.println("Valores de X");
		for(int i=0;i<vet.length;i++) {
			if(vetX[i]!=0) {
			System.out.print(vetX[i]+" ");
			}
		}
		
		for(int i=0; i<vet.length;i++) {
			for(int j =0;j<vet.length;j++) {
				vetF[j]=vetX[i]*vetY[i];
				System.out.print(vetF[j]+" ");
			}
			
		}
		
		
		
	sc.close();
	}

}
