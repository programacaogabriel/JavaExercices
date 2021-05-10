package br.com.jcavitreinamentos.mediaponderada;

public class MediaPonderada {

	private double nota1,nota2;
	private int peso1,peso2;
	
	public MediaPonderada() {
		
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public int getPeso1() {
		return peso1;
	}

	public void setPeso1(int peso1) {
		this.peso1 = peso1;
	}

	public int getPeso2() {
		return peso2;
	}

	public void setPeso2(int peso2) {
		this.peso2 = peso2;
	}
	
	public Double mediaTotal() {
		double valor=((nota1*peso1)+(nota2*peso2))/(peso1+peso2);
		return valor;
	}
	
}
