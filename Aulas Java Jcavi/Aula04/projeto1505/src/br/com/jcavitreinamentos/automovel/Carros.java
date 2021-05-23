package br.com.jcavitreinamentos.automovel;

import br.com.jcavitreinamentos.interfaces.ICarro;

public class Carros implements ICarro {
	
	public int id;
	public String nomes;
	public int ano;
	
	public Carros() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}


	@Override
	public Double valorCarro() {
		// TODO Auto-generated method stub
		return 20000.00;
	}


	@Override
	public Boolean carroDisponivel() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public Integer qtdCarros() {
		// TODO Auto-generated method stub
		return 3;
	}


	@Override
	public String toString() {
		return "Carros [id=" + id + ", nomes=" + nomes + ", ano=" + ano + ", valorCarro()=" + valorCarro()
				+ ", carroDisponivel()=" + carroDisponivel() + ", qtdCarros()=" + qtdCarros() + "]";
	}

	


	




}
