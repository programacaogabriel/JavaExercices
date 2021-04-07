import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		/*
		 * Exercício 08 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1051.java Em
		 * um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
		 * pagar seus impostos, pois sabem que nele não existem políticos corruptos e os
		 * recursos arrecadados são utilizados em benefício da população, sem qualquer
		 * desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com
		 * duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em
		 * seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de
		 * Renda, segundo a tabela abaixo. Lembre que, se o salário for R$ 3002.00, a
		 * taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que
		 * fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo
		 * fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o
		 * que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas
		 * decimais. Exemplos: Entrada: Saída: 3002.00 R$ 80.36 Entrada: Saída: 1701.12
		 * Isento Entrada: Saída: 4520.00 R$ 355.60
		 */

		Scanner sc = new Scanner(System.in);
		double valor, valorF;
		Locale.setDefault(Locale.US);

		System.out.println("IMPOSTOS EM ROMBUS");
		System.out.println();
		System.out.print("Digite o seu salário R$ ");
		valor = sc.nextDouble();
		valorF = 0;

		if (valor > 0.00 && valor <= 2000.00) {
			System.out.println("Valor Isento");
		} else if (valor >= 2000.01 && valor <= 3000.00) {
			System.out.println("Valor de 8% de imposto");
			valorF = (valor * 8) / 100;
		} else if (valor >= 3000.01 && valor <= 4500.00) {
			System.out.println("Valor de 18% de imposto");
			valorF = (valor * 18) / 100;
		} else if (valor >= 4500.01) {
			System.out.println("Valor com 28% de imposto");
			valorF = (valor * 28) / 100;
		} else {
			System.out.println("Valor Invalido");
		}
		System.out.println(" Você tera de Pagar a quanti de R$ " + valorF + " para os impostos");
		sc.close();
	}

}
