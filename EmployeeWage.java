package EmployeeWages;

public class EmployeeWage {
	public static void main(String[] args) {
		//Constants
		int Is_full_time = 1;
		int Emp_Rate_Perhr = 20;
		//Variables
		int emphr = 0;
		int empwage=0;
		
		double checkemp = Math.floor(Math.random() * 10) % 2;
		if (checkemp == Is_full_time) 
			emphr =8;
		else 
			emphr=0; 
		empwage = emphr * Emp_Rate_Perhr;
		System.out.println("Employee wage" +empwage);
		

	}

}