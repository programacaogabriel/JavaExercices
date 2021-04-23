package exerciciosjavaoo;

public class Exercicio6OO {

	
	private double kgPrato,valorPrato,pesoPrato;
	private int pratoMedio,pratoGrande,pratoPronto;
	
	public double getKgPrato() {
		return kgPrato;
	}
	public void setKgPrato(double kgPrato) {
		this.kgPrato = kgPrato;
	}
	public double getValorPrato() {
		return valorPrato;
	}
	public void setValorPrato(double valorPrato) {
		this.valorPrato = valorPrato;
	}
	public int getPratoMedio() {
		return pratoMedio;
	}
	public void setPratoMedio(int pratoMedio) {
		this.pratoMedio = pratoMedio;
	}
	public int getPratoGrande() {
		return pratoGrande;
	}
	public void setPratoGrande(int pratoGrande) {
		this.pratoGrande = pratoGrande;
	}
	
	
	public double getPesoPrato() {
		return pesoPrato;
	}
	public void setPesoPrato(double pesoPrato) {
		this.pesoPrato = pesoPrato;
	}
	public int getPratoPronto() {
		return pratoPronto;
	}
	public void setPratoPronto(int pratoPronto) {
		this.pratoPronto = pratoPronto;
	}
	@Override
	public String toString() {
		return "O valor do prato ficou em R$ "+valorPrato;
	}

	

		
		
		
	}

