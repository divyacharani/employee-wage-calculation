package com.bridgelabz.employeeWages;

public class EmployeeWageProblem {
	//Constants
		public static final int IS_PRESENT = 1;
		public static final int EMP_RATE_PER_HOUR = 20;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Variable
			int empWage = 0;
			int empHours = 0;
			
			System.out.println("Welcome to Employee Wage Computation Program");
			
			//Computation
			int empCheck = (int)(Math.floor(Math.random()*10) % 2);
			
			if(empCheck==IS_PRESENT) {
				empHours = 8;
				System.out.println("Employee Present");
			}
			else {
				empHours = 0;
				System.out.println("Employee Absent");
			}
			empWage = empHours * EMP_RATE_PER_HOUR;
			System.out.println("Wage : "+empWage); 		
			
			

		}
		
		

	

}
