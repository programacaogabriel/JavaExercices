import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 01 Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java
		 * Escreva um programa que repita a leitura de uma senha at� que ela seja
		 * v�lida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta � o valor 2002. Exemplo: Entrada: Sa�da: 2200 1020 2022 2002 Senha
		 * Invalida Senha Invalida Senha Invalida Acesso Permitido
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a senha:  ");
		int num = sc.nextInt();
		
		while(num!=2002) {
			System.out.print("Senha Invalida,digite novamente:  ");
			num=sc.nextInt();
		}
			System.out.println("Senha correta!, Acesso Permitido");
	}

}
