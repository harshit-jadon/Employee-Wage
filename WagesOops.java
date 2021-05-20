package com.bridgelabz.employeewage;
import java.util.Random;

public class WagesOops {
	static int employee;
	static int emphrs = 0;
	static int totalworkingdays = 0;
	static int totalhours = 0;
	
	static final int fullDay = 1;
    static final int partTime = 2;
	static final int wagePerHour = 20;
	static final int TotalWorkingdays = 20;
	static int totalHours = 100;
	
	void totalHoursMethod() {
		totalhours += emphrs;
		System.out.println("Days = " + totalworkingdays + " " + "Emp Hours = " + emphrs);
	}
	void totalWageMethod() {
		int totalWage = totalhours * wagePerHour;
		System.out.println("Total Wage of employee= " +totalWage);
	}

	public static void main(String[] args) {
		WagesOops wo1 = new WagesOops();
		
		while (totalhours <= totalHours &&  totalworkingdays < TotalWorkingdays) {
			totalworkingdays++;
		Random random = new Random();
		employee =random.nextInt(10) % 3 ;
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
		wo1.totalHoursMethod();
		wo1.totalWageMethod();
		
	}
		
  }

}
