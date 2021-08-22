package EmployeeWages;

public class EmployeeWage {
	public static void main(String[] args) {
		//Constant
		int emp_time = 1;
		//Obtaining random values
		double checkemp = Math.floor(Math.random() * 10) % 2;
		if (checkemp == emp_time) 
			System.out.println("Employee is present");
		else 
			System.out.println("Employee is absent");
			

	}

}