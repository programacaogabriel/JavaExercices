import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		/*Exercício 04 
		 Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1116.java 
		 
		 
		Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". 
		 
		 
		 
		   Exemplo: 
		  Entrada: Saída:   3 3 -2 -8 0 0 8 -1.5 divisao impossivel 0.0*/ 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int i,n;
		float v1,v2,r;
		
		System.out.print("Digite o valor da contagem:  ");
		n=sc.nextInt();
		
		
		for(i=1;i<=n;i++) {
			System.out.println("Infome o 1º número");
			v1 = sc.nextInt();
			System.out.println("Informe o 2º número");
			v2 = sc.nextInt();
			
			if(v2!=0) {
				r=v1/v2;
				System.out.printf("O valor é : %.2f",r);
				System.out.println();
			}else {
				System.out.println("Divisão Impossível");
				System.out.println();
			}
			
		
		}
		sc.close();
		
		  
	}

}
