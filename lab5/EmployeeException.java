package lab5;

public class EmployeeException {
	int salary;

	public EmployeeException(int salary) {
		this.salary = salary;
	};
	public String toString() {
		return "EmployeeSalaryException :-"+"Employee's salary is  "+salary+" it is less then 3000";
	}



}
