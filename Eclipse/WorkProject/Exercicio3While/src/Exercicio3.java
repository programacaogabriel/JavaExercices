import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Exercício 03 Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java Um
		 * Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo. Exemplo: Entrada: Saída: 8 1 7 2 2 4
		 * MUITO OBRIGADO Alcool: 1 Gasolina: 2 Diesel: 0
		 */
		Scanner sc = new Scanner(System.in);
		int num,alc,gas,die;
		num =0;
		alc=0;
		gas=0;
		die=0;
		System.out.println("Escreva o Valor na bomba");
		System.out.println("[1] - Álcool");
		System.out.println("[2] - Gasolina");
		System.out.println("[3] - Diesel");
		System.out.println("[4] - Fim");
		System.out.println("--: ");
		num = sc.nextInt();
		
		while(num!=4) {
			if(num==1) {
				System.out.println("Abastercer com Alcool");
				alc+=1;
			}else if(num==2) {
				System.out.println("Abastecer com Gasolina");
				gas+=1;
			}else if(num==3) {
				System.out.println("Abastecer com Diesel");
				die+=1;
			}else {
				System.out.println("Valor Inválido");
				System.out.print("Digite novamente:  ");
			}
			num =sc.nextInt();
		}
		System.out.println("Total de clientes com abastecimento a Álcool: "+alc);
		System.out.println("Total de clientes com abastecimento a Gasolina: "+gas);
		System.out.println("Total de clientes com abastecimento a Diesel: "+die);
		System.out.println("Muito Obrigado");
	
	}

}
