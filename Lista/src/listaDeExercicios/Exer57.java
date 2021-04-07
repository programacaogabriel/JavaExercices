package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer57 {

	public static void main(String[] args) {
		/*57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
	No final, mostre o total de salários pagos aos homens e o total pago às
	mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
	sempre que ler os dados de um funcionário.*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double salario,salarioF=0,salarioM=0;
		char sexo,valor = 0;
		
		
		
		do {
			System.out.println("Digite o salário");
			salario=sc.nextDouble();
			System.out.println("Digite o sexo [F] ou [M]");
			sexo=sc.next().charAt(0);
			
			if(sexo=='F') {
				salarioF=salarioF+salario;
			}else {
				salarioM=salarioM+salario;
			}
			
			System.out.println("Deseja continuar [S] ou [N]");
			valor=sc.next().charAt(0);
			
			
		}while (valor=='S');
			System.out.println("Totais de salários homens "+salarioM);
			System.out.println("Totais de salários mulheres "+salarioF);
		
		sc.close();
	}

}
