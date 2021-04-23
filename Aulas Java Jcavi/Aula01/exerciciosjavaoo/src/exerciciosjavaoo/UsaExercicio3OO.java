package exerciciosjavaoo;

import javax.swing.JOptionPane;

public class UsaExercicio3OO {

	public static void main(String[] args) {

		Exercicio3OO exercicio3 = new Exercicio3OO();

		char vendas = 's';
		exercicio3.setBroa(1.50);
		exercicio3.setPaozinho(0.12);

		JOptionPane.showMessageDialog(null, "Bem vindo a Padaria HotPão");

		while (vendas == 's') {

			exercicio3.setValorGerado(
					Integer.parseInt(JOptionPane.showInputDialog(" Item:\n 1= Pães\n 2= Broas\n 3= Finalizar Vendas")));

			switch (exercicio3.getValorGerado()) {
			case 1:
				exercicio3.setNumeroPaes(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de pães")));
				exercicio3.setTotalPaes(exercicio3.getPaozinho() * exercicio3.getNumeroPaes());
				break;
			case 2:
				exercicio3.setNumeroBroas(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de broas")));
				exercicio3.setTotalBroas(exercicio3.getBroa() * exercicio3.getNumeroBroas());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Vendas Finalizadas");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor não definido pelo sistema");
			}
		
		
		
		exercicio3.setTotal(exercicio3.getTotalPaes()+exercicio3.getTotalBroas());
		JOptionPane.showMessageDialog(null,"Sua venda está no valor de "+exercicio3.getTotal());
		
		System.out.println();
	    vendas=JOptionPane.showInputDialog("Deseja repetir a operação S/N").charAt(0);
		}
		JOptionPane.showMessageDialog(null,"Suas vendas geraram o seguinte valor "+exercicio3.getTotal());
		exercicio3.setPorcentagem(exercicio3.getTotal()*0.1);
		
		System.out.println(exercicio3);
	}
	
}
