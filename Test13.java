import java.util.*;
class Employee {
	public String name;
	public char gender;
	public double salary;

	public Employee(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public Employee(String name) {
		this.name = name;
	}

}

public class Test13 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Robert", 'M');
		Employee emp2 = new Employee("Alex");
		System.out.println(emp2.name + ',' + emp2.gender + ',' + emp1.name);
	}

}
 