package br.com.jcavitreinamento.exercicio1;

public class Pedido {
	
	private int codigoPedido;
	private String nomeCliente;
	private String descricao;
	
	public void ExerciocioII1() {
		
	}

	public Pedido(int codigoPedido, String nomeCliente, String descricao) {
		super();
		this.codigoPedido = codigoPedido;
		this.nomeCliente = nomeCliente;
		this.descricao = descricao;
	}

	
	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "CodigoPedido= " + codigoPedido+ ", NomeCliente= " + nomeCliente + ", Descricao= "
				+ descricao +".";
	}

	
	
	
	
	

}
