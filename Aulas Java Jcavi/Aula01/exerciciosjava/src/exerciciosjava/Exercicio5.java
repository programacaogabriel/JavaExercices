package exerciciosjava;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		double valorGasolina=0,gasolina=5.15, valorTotal=0;
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		JOptionPane.showMessageDialog(null,"Posto Javali");
		valorGasolina = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja abastecer R$"));
		valorTotal=valorGasolina/gasolina;
		
		JOptionPane.showMessageDialog(null,"Você colocou "+decimal.format(valorTotal)+" litros");
		
		
	}

}
