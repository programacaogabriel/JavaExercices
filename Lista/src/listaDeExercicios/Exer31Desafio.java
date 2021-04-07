package listaDeExercicios;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exer31Desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Random generator = new Random();
		int usuario, maquina;

		System.out.println(" PEDRA  PAPEL  TESOURA");
		System.out.println();
		System.out.println(" [1] - PEDRA");
		System.out.println(" [2] - PAPEL");
		System.out.println(" [3] - TESOURA");
		System.out.println("Escolha sua jogada eu já esolhi a minha!");
		usuario = sc.nextInt();
		maquina = generator.nextInt(300);

		if(usuario == 1 && maquina >0 &&maquina<=100 || usuario == 2 && maquina > 100 && maquina <= 200 || usuario == 3 && maquina >200&& maquina<=300) {
			System.out.println("Que Pena empatamos!");
		} else if (usuario == 1 && maquina > 200 && maquina <= 300) {
			System.out.println("Você ganhou! eu escolhi Tesoura");
		} else if (usuario == 2 && maquina > 0 && maquina <= 100) {
			System.out.println("Você ganhou!");
		} else if (usuario == 3 && maquina >100&& maquina<=200) {
			System.out.println("VocÊ ganhou!");
		}else{
			
			System.out.println("Ganhei!!");
		}
		
		if(maquina>0&&maquina<=100) {
			System.out.println("Escolhi Pedra");
		}else if( maquina>100&&maquina<=200) {
			System.out.println("Escolhi Papel");
		}else {
			System.out.println("Escolhi Tesoura");
		}
			sc.close();
	}

}
