package EmployeeWages;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeWage implements ComputeWage{
			public static final int IS_PART_TIME=1;
			public static final int IS_FULL_TIME =2;
			
			private LinkedList<CompanyEmpWage> companyEmpWageList;
			private Map<String,CompanyEmpWage> companyToEmpWageMap;
			
			//Constructor 
			public EmployeeWage()
			{
				companyEmpWageList =new LinkedList<>();
				companyToEmpWageMap =new HashMap<>();
				
			}
			
			public void addCompanyEmpWage(String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH)
			{
				CompanyEmpWage companyEmpWage =new CompanyEmpWage(company, EMP_RATE_PER_HOUR,NUM_WORKING_DAYS,MAX_HRS_IN_MONTH);
				companyEmpWageList.add(companyEmpWage);
				companyToEmpWageMap.put(company, companyEmpWage);
			}
			public void computeEmpWage()
			{
				for(int i=0;i<companyEmpWageList.size();i++)
				{
					CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
					companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
					System.out.println(companyEmpWage);
				}
			}

			//method for calculating employee wages for different companies
			private int computeEmpWage(CompanyEmpWage companyEmpWage)
			{	
				//local variables
						int Employee_Hrs=0;
						int TotalEmpHrs=0;
						int TotalWorkingDays=0;
						int dailywage=0;
					//computation
						while(TotalEmpHrs<=companyEmpWage.maxHoursInMonth && TotalWorkingDays<companyEmpWage.numOfWorkingHours)
						{
							TotalWorkingDays+=1;
							int empCheck=(int) (Math.floor(Math.random()*10)%3);
							switch (empCheck) 
							{
								case  IS_FULL_TIME: Employee_Hrs=16;break;
								case IS_PART_TIME: Employee_Hrs=8;break;
								default: Employee_Hrs=0;
							}
							TotalEmpHrs+=Employee_Hrs;
							System.out.println("Day#: "+TotalWorkingDays+" Emp Hr: "+TotalEmpHrs);
							dailywage=Employee_Hrs*companyEmpWage.empRatePerHour;
							System.out.println("Daily wage is "+dailywage);
						}
							return TotalEmpHrs*companyEmpWage.empRatePerHour;
							
			}
			
			public static void main(String[] args) 
			{

				EmployeeWage empWageBuilder =new EmployeeWage();
				
				empWageBuilder.addCompanyEmpWage("YML",20,2,10);
				empWageBuilder.addCompanyEmpWage("DMart",10,4,20);
				empWageBuilder.computeEmpWage();
			}

}

