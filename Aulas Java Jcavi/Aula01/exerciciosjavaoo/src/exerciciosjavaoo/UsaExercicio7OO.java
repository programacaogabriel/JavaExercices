package exerciciosjavaoo;

import javax.swing.JOptionPane;

public class UsaExercicio7OO {

	public static void main(String[] args) {
		Exercicio7OO exercicio7 = new Exercicio7OO();
		
		JOptionPane.showMessageDialog(null,"Programa dias Vividos 2");
		
		exercicio7.setDias(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento"))) ;
		exercicio7.setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do nascimento")));
		
		JOptionPane.showMessageDialog(null,exercicio7);

	}

}
