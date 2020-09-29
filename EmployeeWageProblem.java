package com.bridgelabz.employeeWages;

public class EmployeeWageProblem {
	//Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	//Attributes
	private int noOfCompany = 0;
	private Company[] companyArray = new Company[3];
	
	public void addCompany(String companyName, int empRatePerHour, int workingDays, int hoursLimit) {
		companyArray[noOfCompany] = new Company(companyName,empRatePerHour,workingDays,hoursLimit);
		noOfCompany++;
	}
	public void wageComputation() {
		for(int i=0;i<noOfCompany;i++) {
			this.computeWage(companyArray[i]);
			System.out.println(companyArray[i]);
		}
	}

	//Computation of employee wages
	public void computeWage(Company obj) {
		//Variables
		int empHours=0, noOfHour=0, noOfDays=0;
		String empType;
		System.out.println("Daily wages for "+obj.getCompanyName()+" is");
		System.out.println("Day\tEmployee Hour\tEmployee Type");
		while(noOfHour<=obj.getHoursLimit() && noOfDays<=obj.getWorkingDays()) {
			int empCheck = (int)(Math.floor(Math.random()*10) % 3);
			noOfDays++;
			//Check whether employee is part time, full time or absent
			switch(empCheck) {
			case IS_PART_TIME :
				empType = "Part Time and present";
				empHours = 4;
				break;
			case IS_FULL_TIME :
				empType = "Full Time and present";
				empHours = 8;
				break;
			default:
				empType = "Employee absent";
				empHours = 0;	
			}
			noOfHour += empHours;
			System.out.println(noOfDays+"\t"+empHours+"\t"+empType);
		}
		obj.setTotalWage(noOfHour*obj.getEmpRatePerHour());
		
	}
	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Welcome message
		System.out.println("Welcome to Employee Wage Computation Program");
		
		EmployeeWageProblem employeeWageObj = new EmployeeWageProblem();
		employeeWageObj.addCompany("Company-A",10,25,100);
		employeeWageObj.addCompany("Company-B",15,20,80);
		employeeWageObj.addCompany("Company-C",20,15,100);
		employeeWageObj.wageComputation();
		
		

	}
}
