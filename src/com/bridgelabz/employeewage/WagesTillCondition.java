package com.bridgelabz.employeewage;
//UC6
public class WagesTillCondition {
	static final int fullDay = 1;
    static final int partTime = 2;
	static final int wagePerHour = 20;
	static final int TotalWorkingdays = 20;
	static final int totalHours = 100;
	
	public static void main(String[] args) {
        int emphrs = 0;
		int totalworkingdays = 0;
		int totalhours = 0;
		while (totalhours <= totalHours &&  totalworkingdays < TotalWorkingdays) {
			totalworkingdays++;
		int employee =(int) Math.floor(Math.random() * 10) % 3;
		switch (employee) {
		case fullDay:
		emphrs =8;
		//System.out.println("Employee work 8 hours in one day for 1 month");
		break;
		case partTime:
		emphrs =7;
        //System.out.println("Employee Part Time wage for 1 month ");
		break;
		default:
		emphrs = 0;
		}
		totalhours += emphrs;
		System.out.println("Days = " + totalworkingdays + " " + "Emp Hours = " + emphrs);
		
		}
		int totalWage = totalhours * wagePerHour;
		System.out.println("Total Wage of employee= " +totalWage);
	}
}
