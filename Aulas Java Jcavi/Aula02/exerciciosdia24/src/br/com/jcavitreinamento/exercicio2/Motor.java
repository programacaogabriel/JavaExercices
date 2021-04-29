package br.com.jcavitreinamento.exercicio2;

public class Motor {
	
	private int potencia;
	private double preço;
	private String fabricante;
	
	public Motor() {
		
	}

	public Motor(int potencia, double preço, String fabricante) {
		super();
		this.potencia = potencia;
		this.preço = preço;
		this.fabricante = fabricante;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Motor [potencia=" + potencia + ", preço=" + preço + ", fabricante=" + fabricante + "]";
	}
	
	
	
	
	

}
