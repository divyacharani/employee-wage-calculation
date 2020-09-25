package com.bridgelabz.employeeWages;

public class EmployeeWageProblem {
		//Constants
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int WORKING_DAYS = 20;
		public static final int HOURS_LIMIT = 100;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Variables
			int empHours = 0;
			int totalWage = 0;
			int noOfHour=0;
			int noOfDays=0;
			String empType;
			
			System.out.println("Welcome to Employee Wage Computation Program");
			System.out.println("Day\tEmployee Hour\tEmployee Type");
			
			//Computation
			while(noOfHour<=HOURS_LIMIT && noOfDays<=WORKING_DAYS) {
				
				int empCheck = (int)(Math.floor(Math.random()*10) % 3);
				noOfDays++;
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
			totalWage = noOfHour*EMP_RATE_PER_HOUR;
			System.out.println("Total emp Wage: "+totalWage);
		}
}
