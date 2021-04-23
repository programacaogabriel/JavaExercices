package exerciciosjava;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		DecimalFormat decimal = new DecimalFormat("0.00");
		double kgPrato = 12.00,valorPrato=0;
		int pratoMedio = 1, pratoGrande = 2;
		

		JOptionPane.showMessageDialog(null, "Restaurante BEM-BÂO");
		JOptionPane.showMessageDialog(null, "Cobramos R$ 12,00 kg");

		int pratoPronto = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do prato escolhido:\n1 - Prato Medio\n2 -PratoGrande "));
		double pesoPrato = Double.parseDouble(JOptionPane.showInputDialog("Informar o peso do prato\nExemplo: 0.000 "));

		while (pesoPrato > 3.000) {

			if (pesoPrato > 2.000) {
				JOptionPane.showMessageDialog(null, "Você deverá pesar um prato de cada vez");
			}
			pesoPrato = Double.parseDouble(JOptionPane.showInputDialog("Informar o peso do prato\nExemplo: 0.000 "));
		}
		JOptionPane.showMessageDialog(null, "Peso informado com sucesso");

		
		
		if (pratoPronto == pratoMedio) {
			valorPrato = kgPrato*(pesoPrato - 0.500);
		} else if (pratoPronto == pratoGrande) {
			valorPrato = kgPrato*(pesoPrato -0.800);
		}

		
		JOptionPane.showMessageDialog(null, "O valor de sua refeição ficou em R$ "+decimal.format(valorPrato));
	}

}
