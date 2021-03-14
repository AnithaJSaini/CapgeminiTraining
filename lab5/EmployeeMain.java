package lab5;
import java.util.*;

import lab5.AgeMainClass;

public class EmployeeMain {

	public static void main(String[] args) {
EmployeeMain empsalary=new EmployeeMain();
	System.out.println("Enter the Employee salary");
	Scanner sc=new Scanner(System.in);
	int salary =sc.nextInt();
	AgeMainClass ag=new AgeMainClass();
	boolean sta=false;
	try {
		sta=empsalary.CheckSalary(salary);	
	} catch (Exception e) {
		System.out.println(e);
	}
	
	}
	public boolean CheckSalary(int salary )throws EmployeeNameException
	{

		boolean status = false;
		
		if(salary<3000)
		{
			status = false;
			throw new EmployeeNameException(salary);
		}
		else
		{
			status = true;
			System.out.println("Salary Verified");
		}
		
		return status;
	}

}
