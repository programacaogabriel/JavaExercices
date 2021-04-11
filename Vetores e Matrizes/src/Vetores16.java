import java.util.Scanner;

public class Vetores16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, codigo = 0;		
		char obj = 's';
		while (obj == 's') {
			System.out.println("Digite o valor dos vetores");
			count = sc.nextInt();
			float vet[] = new float[count];

			for (int i = 0; i < vet.length; i++) {
				vet[i] = sc.nextFloat();
			}
			System.out.println();
			System.out.println("Digite o Codigo");
			codigo = sc.nextInt();

			switch (codigo) {
			case 0:
				System.out.println("Programa Finalizado");
				break;
			case 1:
				System.out.println("Você verá o vetor de forma direta");
				for (int i = 0; i < vet.length; i++) {
					System.out.print(vet[i] + " ");
				}
				break;
			case 2:
				System.out.println("Voce verá o vetor de forma reversa");
				for (int i = vet.length -1; i >= 0; i--) {
					System.out.print(vet[i] + " ");
				}
				break;
			default:
				System.out.println("Programa encerrado");
			}
			System.out.println();
			System.out.println("Deseja repetir a operacao? ");
			obj = sc.next().charAt(0);
		}
	sc.close();
	}
	
}
