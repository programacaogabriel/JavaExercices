package exerciciosjavaoo;

public class Exercicio4OO {
	
	private int idade;
	private int totalDias;
	private int dias;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTotalDias() {
		return totalDias;
	}
	public void setTotalDias(int totalDias) {
		this.totalDias = totalDias;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	@Override
	public String toString() {
		return "Olá "+name+"! \nVocê já viveu "+(idade*dias) + " dias";
	}
	
	

}
