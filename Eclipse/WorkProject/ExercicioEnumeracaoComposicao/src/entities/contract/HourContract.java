package entities.contract;

import javax.xml.crypto.Data;

public class HourContract {

	private Data date;
	private Double valuePerHour;
	private Integer hours;

	public HourContract() {

	}

	public HourContract(Data date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Data getdate() {
		return date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setData(Data date) {
		this.date= date;
	}
	public void setValuePerHour(Double valuePerHours) {
		this.valuePerHour=valuePerHours;
	}
	public void setHours( Integer hours) {
		this.hours=hours;
	}
	
	public double totalValue() {
		return valuePerHour*hours;
	}
}
