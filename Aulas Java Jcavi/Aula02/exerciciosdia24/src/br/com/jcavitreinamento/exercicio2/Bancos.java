package br.com.jcavitreinamento.exercicio2;

public class Bancos {

	private double pre�o;
	private String modelo;
	private String fabricante;
	
	public Bancos() {
		
	}

	public Bancos(double pre�o, String modelo, String fabricante) {
		super();
		this.pre�o = pre�o;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
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
		return "Bancos [pre�o=" + pre�o + ", modelo=" + modelo + ", fabricante=" + fabricante + "]";
	}
	
	
	
	
	
	
}
