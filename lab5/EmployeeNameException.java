package lab5;

public class EmployeeNameException extends Exception{
	String firstName;
	String lastName;
	
	public EmployeeNameException(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public EmployeeNameException(int salary) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeNameException :-"+"[firstName=" + firstName + ", lastName=" + lastName + "]";
	}


}
