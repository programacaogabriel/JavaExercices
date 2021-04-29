package br.com.jcavitreinamento.exercicio2;

public class Bancos {

	private double preço;
	private String modelo;
	private String fabricante;
	
	public Bancos() {
		
	}

	public Bancos(double preço, String modelo, String fabricante) {
		super();
		this.preço = preço;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Bancos [preço=" + preço + ", modelo=" + modelo + ", fabricante=" + fabricante + "]";
	}
	
	
	
	
	
	
}
