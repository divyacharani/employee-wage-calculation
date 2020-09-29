 package com.bridgelabz.employeeWages;

public class Company {
	//Attributes
	private String companyName;
	private int empRatePerHour;
	private int workingDays;
	private int hoursLimit;
	private int totalWage;
	
	//Constructor
	public Company(String companyName, int empRatePerHour, int workingDays, int hoursLimit) {
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.workingDays = workingDays;
		this.hoursLimit = hoursLimit;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getEmpRatePerHour() {
		return empRatePerHour;
	}
	public void setEmpRatePerHour(int empRatePerHour) {
		this.empRatePerHour = empRatePerHour;
	}
	public int getWorkingDays() {
		return workingDays;
	}
	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}
	public int getHoursLimit() {
		return hoursLimit;
	}
	public void setHoursLimit(int hoursLimit) {
		this.hoursLimit = hoursLimit;
	}
	public int getTotalWage() {
		return totalWage;
	}
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public String toString() {
		return "Total Employee wage for Company "+companyName+" is "+totalWage;
	}


}
