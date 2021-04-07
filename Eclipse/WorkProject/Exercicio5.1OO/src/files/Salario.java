package files;

public class Salario {

	public String name;
	public double tax,grossSalary;
	
	public double netSalary() {
		return grossSalary-tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary +=grossSalary*percentage/100; 
	
	}
	
	public String toString() {
		return name+", "+String.format("%.2f", netSalary());
	}
}
