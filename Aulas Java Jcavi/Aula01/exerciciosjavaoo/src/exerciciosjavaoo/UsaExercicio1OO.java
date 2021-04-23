package exerciciosjavaoo;


import javax.swing.JOptionPane;

public class UsaExercicio1OO {

	public static void main(String[] args) {
		Exercicio1OO exercicio1 = new Exercicio1OO();
		
		
		JOptionPane.showMessageDialog(null, "Imóbilis imobiliária");
		
		exercicio1.setComprimento(Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento do terreno")));
		exercicio1.setLargura(Float.parseFloat(JOptionPane.showInputDialog("Digite a largura do terreno")));
		
		JOptionPane.showMessageDialog(null,exercicio1);
		JOptionPane.showMessageDialog(null, "Imóbilis, a imobiliária ideal");
	}

}
