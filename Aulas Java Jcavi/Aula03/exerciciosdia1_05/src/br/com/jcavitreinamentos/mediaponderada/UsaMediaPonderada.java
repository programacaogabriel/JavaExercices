package br.com.jcavitreinamentos.mediaponderada;

import javax.swing.JOptionPane;

public class UsaMediaPonderada {

	public static void main(String[] args) {
	
		Double nota1=0.0,nota2=0.0;
		int peso1,peso2;
		
	
		MediaPonderada mediaP = new MediaPonderada();
		
		
		//apresentacao
		JOptionPane.showMessageDialog(null, "Media Ponderada");
		
		
		//Capturando dados
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		peso1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro peso"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		peso2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo peso"));
		
		mediaP.setNota1(nota1);
		mediaP.setNota2(nota2);
		mediaP.setPeso1(peso1);
		mediaP.setPeso2(peso2);
		
		//final
		System.out.println("A media final é de : "+mediaP.mediaTotal());
		
		
		
	}

}
