package com.bridgelabz.employeeWages;

public class EmployeeWageProblem {
	//Constants
	public static final int IS_PRESENT = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Welcome message
		System.out.println("Welcome to Employee Wage Computation Program");
		
		int empCheck = (int)(Math.floor(Math.random()*10) % 2);
		
		if(empCheck==IS_PRESENT) {
			System.out.println("Employee Present");
		}
		else {
			System.out.println("Employee Absent");
		}
		
		

	}

}
