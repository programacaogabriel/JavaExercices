package br.com.jcavitreinamento.exercicio1;

import javax.swing.JOptionPane;

public class UsaPedido {

	public static void main(String[] args) {

		Pedido pedido0 = new Pedido(001,"Gustava", "Processador i9 9900k");
		Pedido pedido1 = new Pedido(002,"Emanoel","Placa m�e Azus XII");
		char chave = 's';
		
		//Apresenta��o
		JOptionPane.showInternalMessageDialog(null, "Pedidos de Envio");

		
		
		System.out.println(pedido0);
		System.out.println(pedido1);

		//troca de Cliente/Descri���o juntamento com repeti��o
		JOptionPane.showMessageDialog(null, pedido0+"\n"+pedido1);
		while (chave == 's') {
			pedido0.setNomeCliente(JOptionPane.showInputDialog("Modifica��o do pedido"+pedido0.getCodigoPedido()+"\nDigite o nome do Cliente"));
			pedido0.setDescricao(JOptionPane.showInputDialog("Digite a nova descri��o do produto"));
			pedido1.setNomeCliente(JOptionPane.showInputDialog("Modifica��o do pedido"+pedido1.getCodigoPedido()+"\nDigite o nome do Cliente"));
			pedido1.setDescricao(JOptionPane.showInputDialog("Digite a nova descri��o do produto"));
			System.out.println(pedido0);
			System.out.println(pedido1);
			
			chave = JOptionPane.showInputDialog("Deseja repetir a opera��o S/N").charAt(0);
		}
		System.out.println();
		System.out.println("O Cliente "+pedido0.getNomeCliente()+" est� solicitando o pedido de "+pedido0.getDescricao());
		System.out.println("O Cliente "+pedido1.getNomeCliente()+" est� solicitando o pedido de "+pedido1.getDescricao());

		

	}

}
///Colocar 2 parametros instanciado
