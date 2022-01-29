import java.util.*;

class Employee
{
	String empId,empName;
	int salary, jobLevel, bonus;
	Employee(String id, String name, int sal, int level)
	{
		empId = id;
		empName = name;
		salary = sal;
		jobLevel = level;
	}
	
	int calculateBonus(int lev)
	{
		if(lev == 1)
			return 500;
		else if(lev == 2)
			return 800;
		else if(lev == 3)
			return 1100;
		else if(lev == 4)
			return 1500;
		else
			return 0;

	}
	void empDisplay()
	{
		System.out.println("Name			" + empName);
		System.out.println("Employee Id		" + empId);
		System.out.println("Job Level	 	" + jobLevel);
		System.out.println("Salary		        Rs" + salary);
		System.out.println("Bonus	                Rs" + calculateBonus(jobLevel));
		System.out.println("Total Salary		Rs" + (salary + calculateBonus(jobLevel)));
		System.out.println();
	}
}

public class Employee_Demo
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Id of Employee1 :");
		String id1 = sc.nextLine();
		System.out.println();
		System.out.print("Enter the Name of Employee1 :");
		String name1 = sc.nextLine();
		System.out.println();
		System.out.print("Enter the salary of Employee1 :");
		int sal1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter the level of Employee1 :");
		int lev1 = sc.nextInt();
		System.out.println();
		Employee emp1 = new Employee(id1,name1,sal1,lev1);

		System.out.print("Enter the Id of Employee2 :");
		sc.nextLine();
		String id2 = sc.nextLine();
		System.out.println();
		System.out.print("Enter the Name of Employee2 :");
		String name2 = sc.nextLine();
		System.out.println();
		System.out.print("Enter the salary of Employee2 :");
		int sal2 = sc.nextInt();
		System.out.println();
		System.out.print("Enter the level of Employee2 :");
		int lev2 = sc.nextInt();
		System.out.println();
		Employee emp2 = new Employee(id2,name2,sal2,lev2);

		System.out.print("Enter the Id of Employee3 :");
		sc.nextLine();
		String id3 = sc.nextLine();
		System.out.println();
		System.out.print("Enter the Name of Employee3 :");
		String name3 = sc.nextLine();
		System.out.println();
		System.out.print("Enter the salary of Employee3 :");
		int sal3 = sc.nextInt();
		System.out.println();
		System.out.print("Enter the level of Employee3 :");
		int lev3 = sc.nextInt();
		System.out.println();	
		Employee emp3 = new Employee(id3,name3,sal3,lev3);

		emp1.calculateBonus(lev1);
		emp1.empDisplay();
		
		emp2.calculateBonus(lev2);
		emp2.empDisplay();

		emp3.calculateBonus(lev3);
		emp3.empDisplay();


	}
}