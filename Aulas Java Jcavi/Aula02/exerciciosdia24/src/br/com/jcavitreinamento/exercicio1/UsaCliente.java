package br.com.jcavitreinamento.exercicio1;

import javax.swing.JOptionPane;

public class UsaCliente {

	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente();
		cliente1.setCodigoCliente(10101);
		cliente1.setNomeCompleto("Gustavo");

		Cliente cliente2 = new Cliente();
		cliente2.setCodigoCliente(10111);
		cliente2.setNomeCompleto("Emanoel");

		//Apresenta��o de mudan�a de nomes
		JOptionPane.showMessageDialog(null,"Cliente solicitados\n"+ cliente1.getNomeCompleto() + "\n" + cliente2.getNomeCompleto());
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		//Mudan�a dos nomes dos Clientes
		JOptionPane.showMessageDialog(null, "Mudand�a de Nomes dos Cliente, necessitamos o nome completo");
		cliente1.setNomeCompleto(JOptionPane.showInputDialog("Altera��o do nome "+cliente1.getNomeCompleto()+"\nDigite o nome do completo"));
		cliente2.setNomeCompleto(JOptionPane.showInputDialog("Altera��o do nome "+cliente2.getNomeCompleto()+"\nDigite o nome do completo"));
		
		//Imprimindo os nomes completos
		JOptionPane.showMessageDialog(null,"Altera��o realizada com sucesso\n"+ cliente1.getNomeCompleto() + "\n" + cliente2.getNomeCompleto());
		System.out.println();
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		
		
	}

}
