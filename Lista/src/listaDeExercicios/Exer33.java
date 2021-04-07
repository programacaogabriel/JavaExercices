package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		/*
		 * 33) Escreva um programa para aprovar ou não o empréstimo bancário para a
		 * compra de uma casa. O programa vai perguntar o valor da casa, o salário do
		 * comprador e em quantos anos ele vai pagar. Calcule o valor da prestação
		 * mensal, sabendo que ela não pode exceder 30% do salário ou então o empréstimo
		 * será negado.
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
		System.out.println("Salário");
		salario = sc.nextDouble();
		System.out.println("Qual o valor do imóvel ?");
		imovel = sc.nextDouble();
		System.out.println("Quantos anos você irá pagar? ");
		anos = sc.nextInt();
		
		int tempo = anos*12;
		double porcentagem = salario-((salario*30)/100);
		int prestacao = (int) imovel/tempo;
		if(porcentagem>=prestacao)  {
			System.out.println("Compra aprovada Sr(a) "+nome);
		}else {
			System.out.println("Seu atual salário não cobre a compra  Sr(a) "+nome);
		}
		sc.close();
	}

}
