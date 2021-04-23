package exerciciosjavaoo;

public class Exercicio1OO {

	private float largura;
	private float comprimento;
	private float areaTotal;
	
	 
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public float getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal(float areaTotal) {
		this.areaTotal = areaTotal;
	}
	@Override
	public String toString() {
		
		return " Area Total  =  " + largura * comprimento;
	}
	
	
	
}
