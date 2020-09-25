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
			
			//Variable
			int empWage = 0;
			int empHours = 0;
			int totalWage = 0;
			int noOfHour=0;
			int noOfDays=0;
			
			System.out.println("Welcome to Employee Wage Computation Program");
			
			//Computation
			int empCheck = (int)(Math.floor(Math.random()*10) % 3);
			
			switch(empCheck) {
			case IS_PART_TIME :
				System.out.println("Part Time Employee");
				empHours = 4;
				System.out.println("Days\tPerDayHour\tTotalWage");
				while(noOfDays<20) {
					noOfDays++;
					empWage = empHours * EMP_RATE_PER_HOUR;
					totalWage = 20*empWage;
					System.out.println(noOfDays+"\t"+empHours+"\t"+empWage);
				}
				System.out.println("Total wage for 20 days "+totalWage);
				break;
			case IS_FULL_TIME :
				System.out.println("Full Time Employee");
				empHours = 8;
				System.out.println("Days\tPerDayHour\tTotalWage");
				int i=1;
				while(noOfHour<=100) {
					i++;
					empWage = empHours * EMP_RATE_PER_HOUR;
					totalWage = 100*EMP_RATE_PER_HOUR;
					System.out.println(i+"\t"+empHours+"\t"+empWage);
					noOfHour+=8;
				}
				System.out.println("Total wage for 100 Hours "+totalWage);
				break;
			default:
				System.out.println("Employee Absent");
				empHours = 0;

			}
			
		}
}
