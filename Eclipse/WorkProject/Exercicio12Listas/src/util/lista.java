package util;

public class lista {

	private String name;
	private Double salary;
	private Integer id;

	public lista(String name, Double salary, Integer id) {
		this.name = name;
		this.salary = salary;
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void upSalary(double percentage) {
		salary += salary * percentage / 100;
	}

	public String toString() {
		return id + ", " + name + ", " + salary;
	}

	public Object stream() {
		// TODO Auto-generated method stub
		return null;
	}
}
