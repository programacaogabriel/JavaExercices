package br.com.jcavitreinamentos.mediaaritmetica;

import javax.swing.JOptionPane;

public class UsaMedia {

	public static void main(String[] args) {
	Media media = new Media();
	
	//Apresentacao
	JOptionPane.showMessageDialog(null, "Calculo da media");
	
	
	//Recolhimento de dados
	Double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira nota"));
	Double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira nota"));
	media.setNota1(nota1);
	media.setNota2(nota2);
	
	
	media.mediaTotal();
	
	
	
	}

}
