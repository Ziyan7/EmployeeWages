package EmployeeWages;

public class EmployeeWage 
{
	
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME =2;
	
	//instance Variable
	private final String company;
	private final int EMP_RATE_PER_HOUR;
	private final int NUM_WORKING_DAYS;
	private final int MAX_HRS_IN_MONTH;
	private int Total_Wage;
	//constructor
	public EmployeeWage(String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH)
	{
		this.company=company;
		this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
		this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
		
	}
	//For calculating employee wages for different companies
	public void wageCalculator()
	{
		//local variables
		int Emp_Hrs=0;
		int Emp_Wage=0;
		int TotalEmpHrs=0;
		int TotalWorkingDays=0;
		while(TotalEmpHrs<MAX_HRS_IN_MONTH && TotalWorkingDays<NUM_WORKING_DAYS)
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
				Emp_Wage=Emp_Hrs*EMP_RATE_PER_HOUR ;
				Total_Wage+=Emp_Wage;
				System.out.println("Employee wage for the company "+company+" is "+Emp_Wage);
			}
		System.out.println("Total working hours is "+TotalEmpHrs);
		System.out.println("Total working days is "+TotalWorkingDays);
		
	}
	
	@Override
	public String toString() {
		return "Total Emp Wage for compay: "+company+ "is: "+Total_Wage;
	}
	
	public static void main(String[] args) 
	{

		
		
		EmployeeWage YML = new EmployeeWage("YML",20,20,100);//object creation for company 1
		EmployeeWage DMart = new EmployeeWage("DMart",10,20,150);//object creation for company 2
		EmployeeWage Reliance = new EmployeeWage("Reliance",30,20,100);//object creation for company 3
		// Computation
		YML.wageCalculator();
		System.out.println(YML);
		DMart.wageCalculator();
		System.out.println(DMart);
		Reliance.wageCalculator();
		System.out.println(Reliance);
	}
}