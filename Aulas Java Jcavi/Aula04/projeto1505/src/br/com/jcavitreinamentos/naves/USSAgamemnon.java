package br.com.jcavitreinamentos.naves;

import br.com.jcavitreinamentos.interfaces.IComandantes;
import br.com.jcavitreinamentos.interfaces.IFrotas;

public class USSAgamemnon extends FrotaEstelar implements IFrotas,IComandantes {

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
		return "USSAgamemnon [nome=" + nome + ", numeroRegistro=" + numeroRegistro + ", registro=" + registro;
	}
	
	public Double poderDaArma() {
		return 5.000;
	}
	@Override
	public Double poderDasArmas() {
		
		return 5.000*3.0;
	}
	@Override
	public String retornarComandantes() {
		// TODO Auto-generated method stub
		return "Picard";
	}
	
	
	
}
