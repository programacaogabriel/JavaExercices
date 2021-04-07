package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		/*
		 * 33) Escreva um programa para aprovar ou n�o o empr�stimo banc�rio para a
		 * compra de uma casa. O programa vai perguntar o valor da casa, o sal�rio do
		 * comprador e em quantos anos ele vai pagar. Calcule o valor da presta��o
		 * mensal, sabendo que ela n�o pode exceder 30% do sal�rio ou ent�o o empr�stimo
		 * ser� negado.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String nome;
		int anos;
		double salario, imovel;

		System.out.println(" Minha casa Minha Divida");
		System.out.println("");
		System.out.println("Nome do Solicitante");
		nome = sc.next();
		System.out.println("Sal�rio");
		salario = sc.nextDouble();
		System.out.println("Qual o valor do im�vel ?");
		imovel = sc.nextDouble();
		System.out.println("Quantos anos voc� ir� pagar? ");
		anos = sc.nextInt();
		
		int tempo = anos*12;
		double porcentagem = salario-((salario*30)/100);
		int prestacao = (int) imovel/tempo;
		if(porcentagem>=prestacao)  {
			System.out.println("Compra aprovada Sr(a) "+nome);
		}else {
			System.out.println("Seu atual sal�rio n�o cobre a compra  Sr(a) "+nome);
		}
		sc.close();
	}

}
