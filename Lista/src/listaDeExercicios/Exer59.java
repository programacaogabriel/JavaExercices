package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer59 {

	public static void main(String[] args) {
		/*
		 * 59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa
		 * vai perguntar se o usuário quer continuar ou não a cada pessoa. No final,
		 * mostre:
		 *  a) qual é a maior idade lida
		 *   b) quantos homens foram cadastrados
		 *    c) qual é a idade da mulher mais jovem 
		 *    d) qual é a média de idade entre os homen
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int idade,idadeM=0,valor=0,maiorIdade=0,homensCadastrados=0,media=0,mulherJo=150;
		double mediaHomen;
		char sexo;
		
		do {
			System.out.println("Digite seu Sexo [M] ou [F]");
			sexo=sc.next().charAt(0);
			System.out.println("Digite sua Idade");
			idade=sc.nextInt();
			
			if(idade>maiorIdade) {
				maiorIdade=idade;
			}
			
			if(sexo=='M') {
				homensCadastrados=homensCadastrados+1;
				media++;
			}
			
			if(sexo=='F' && idade<mulherJo) {
				idadeM=idade;
			}
			System.out.println("Deseja continuar");
			valor=sc.next().charAt(0);
		}while(valor=='S');
		
		mediaHomen=homensCadastrados/media;
		
		System.out.println("A maior idade lida: "+maiorIdade);
		System.out.println("Homens foram cadastrados: "+homensCadastrados);
		System.out.println("Média de idade entre os homen: "+mediaHomen);
		System.out.println("A idade da mulher mais jovem: "+idadeM);
		sc.close();
		
	
	}

}
