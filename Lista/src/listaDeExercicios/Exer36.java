package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		/*36) Um programa de vida saudável quer dar pontos atividades físicas que podem
	ser trocados por dinheiro. O sistema funciona assim:
	 - Cada hora de atividade física no mês vale pontos
	 - até 10h de atividade no mês: ganha 2 pontos por hora
	 - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
	 - acima de 20h de atividade no mês: ganha 10 pontos por hora
	 - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)*/
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double hour,points;
		
		
		System.out.println("Sistema Saúde");
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
		System.out.println("Você conseguiu R$ "+point);
	sc.close();
	}

}
