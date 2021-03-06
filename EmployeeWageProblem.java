package com.bridgelabz.employeeWages;
import java.util.*;

public class EmployeeWageProblem implements EmployeeWages{
	//Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	//Attributes
	private ArrayList<Company> companyList = new ArrayList<Company>();
	private Map<Company,Integer> companyToWage=new HashMap<Company,Integer>();
	
	//Method to add company object to companyArray
	public void addCompany(String companyName, int empRatePerHour, int workingDays, int hoursLimit) {
		Company obj = new Company(companyName,empRatePerHour,workingDays,hoursLimit);
		companyList.add(obj);
		
	} 
	//Method to get total wage along when queried company
	public Integer totalWageWtihCompany(String companyName) {
		for(Company obj : companyList) {
			companyToWage.put(obj,obj.getTotalWage());
		}
		Integer totalWage;
		for(Company obj : companyToWage.keySet()) {
			if(obj.getCompanyName().equals(companyName)) {
				totalWage = obj.getTotalWage();
				return totalWage;
			}
		}
		return -1;
		
	}
	public void wageComputation() {
		for(Company obj : companyList) {
			this.computeWage(obj);
			System.out.println(obj);
		}
	}
	//Method to Compute of employee wages
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
		Scanner sc = new Scanner(System.in);
		//Welcome message
		System.out.println("Welcome to Employee Wage Computation Program");
		
		EmployeeWageProblem employeeWageObj = new EmployeeWageProblem();
		employeeWageObj.addCompany("Company-A",10,25,100);
		employeeWageObj.addCompany("Company-B",15,20,80);
		employeeWageObj.addCompany("Company-C",20,15,100);
		employeeWageObj.wageComputation();
		System.out.println("Enter name of the company to get total wage ");
		String compName = sc.nextLine();
		Integer totWage = employeeWageObj.totalWageWtihCompany(compName);
		if(totWage == -1)
			System.out.println("There is no company with name "+compName);
		else
			System.out.println("The total wage of company is "+totWage);
		sc.close();

	}
}
