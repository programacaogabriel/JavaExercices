package exerciciosjavaoo;

public class Exercicio5OO {

	private double gasolina;
	private double valorGasolina;
	private double valorTotal;
	
	
	public double getGasolina() {
		return gasolina;
	}
	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}
	public double getValorGasolina() {
		return valorGasolina;
	}
	public void setValorGasolina(double valorGasolina) {
		this.valorGasolina = valorGasolina;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	@Override
	public String toString() {
		return " Você colocou  "+(valorGasolina/gasolina)+" litros" ;
	}
	
	
}
