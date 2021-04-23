package exerciciosjava;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		float largura, comprimento, areaTotal;
		//apresentacao	
		JOptionPane.showMessageDialog(null, "Imóbilis imobiliária");


		
			largura = Float.parseFloat(JOptionPane.showInputDialog("Digite a largura do terreno"));
			comprimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento do terreno"));

			//calculo da area total
			areaTotal = largura * comprimento;

			
			JOptionPane.showInputDialog(null, "Area Total", areaTotal);
			JOptionPane.showMessageDialog(null, "Imóbilis, a imobiliária ideal");

	}

}
