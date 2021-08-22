package EmployeeWages;



public class EmployeeWage {

	public static final int Is_full_time = 2;
	public static final int Is_Part_time = 1;
	public static final int Emp_Rate_Perhr = 20;
	public static final int No_days = 20;
	public static final int Max_No_hours = 100;
	public static final int Max_No_days = 20;
	
	public static void main(String[] args) {
		
		int emphr = 0;
		int tothours=0;
		int totdays=0;
		int totalempsalary=0;
		
		while (tothours<Max_No_hours && totdays<Max_No_days) {
			totdays++;	
		
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
		tothours+=emphr;
		System.out.println("hours" +tothours + "days" +totdays);
		}
		totalempsalary = tothours * Max_No_hours;
		
		System.out.println("total wage" +totalempsalary);
	}

}