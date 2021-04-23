package exerciciosjava;

import java.util.Date;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		int dia,mes, totalDias;
		
		JOptionPane.showMessageDialog(null,"Programa dias Vividos 2");
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite seu dia de nascimento"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite seu mês da nascimento"));
		
		totalDias = (dia+(mes-1)*30);
		JOptionPane.showMessageDialog(null, "Você já viveu "+totalDias+" des no inicio do ano");
		
		
		
		
	}

}
