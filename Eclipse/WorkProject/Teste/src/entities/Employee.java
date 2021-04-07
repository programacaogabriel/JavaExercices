package entities;

public class Employee {

	public String name;
	public double n1, n2, n3;
	public double media;

	public double notasFinal() {
		return (n1 + n2 + n3);
	}

	public double aprovadoReprovado() {
		if (notasFinal() < 60.0) {
			return 60.0-notasFinal();
		} else {
			return 0.0;
		}
	}

	public String toString() {
		
		return "Notas Finais "+notasFinal();
				
	}
	

}
