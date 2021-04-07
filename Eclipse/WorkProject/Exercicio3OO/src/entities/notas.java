package entities;

public class notas {

	public double notas;
	public String name;
	public double n1,n2,n3;
	
	public double media() {
		return n1+n2+n3;
	}
	
	public double mediaF() {
		if(media()<60.00) {
			return 60.00 - media();
		}else {
			return 0.0;
		}
	}
	
	public String toString() {
		return "Final Grade: "+ media();
	}
}
