package exerciciosjavaoo;

import javax.swing.JOptionPane;

public class UsaExercicio4OO {

	public static void main(String[] args) {
		Exercicio4OO exercicio4 = new Exercicio4OO();
		
		JOptionPane.showMessageDialog(null, "Programa dias vividos");
		
		exercicio4.setName(JOptionPane.showInputDialog("Digite seu nome"));
		exercicio4.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Agora digite a sua idade")));
		exercicio4.setDias(365);
		
		JOptionPane.showMessageDialog(null, exercicio4);
		
	}

}
