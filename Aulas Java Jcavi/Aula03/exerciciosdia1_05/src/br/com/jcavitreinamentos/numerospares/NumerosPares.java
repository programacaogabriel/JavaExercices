package br.com.jcavitreinamentos.numerospares;

public class NumerosPares {

	private int valorInicial;
	private int valorTotal;

	public NumerosPares() {

	}

	public NumerosPares(int valorPar, int valorTotal) {
		super();
		this.valorInicial = valorPar;
		this.valorTotal = valorTotal;
	}

	public int getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void CalcularPar() {
		for (int i = valorInicial; i <=valorTotal; i++) {
			if (i % 2 == 0) {
				if(i==100) {
					System.out.print(i+".");
				}else {
					System.out.print(i + ", ");
				}
				
			}
		}
	}

	@Override
	public String toString() {
		return "Valor Inicial: " + valorInicial + ", valotTotal: " + valorTotal;
	}

}
