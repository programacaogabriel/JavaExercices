package br.com.jcavitreinamento.exercicio2;

public class Pneus {

	private double preco;
	private String tipo;
	private String fabricante;
	
	public Pneus() {
		
	}

	public Pneus(double preco, String tipo, String fabricante) {
		super();
		this.preco = preco;
		this.tipo = tipo;
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Pneus [preco=" + preco + ", tipo=" + tipo + ", fabricante=" + fabricante + "]";
	}
	
	
	
	
}
