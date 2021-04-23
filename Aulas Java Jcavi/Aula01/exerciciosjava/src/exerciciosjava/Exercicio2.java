package exerciciosjava;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		int cavalos,ferraduras=4,totalFerraduras;
		
		
		// apresentacao
		JOptionPane.showMessageDialog(null,"Haras Ferraz");
		
		cavalos= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cavalos no haras"));
		totalFerraduras=cavalos*ferraduras;
		
		JOptionPane.showMessageDialog(null,"Total de Ferraduras será de "+totalFerraduras);
		
	}

}
