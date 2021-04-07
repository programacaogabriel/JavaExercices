package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		/*36) Um programa de vida saud�vel quer dar pontos atividades f�sicas que podem
	ser trocados por dinheiro. O sistema funciona assim:
	 - Cada hora de atividade f�sica no m�s vale pontos
	 - at� 10h de atividade no m�s: ganha 2 pontos por hora
	 - de 10h at� 20h de atividade no m�s: ganha 5 pontos por hora
	 - acima de 20h de atividade no m�s: ganha 10 pontos por hora
	 - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)*/
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double hour,points;
		
		
		System.out.println("Sistema Sa�de");
		System.out.println();
		System.out.println("Quantas horas de atividade fisica");
		hour=sc.nextDouble();
		if(hour <= 10) {
			points=hour*2.0;
		}else if(hour >10 && hour<20) {
			points=hour*5.0;
		}else {
			points=hour*10;
		}
		double point=points*0.05;
		System.out.println("Voc� conseguiu R$ "+point);
	sc.close();
	}

}
