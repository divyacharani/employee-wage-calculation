package com.bridgelabz.employeeWages;

public class EmployeeWageProblem {
		//Constants
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Variable
			int empWage = 0;
			int empHours = 0;
			
			System.out.println("Welcome to Employee Wage Computation Program");
			
			//Computation
			int empCheck = (int)(Math.floor(Math.random()*10) % 3);
			
			if(empCheck==IS_FULL_TIME) {
				empHours = 8;
				System.out.println("Full Time Employee");
			}
			else if(empCheck==IS_PART_TIME) {
				empHours = 4;
				System.out.println("Part Time Employee");
			}
			else {
				empHours = 0;
				System.out.println("Employee Absent");
			}
			empWage = empHours * EMP_RATE_PER_HOUR;
			System.out.println("Wage : "+empWage); 		
			
			

		}

}
