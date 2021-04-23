package exerciciosjavaoo;

public class Exercicio2OO {

	private int cavalos;
	private int ferraduras;
	private int totalFerraduras;
	public int getCavalos() {
		return cavalos;
	}
	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}
	public int getFerraduras() {
		return ferraduras;
	}
	public void setFerraduras(int ferraduras) {
		this.ferraduras = ferraduras;
	}
	public int getTotalFerraduras() {
		return totalFerraduras;
	}
	public void setTotalFerraduras(int totalFerraduras) {
		this.totalFerraduras = totalFerraduras;
	}
	@Override
	public String toString() {
		return "Total de Ferraduras será de " + cavalos*ferraduras;
	}
	
	
	
	
}
