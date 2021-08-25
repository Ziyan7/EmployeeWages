package EmployeeWages;


public class CompanyEmpWage {
		// TODO Auto-generated method stub
	
		public final String company;		//members of class
		public final int empRatePerHour;
		public final int numOfWorkingHours;
		public final int maxHoursInMonth;
		public int Total_Emp_Wage;
		
		//constructor to initialize members of a class
		public CompanyEmpWage(String company,int empRatePerHour,int numOfWorkingHours,int maxHoursInMonth)
		{
			this.company=company;
			this.empRatePerHour=empRatePerHour;
			this.numOfWorkingHours = numOfWorkingHours;
			this.maxHoursInMonth=maxHoursInMonth;	
		}
		public void setTotalEmpWage(int Total_Emp_Wage)
		{
			this.Total_Emp_Wage=Total_Emp_Wage;
		}
		@Override
		public String toString() {
			return "Total Emp Wage for compay: "+company+ "is: "+Total_Emp_Wage;
	}

}