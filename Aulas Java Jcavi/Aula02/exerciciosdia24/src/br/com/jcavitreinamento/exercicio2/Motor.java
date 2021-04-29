package br.com.jcavitreinamento.exercicio2;

public class Motor {
	
	private int potencia;
	private double pre�o;
	private String fabricante;
	
	public Motor() {
		
	}

	public Motor(int potencia, double pre�o, String fabricante) {
		super();
		this.potencia = potencia;
		this.pre�o = pre�o;
		this.fabricante = fabricante;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Motor [potencia=" + potencia + ", pre�o=" + pre�o + ", fabricante=" + fabricante + "]";
	}
	
	
	
	
	

}
