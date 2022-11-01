package com.bridgelabz;

public class EmployeeWage {
	public static void main(String[] args){
		// Constants
		int IS_PART_TIME = 0;
		int IS_FULL_TIME =1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		int totalWorkingDays=0;
		int totalEmpHour=0;
		int TotalWage;
		// Computation
		  while(totalEmpHour <= 100 && totalWorkingDays <= 19) {
	            totalWorkingDays++ ;

		
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
		totalEmpHour += empHrs;
		System.out.println("Days: "+totalWorkingDays);
		System.out.println("emp hours: "+empHrs);
		}
		TotalWage=totalEmpHour*EMP_RATE_PER_HOUR;
		System.out.println("Total wage is: " + TotalWage);
				
	}
}
