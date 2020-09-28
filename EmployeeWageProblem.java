package com.bridgelabz.employeeWages;

public class EmployeeWageProblem {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Welcome message
			System.out.println("Welcome to Employee Wage Computation Program");
			
			//Computation for three companies
			Company companyOne = new Company("Company-A",10,25,100);
			companyOne.computeWage();
			Company companyTwo = new Company("Company-B",15,20,80);
			companyTwo.computeWage();
			Company companyThree = new Company("Company-C",20,15,100);
			companyThree.computeWage();		
			
		}
}
