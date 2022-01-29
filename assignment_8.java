import java.util.*;
class Employee
{
    protected static String name;
    protected static int age;
    Employee(String name1, int age1)
    {
        name = name1;
        age = age1;
    }
    void display()
   {
       System.out.print("\n The name is "+name+"and age is "+age);
   }
}
class Worker extends Employee{
    static int hoursWorked;
    static int salaryPerHour;
    Worker(String name,int age,int hoursWorked1,int salaryPerHour1)
    {
        super(name,age);
        hoursWorked = hoursWorked1;
        salaryPerHour = salaryPerHour1;
    }
    void totalSalary()
    {
        display();
        System.out.print("\n The total salary is "+ hoursWorked * salaryPerHour);
    }
}
class Manager extends Employee{
    static String department;
    static int salary;
    Manager(String name,int age,String department1,int salary1)
    {
        super(name,age);
        department = department1;
        salary = salary1;
    }

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Please enter the Employee Name: ");
    String emp_name = sc.nextLine();
    System.out.println("\n Please enter the Employee Age: ");
    int emp_age = sc.nextInt();
    System.out.println("\n Please enter the no. of Hours Worked by Worker: ");
    int worker_hrs_worked = sc.nextInt();
    System.out.println("\n Please enter the salary per hour of Worker: ");
    int worker_sal_per_hr = sc.nextInt();
    System.out.println("\n Please enter the Department of Manager: ");
    String manager_dept = sc.nextLine();
    System.out.println("\n Please enter the salary of Manager: ");
    int manager_salary = sc.nextInt();

    Worker worker = new Worker(emp_name,emp_age,worker_hrs_worked,worker_sal_per_hr);
    Manager manager = new Manager(emp_name,emp_age,manager_dept,manager_salary);

    worker.totalSalary();
}
}
