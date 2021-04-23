import java.util.Scanner;

public class Vetores24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char d='n';
		int count,valorCorrecao,number=0,number2=0;
		System.out.println("Digite o número de alunos");
		count = sc.nextInt();

		int vet[] = new int[count];
		float vetN[] = new float[count];
		String vetS[] = new String[count];

		System.out.println("Vamos digitar o nome do aluno e a sua altura");

		for (int i = 0; i < vet.length; i++) {
			vetS[i] = sc.next();
			vetN[i] = sc.nextFloat();
		}
		System.out.println();
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vetS[i] + " :  " + vetN[i]);
		}
		
		System.out.println("Deseja realizar ajustes");
		d=sc.next().charAt(0);
		System.out.println();
		while(d=='n') {
			for (int i = 0; i < vetN.length; i++) {
				System.out.println(i+": "+vetS[i] + " :  " + vetN[i]);
			}	
			System.out.println("Digite o numero referente ao ajuste");
			valorCorrecao=sc.nextInt();
			
			System.out.println("Correção de dados: ");
			for (int i = 0; i < vetN.length; i++) {
				if(valorCorrecao==i) {
					vetS[i] = sc.next();
					vetN[i] = sc.nextFloat();
				}
			}	
			
			System.out.println("Finalizar ajustes");
			d=sc.next().charAt(0);
		}
		
		for(int i=0;i<vet.length;i++) {
			if(vetN[i]>0) {
				number = i;
			}
			if(vetN[i]<3.99) {
				number2 =i;
			}
			
		}
		
		for (int i = 0; i < vet.length; i++) {
			if(number==i) {
				vetS[i] = sc.next();
				vetN[i] = sc.nextFloat();
				System.out.println("O aluno mais alto" + vetS[i]+"com altura de "+vetN[i]);
			}
			if(number2==i) {
				vetS[i] = sc.next();
				vetN[i] = sc.nextFloat();
				System.out.println("O aluno mais baixo" + vetS[i]+"com altura de "+vetN[i]);
			}
		}	
		
	}

}
