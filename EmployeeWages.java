package com.bridgelabz.employeeWages;

public interface EmployeeWages {

	////Method to add company object to companyArray
	public void addCompany(String companyName, int empRatePerHour, int workingDays, int hoursLimit);
	public void wageComputation();
	//Method to Compute of employee wages
	public void computeWage(Company object);
	//Method to get total wage along when queried company
	public Integer totalWageWtihCompany(String companyName) ;
}
