package files;

public class Notas {
	public String name;
	public double nota1,nota2,nota3;
	
	public double media() {
		return (nota1+nota2+nota3)/3;
	}
	
	public double passou() {
		if(media()<6) {
			return 6-media();
		}else {
			return 0;
		}
	}
	
	
	
	public String toString() {
		return "O aluno "+name +" ficou com nota "+ String.format("%.2f", media());
	}
	

}
