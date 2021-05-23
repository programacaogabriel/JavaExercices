package br.com.jcavitreinamentos.naves;

public class FrotaEstelar {

	private String classe;
	private String frota;
	
	
	public FrotaEstelar() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}


	public String getFrota() {
		return frota;
	}


	public void setFrota(String frota) {
		this.frota = frota;
	}


	@Override
	public String toString() {
		return "FrotaEstelar [classe=" + classe + ", frota=" + frota + "]";
	}
	
	
	
	
	
}
