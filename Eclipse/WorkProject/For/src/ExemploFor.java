import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,v,t;
		v=0;
		t=0;

		System.out.print("Digite o valor: ");
		n=sc.nextInt();
		
		for(n=0;n<3;n++) {
			System.out.print("Digite o valor: ");
			v=sc.nextInt();
		t=t+v;
			
		
		}
		sc.close();
		System.out.println(t);

	}

}
