package br.com.jcavitreinamentos.naves;

import br.com.jcavitreinamentos.interfaces.IComandantes;
import br.com.jcavitreinamentos.interfaces.IFrotas;

public class TPau extends FrotaEstelar implements IFrotas,IComandantes{

	private String nome;
	private String numeroRegistro;
	private String registro;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	@Override
	public String toString() {
		return "TPau [nome=" + nome + ", numeroRegistro=" + numeroRegistro + ", registro=" + registro;
	}
	
	public Double poderDaArma() {
		return 7.000;
	}
	@Override
	public Double poderDasArmas() {
		
		return 7.000*2;
	}
	@Override
	public String retornarComandantes() {
		// TODO Auto-generated method stub
		return "os romulanos";
	}
	
}
