package utils;

public class Bank {
	private int number;
	private String name;
	private double value;

	public Bank(int number, String name) {
		this.number = number;
		this.name = name;

	}

	public Bank(int number, String name, double value) {
		this.number = number;
		this.name = name;
		addValue(value);
	}

	

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}

	public double addValue(double valorDeposito) {
		return value += valorDeposito;
	}

	public double removeValue(double valorRemovido) {
		return value -= valorRemovido + 5.00;
	}

	public String toString() {
		return "Account number: " + number + ", Holder: " + name + ", Value: $" + value;
	}

}
