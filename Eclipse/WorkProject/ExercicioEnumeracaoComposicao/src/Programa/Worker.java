package Programa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.contract.HourContract;
import entities.department.Department;
import entities.enums.WorkLevel;

public class Worker {

	private String name;
	private WorkLevel level;
	private Double baseSalary;
	private Department department;
	private List <HourContract> contracts = new ArrayList<HourContract>();
	
	
	public Worker(String name, WorkLevel level, Double baseSalary,Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department=department;
	}

	

	public Worker(String workerName, String valueOf, double baseSalary2, Department department2) {
		// TODO Auto-generated constructor stub
	}



	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}

	public WorkLevel getLevel() {
		return level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	public void income(int year, int month) {
		@SuppressWarnings("unused")
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime((Date) c.getdate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1+ cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum +=c.totalValue();
			}
		}
		
	}
}
