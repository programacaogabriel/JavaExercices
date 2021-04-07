import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		 /*Exercício 06 
		 Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1157.java 
		 
		 
		Ler um número inteiro N e calcular todos os seus divisores. 
		 
		  
		 
		  
		Exemplo: 
		  Entrada: Saída:   6 1 2 3 6 */
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		
		System.out.print("Digite um valor:  ");
		n=sc.nextInt();
		
		System.out.println("Valores Divisores");
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
		

	}

}
