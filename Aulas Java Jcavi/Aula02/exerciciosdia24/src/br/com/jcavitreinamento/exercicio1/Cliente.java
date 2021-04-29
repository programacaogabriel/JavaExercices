package br.com.jcavitreinamento.exercicio1;

public class Cliente {

	private int codigoCliente;
	private String nomeCompleto;
	
	public Cliente() {
		
	}
	

	public Cliente(int codigoCliente) {
		super();
		this.codigoCliente = codigoCliente;
	}


	
	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente+1;
	}


	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", nomeCompleto=" + nomeCompleto + "]";
	}
	
	
	
	
	
}
	
	
