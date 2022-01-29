import java.util.*;
class Employee
{
    protected String name;//Protected data member
    protected int age;//Protected data member
    Employee(String name1, int age1)//Constructor
    {
        name = name1;
        age = age1;
    }
    void display()//display() has access to the data members of its class
   {
       System.out.print("\n The name is "+name+" and age is "+age);
   }
}
class Worker extends Employee{
    //Data members
    int hoursWorked;
    int salaryPerHour;
    //Method
    Worker(String name,int age,int hoursWorked1,int salaryPerHour1)//Creating the constructor of Worker()
    {
        super(name,age);//Initialising parent class Employee()
        hoursWorked = hoursWorked1;
        salaryPerHour = salaryPerHour1;
    }
    void display()
    {
        super.display();
        System.out.print("\n The total salary is "+ hoursWorked * salaryPerHour);
    }
}
class Manager extends Employee{
    String department;
    int salary;
    Manager(String name,int age,String department1,int salary1)//Creating the constructor of Manager
    {
        super(name,age);//Initialising parent class Employee()
        department = department1;
        salary = salary1;
    }
    void display()
    {
        //display();
        super.display();
        System.out.print("\n The Department of Manager is "+ department);
        System.out.print("\n Salary of Manager is: "+salary);
    }

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    //Taking user inputs
    System.out.print("\n Please enter the Worker Name: ");
    String emp_name = sc.nextLine();
    System.out.print("\n Please enter the Worker Age: ");
    int emp_age = sc.nextInt();
    System.out.print("\n Please enter the no. of Hours Worked by Worker: ");
    int worker_hrs_worked = sc.nextInt();
    System.out.print("\n Please enter the salary per hour of Worker: ");
    int worker_sal_per_hr = sc.nextInt();
    sc.nextLine();
    System.out.print("\n Please enter the Manager Name: ");
    String man_name = sc.nextLine();
    System.out.print("\n Please enter the Manager Age: ");
    int man_age = sc.nextInt();
    System.out.print("\n Please enter the Department of Manager: ");
    sc.nextLine();//Clearing the buffer
    String manager_dept = sc.nextLine();
    System.out.print("\n Please enter the salary of Manager: ");
    int manager_salary = sc.nextInt();

    Worker worker = new Worker(emp_name,emp_age,worker_hrs_worked,worker_sal_per_hr);//Creating an object of Worker
    Manager manager = new Manager(man_name,man_age,manager_dept,manager_salary);
    //Creating an object of Manager

    worker.display();
    manager.display();
}
}
