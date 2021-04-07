package listaDeExercicios;

public class Exer70 {

	public static void main(String[] args) {
		/*70) [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência
	de Fibonacci:
	1 1 2 3 5 8 13 21...*/
		
		
		
		int i,n1=1,n2=1,soma;
		for(i=0; i<=10;i++) {
		
			soma=n2+n1;
			n1=n2;
			n2=soma;
			System.out.print(n2+" ");
		}
		
	}

}
