import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i,x,v,v1,v2;
		v1=0;
		v2=0;
		v=0;
		System.out.print("Digite o valor de contagem:   ");
		 x=sc.nextInt();
		 
		 System.out.println("Escreva os "+x+" valores");
		 for(i=0;i<x;i++) {
			 v=sc.nextInt();
			 if(v>=10 && v<=20) {
				 v1+=1;
			 }else {
				 v2+=1;
			 }
		 }
		 System.out.println(v1+" in");
		 System.out.println(v2+" out");
	}

}
