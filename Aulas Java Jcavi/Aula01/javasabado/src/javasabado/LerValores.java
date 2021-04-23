package javasabado;

import javax.swing.JOptionPane;

public class LerValores {

	public static void main(String[] args) {
		int valor1;
		double salario;

		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor par o número"));
		System.out.println("O valor digitado foi: " + valor1);

		//exemplo de JOptionPane com variavel do tipo double
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para o Sálario"));

		
		//apresentando o ShowMessageDialog
		JOptionPane.showMessageDialog(null, "O valor do salário é "+salario);
	
	
	}

}
