package exerciciosjavaoo;

import javax.swing.JOptionPane;

public class UsaExercicio5OO {

	public static void main(String[] args) {
		
		Exercicio5OO exercicio5 = new Exercicio5OO();
		
		JOptionPane.showMessageDialog(null,"Posto Javali");
		exercicio5.setValorGasolina(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja abastecer R$ ")));
		exercicio5.setGasolina(5.15);
		

		JOptionPane.showMessageDialog(null, exercicio5);
	}

}
