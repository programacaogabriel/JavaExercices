package exerciciosjava;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		int idade,totalDias,dias = 365;
		String name;
		JOptionPane.showMessageDialog(null,"Programa dias vividos");
		
		
		name=JOptionPane.showInputDialog("Digite seu nome");
		idade=Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		totalDias=idade*dias;
		
		JOptionPane.showMessageDialog(null,"Olá "+name+"! \nVocê já viveu "+totalDias+" dias");
	}

}
