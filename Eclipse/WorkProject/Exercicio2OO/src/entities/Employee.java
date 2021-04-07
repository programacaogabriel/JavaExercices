package entities;

public class Employee {
	
	public String name;
	public double glossSalary;
	public double tax;
	public double percentage;
	
	public double netSalary() {
		return glossSalary-tax;
	}

	public void increaseSalary(double percentage) {
		this.glossSalary+=glossSalary*percentage /100.00;
	}
	
	
	public String toString() {
		return "O funcionário "+name+", $ "+String.format("%.2f",netSalary());
		
	}
}
