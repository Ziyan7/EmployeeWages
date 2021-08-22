package EmployeeWages;

public class EmployeeWage 
{
	//instance variables
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME =2;
	private final String company;
	private final int EMP_RATE_PER_HOUR;
	private final int NUM_WORKING_DAYS;
	private final int MAX_HRS_IN_MONTH;
	
	//constructor 
	public EmployeeWage (String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH)
	{
		this.company=company;
		this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
		this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
		
	}
	public static void main(String[] args) 
	{
		//local variables
		int Emp_Hrs=0;
		int Emp_Wage=0;
		int Total_Wage=0;
		int TotalEmpHrs=0;
		int TotalWorkingDays=0;
		
		 //object creation
		EmployeeWage obj1 = new EmployeeWage("YML",20,20,100);      
		
		// Computation
		while(TotalEmpHrs<obj1.MAX_HRS_IN_MONTH && TotalWorkingDays<obj1.NUM_WORKING_DAYS)
		{
			TotalWorkingDays+=1;
			int empCheck=(int) (Math.floor(Math.random()*10)%3);
			switch (empCheck) 
			{
				case  IS_FULL_TIME: 
					Emp_Hrs=16;
					break;
				case IS_PART_TIME: 
					Emp_Hrs=8;
					break;
				default: Emp_Hrs=0;
			}
			TotalEmpHrs+=Emp_Hrs;
			Emp_Wage=Emp_Hrs*obj1.EMP_RATE_PER_HOUR ;
			Total_Wage+=Emp_Wage;
			System.out.println("Employee wage for the company "+obj1.company+" is "+Emp_Wage);
		}
		System.out.println("Total wage is "+Total_Wage);
		System.out.println("Total working hours is "+TotalEmpHrs);
		System.out.println("Total working days is "+TotalWorkingDays);
	}
}