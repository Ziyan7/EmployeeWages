package EmployeeWages;


public interface ComputeWage {
	public void addCompanyEmpWage(String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH ); //to add employee wage to each company
	public void computeEmpWage(); //defining to compute employee wage in EmpWage class
	public int getTotalWage(String company);
}