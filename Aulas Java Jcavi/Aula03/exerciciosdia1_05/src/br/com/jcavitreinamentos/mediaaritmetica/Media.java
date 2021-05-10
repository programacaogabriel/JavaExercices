package br.com.jcavitreinamentos.mediaaritmetica;

public class Media {
	private double nota1,nota2;

	public Media() {
		
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
	
	
	public void mediaTotal() {
		double valor=(nota1+nota2)/2;
		System.out.println("O valor da nota é de "+valor);
	}
	

}
