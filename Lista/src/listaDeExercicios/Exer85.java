package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer85 {

	public static void main(String[] args) {
		/*85) Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
	guarde esses dados em três vetores. No final, mostre uma listagem contendo
	apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.*/
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double salario=0.0;
		char sexo='*';
		String nome;
		int i,n=5;
		String vetNome[] = new String[n];
		String vetNome1[] = new String[n];
		double vetSalario[] = new double[n];
		double vetSalario1[] = new double[n];
		char vetSexo[] = new char[n];
		
		System.out.println("Insira o nome, salario e sexo do funcionário");
		for(i=0;i<n;i++) {
			vetNome[i]=nome=sc.next();
			vetSalario[i]=salario=sc.nextDouble();
			vetSexo[i]=sc.next().charAt(0);
		}
		
		for(i=0;i<n;i++) {
			
			if(vetSexo[i]=='F' && vetSalario[i]>5.000) {
				vetNome1[i]=vetNome[i];
				vetSalario1[i]=vetSalario[i];
				System.out.println(i+"º Funcionário");
				System.out.println("Nome : " +vetNome1[i]+"\nSalário: "+vetSalario1[i]);
			}
		}
		sc.close();
	}

}
