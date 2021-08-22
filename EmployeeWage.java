package EmployeeWages;


public class EmployeeWage {
	public static final int Is_full_time = 2;
	public static final int Is_Part_time = 1;
	public static final int Emp_Rate_Perhr = 20;
	public static final int No_days = 20;
	
	public static void main(String[] args) {
		//Variables
		int emphr = 0;
		int empwage=0;
		int monthlywage=0;
		
		int checkemp =(int) Math.floor(Math.random() * 10) % 3;
		switch (checkemp) {
		case Is_full_time:
			emphr=8; 
			break;
		case Is_Part_time:
			emphr=8; 
		    break;
		default:
			emphr=0;
			break;
		    	
		}
		
		
		empwage = emphr * Emp_Rate_Perhr;
		monthlywage= empwage * No_days;
		System.out.println("Employee wage per month " +monthlywage);


	}

}