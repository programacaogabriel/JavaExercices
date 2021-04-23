package exerciciosjavaoo;

import javax.swing.JOptionPane;

public class UsaExercicio6OO {

	public static void main(String[] args) {
	Exercicio6OO exercicio6 = new Exercicio6OO();
	
	exercicio6.setKgPrato(12.00);
	exercicio6.setPratoMedio(1);
	exercicio6.setPratoGrande(2);
	
	

	JOptionPane.showMessageDialog(null, "Restaurante BEM-BÂO");
	JOptionPane.showMessageDialog(null, "Cobramos R$ 12,00 kg");
	
	
	exercicio6.setPratoPronto(Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do prato escolhido:\n1 - Prato Medio\n2 -PratoGrande ")));
	exercicio6.setPesoPrato(Double.parseDouble(JOptionPane.showInputDialog("Informar o peso do prato\nExemplo: 0.000 ")));
	
	
	while (exercicio6.getPesoPrato()> 3.000) {

		if (exercicio6.getPesoPrato() > 2.000) {
			JOptionPane.showMessageDialog(null, "Você deverá pesar um prato de cada vez");
		}
		exercicio6.setPesoPrato(Double.parseDouble(JOptionPane.showInputDialog("Informar o peso do prato\nExemplo: 0.000 ")));
	}
	JOptionPane.showMessageDialog(null, "Peso informado com sucesso");
	
	

	if (exercicio6.getPratoPronto() == exercicio6.getPratoMedio()) {
		exercicio6.setValorPrato(exercicio6.getKgPrato()*(exercicio6.getPesoPrato()- 0.500));
	} else if (exercicio6.getPratoPronto() == exercicio6.getPratoGrande()) {
		exercicio6.setValorPrato(exercicio6.getKgPrato()*(exercicio6.getPesoPrato() -0.800));
	}

	JOptionPane.showMessageDialog(null, exercicio6);
	
	}

}
