import java.util.Locale;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159
		
		*
		*Exemplos:
Entrada: Saída:
2.00 A=12.5664
Entrada: Saída:
100.64 A=31819.3103
Entrada: Saída:
150.00 A=70685.7750*/
		double a,b,c,area,n1,n2,total;
		
		//Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double pi = 3.14159;
		
		a = Math.pow(2.0 ,  2.0);
		b = Math.pow(100.64, 2.0);
		c = Math.pow(150.00, 2.0);
		area = pi*(double)a;
		System.out.println("O valor é de "+ area);
		area = pi*(double)b;
		System.out.printf("O valor é de %.4f\n", area);
		area = pi*(double)c;
		System.out.println("O valor é de "+ area);
		System.out.println();
		System.out.print("Digite o primeiro valor, para fazer o seu elevado ");
		n1 = sc.nextDouble();
		System.out.print("Digite por quantas vezes quer elevar  o valor: ");
		n2 = sc.nextDouble();
		total = Math.pow(n1,n2);
		System.out.println(" O valor da elevação é igual a: "+total);
				
		sc.close();
		
		
		
		
	}

}
