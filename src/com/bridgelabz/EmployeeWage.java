package com.bridgelabz;

public class EmployeeWage {
	public static void main(String[] args){
		// Constants
		int IS_PART_TIME = 0;
		int IS_FULL_TIME =1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		int TotalWorkingDay=20;
		int TotalWage=0;
		// Computation
		double empCheck=Math.floor(Math.random()*10)%2;
		switch((int) empCheck) 
		{
		case 0:
			empHrs =4;
			break;
		case 1:
			empHrs = 8;
			break;
		default:
			empHrs=0;
		}
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("emp wage: "+empWage);
		TotalWage=empWage*TotalWorkingDay;
		System.out.println("Total wage is: " + TotalWage);
				
	}
}
