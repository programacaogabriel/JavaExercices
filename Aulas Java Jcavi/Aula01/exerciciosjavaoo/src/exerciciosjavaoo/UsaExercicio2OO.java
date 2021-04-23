package exerciciosjavaoo;

import javax.swing.JOptionPane;

public class UsaExercicio2OO {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null,"Haras Ferraz");
		
		Exercicio2OO exercicio2 = new Exercicio2OO();
		exercicio2.setFerraduras(4);		
		exercicio2.setCavalos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cavalos no haras")));
		
		JOptionPane.showMessageDialog(null, exercicio2);

	}

}
