package com.bridgelabz.employeeWages;

public class EmployeeWageProblem {
		//Constants
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int WORKING_DAYS = 20;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Variable
			int empWage = 0;
			int empHours = 0;
			int totalWage = 0;
			
			System.out.println("Welcome to Employee Wage Computation Program");
			
			//Computation
			int empCheck = (int)(Math.floor(Math.random()*10) % 3);
			
			switch(empCheck) {
			case IS_PART_TIME :
				System.out.println("Part Time Employee");
				empHours = 4;
				break;
			case IS_FULL_TIME :
				System.out.println("Full Time Employee");
				empHours = 8;
				break;
			default:
				System.out.println("Employee Absent");
				empHours = 0;

			}
			empWage = empHours * EMP_RATE_PER_HOUR;
			totalWage = empWage*WORKING_DAYS;
			System.out.println("Wage per day: "+empWage); 
			System.out.println("Wage per month: "+totalWage);
			
		}
}
