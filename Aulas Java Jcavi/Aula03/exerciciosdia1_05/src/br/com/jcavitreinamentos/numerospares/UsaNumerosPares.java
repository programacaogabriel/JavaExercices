package br.com.jcavitreinamentos.numerospares;

import javax.swing.JOptionPane;

public class UsaNumerosPares {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Inserido com par�metros
		NumerosPares pares = new NumerosPares(0, 100);
		
		
		//apresentacao
		JOptionPane.showMessageDialog(null, "Sistema de N�merosPares");
		
		//Mostrando resultados
		JOptionPane.showMessageDialog(null, pares);
		pares.CalcularPar();
		
	
		
		
		
	}

}
