import java.util.Scanner;

public class exemplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,valor;
		
		valor=0;
		System.out.println("Escreva um valor de 0 a 5");
		num = sc.nextInt();
		while(num!=0) {
			valor+=num;
			num= sc.nextInt();
			
			
	}
		double x=100,y=100;
		
		while(x!=y) {

			System.out.println("Olha");
			x=Math.sqrt(y);
		}
		System.out.println("Soma dos números digitados "+valor);
		sc.close();

}
}