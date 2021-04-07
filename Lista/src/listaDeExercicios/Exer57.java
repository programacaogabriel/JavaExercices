package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer57 {

	public static void main(String[] args) {
		/*57) Desenvolva um aplicativo que leia o sal�rio e o sexo de v�rios funcion�rios.
	No final, mostre o total de sal�rios pagos aos homens e o total pago �s
	mulheres. O programa vai perguntar ao usu�rio se ele quer continuar ou n�o
	sempre que ler os dados de um funcion�rio.*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double salario,salarioF=0,salarioM=0;
		char sexo,valor = 0;
		
		
		
		do {
			System.out.println("Digite o sal�rio");
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
			System.out.println("Totais de sal�rios homens "+salarioM);
			System.out.println("Totais de sal�rios mulheres "+salarioF);
		
		sc.close();
	}

}
