package exerciciosjavaoo;

public class Exercicio7OO {

	private int dias,mes,totalDias;

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = (mes-1)*30;
	}

	public int getTotalDias() {
		return totalDias;
	}

	public void setTotalDias(int totalDias) {
		this.totalDias = totalDias;
	}

	@Override
	public String toString() {
		return "\"Você já viveu "+ (dias + mes) + " dias.";
	}
	
	
	
	
}
