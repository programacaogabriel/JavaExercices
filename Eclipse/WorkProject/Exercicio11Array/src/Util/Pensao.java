package Util;

public class Pensao {

	private double aluguel;
	private String name, email;
	private int quartos;

	public Pensao(double aluguel, String name, String email, int quartos) {
		this.aluguel = aluguel;
		this.name = name;
		this.email = email;
		this.quartos = quartos;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setquartos(int quartos) {
		this.quartos = quartos;
	}

	public double getAluguel() {
		return aluguel;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getQuartos() {
		return quartos;
	}
	
	public String toString() {
		return quartos+": "+name+", "+email;
	}
}
