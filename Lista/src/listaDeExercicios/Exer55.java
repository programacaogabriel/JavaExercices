package listaDeExercicios;


import java.util.Random;
import java.util.Scanner;

public class Exer55 {

	public static void main(String[] args) {
		/*55) [DESAFIO] Vamos melhorar o jogo que fizemos no exerc�cio 32. A partir de
	agora, o computador vai sortear um n�mero entre 1 e 10 e o jogador vai ter 4
	tentativas para tentar acertar.*/
	Scanner sc = new Scanner(System.in);
		
		Random generator = new Random();
		int maquina=generator.nextInt(6),valor=0;
		
		System.out.println("TENTE ADIVINHAR O N�MERO QUE ESTOU PENSANDO");
		
		while(valor<=4) {
			int usuario=sc.nextInt();
		if(maquina==usuario) {
			System.out.println("Voc� acertou!!");
			break;
		}else {
			System.out.println("Voc� errou!");
			if(valor==4) {
				System.out.println("Perdeu a partida!");
			}else {
				System.out.println("tente novamente");
			}
		}
		
		valor++;
		}
	sc.close();
	}

}
