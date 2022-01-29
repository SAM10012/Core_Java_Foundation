import java.util.*;
class Employee{
	private int employeeId;
	private static int counter = 1000;
     

	public Employee() {
		employeeId = ++counter;
	}

	public int getEmployeeId() {
		return employeeId;
	}

    public static int getCounter(){
        return counter;
    }
}

public class Test4 {
	public static void main(String[] args) {
		Employee employee1= new Employee();
		Employee employee2= new Employee();
		Employee employee3= new Employee();	
        displayEmployeeDetails(employee1);	
        displayEmployeeDetails(employee2);	
        displayEmployeeDetails(employee3);	
	}

    public static void displayEmployeeDetails(Employee employee){
        System.out.println(employee.getEmployeeId() + " " + Employee.getCounter());
    }
}
 