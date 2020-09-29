 package com.bridgelabz.employeeWages;

public class Company {
	//Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	//Attributes
	private String companyName;
	private int empRatePerHour;
	private int workingDays;
	private int hoursLimit;
	private int totalWage;
	private String empType;
	
	//Constructor
	public Company(String companyName, int empRatePerHour, int workingDays, int hoursLimit) {
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.workingDays = workingDays;
		this.hoursLimit = hoursLimit;
	}
	
	//Computation of employee wages
	public void computeWage() {
		//Variables
		int empHours=0, noOfHour=0, noOfDays=0;
		System.out.println("Daily wages for "+companyName+" is");
		System.out.println("Day\tEmployee Hour\tEmployee Type");
		while(noOfHour<=hoursLimit && noOfDays<=workingDays) {
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
		totalWage = noOfHour*empRatePerHour;
		
	}
	public String toString() {
		return "Total Employee wage for Company "+companyName+" is "+totalWage;
	}


}