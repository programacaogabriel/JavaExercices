package listaDeExercicios;

import java.util.Random;
import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		/*
		 * 32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e
		 * 5 o jogador vai tentar descobrir qual foi o valor sorteado.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Random generator = new Random();
		int maquina=generator.nextInt(6);
		
		System.out.println("TENTE ADIVINHAR O NÚMERO QUE ESTOU PENSANDO");
		int usuario=sc.nextInt();
		if(maquina==usuario) {
			System.out.println("Você acertou!!");
		}else {
			System.out.println("Você errou!");
		}
	sc.close();
	}

}
