import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 03 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java Um
		 * Posto de combust�veis deseja determinar qual de seus produtos tem a
		 * prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O programa
		 * ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combust�vel, conforme exemplo. Exemplo: Entrada: Sa�da: 8 1 7 2 2 4
		 * MUITO OBRIGADO Alcool: 1 Gasolina: 2 Diesel: 0
		 */
		Scanner sc = new Scanner(System.in);
		int num,alc,gas,die;
		num =0;
		alc=0;
		gas=0;
		die=0;
		System.out.println("Escreva o Valor na bomba");
		System.out.println("[1] - �lcool");
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
				System.out.println("Valor Inv�lido");
				System.out.print("Digite novamente:  ");
			}
			num =sc.nextInt();
		}
		System.out.println("Total de clientes com abastecimento a �lcool: "+alc);
		System.out.println("Total de clientes com abastecimento a Gasolina: "+gas);
		System.out.println("Total de clientes com abastecimento a Diesel: "+die);
		System.out.println("Muito Obrigado");
	
	}

}
