package exerciciosjavaoo;

public class Exercicio3OO {

	private int numeroPaes, numeroBroas,valorGerado;
	private double paozinho;
	private double broa;
	private double totalPaes, totalBroas,total;
	private double porcentagem;
	
	public int getNumeroPaes() {
		return numeroPaes;
	}
	public void setNumeroPaes(int numeroPaes) {
		this.numeroPaes += numeroPaes;
	}
	public int getNumeroBroas() {
		return numeroBroas;
	}
	public void setNumeroBroas(int numeroBroas) {
		this.numeroBroas += numeroBroas;
	}
	public int getValorGerado() {
		return valorGerado;
	}
	public void setValorGerado(int valorGerado) {
		this.valorGerado = valorGerado;
	}
	public double getPaozinho() {
		return paozinho;
	}
	public void setPaozinho(double paozinho) {
		this.paozinho = paozinho;
	}
	public double getBroa() {
		return broa;
	}
	public void setBroa(double broa) {
		this.broa = broa;
	}
	public double getTotalPaes() {
		return totalPaes;
	}
	public void setTotalPaes(double totalPaes) {
		this.totalPaes = totalPaes;
	}
	public double getTotalBroas() {
		return totalBroas;
	}
	public void setTotalBroas(double totalBroas) {
		this.totalBroas = totalBroas;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	@Override
	public String toString() {
		return "NumeroPaes=" + numeroPaes + "\n"
				+ "NumeroBroas=" + numeroBroas + "\n"
				+ "totalPaes= R$" + totalPaes +"\n"
				+ "totalBroas= R$" + totalBroas + "\n"
				+ "Total= R$" + total + "\n"
				+ "Porcentagem= R$"+ porcentagem ;
	}
	
	
}
