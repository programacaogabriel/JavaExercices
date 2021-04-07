package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer52 {

	public static void main(String[] args) {
		/*52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
			a) Qual é a média de idade do grupo
			b) Quantas pessoas tem mais de 18 anos
			c) Quantas pessoas tem menos de 5 anos
			d) Qual foi a maior idade lida*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int idade, maioresIdade=0, menorCinco=0,maiorIdade=0,maiorTotal=0,numero=0;
		
		System.out.println("Idades");
		while(numero<10) {
			idade=sc.nextInt();
			maioresIdade=maioresIdade+idade;
			if(idade>18) {
				maiorIdade=maiorIdade+1;
			}if(idade<5) {
				menorCinco=menorCinco+1;
			}if(idade>maiorTotal) {
				maiorTotal=idade;
			}
			numero++;
		}
		maioresIdade=maioresIdade/10;
		
		System.out.println(" A Média: "+maioresIdade);
		System.out.println(" Pessoas com mais de 18 anos: "+maiorIdade);
		System.out.println(" Pessoas com menos de 5 anos: "+menorCinco);
		System.out.println(" Idade da pessoa mais velha:  "+maiorTotal);
		
		sc.close();
	}

}
