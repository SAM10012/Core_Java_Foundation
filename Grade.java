import java.util.*;

public class Grade
{
	public static void main(String[] args)
	{
		int marks;
		Scanner sc=new Scanner(System.in);  
		System.out.println("Please enter the marks: ");
		marks= sc.nextInt();  


		 if(marks<0 || marks>100)
		{
			System.out.println("The grade of the student is Z (invalid)");
		}
		else if(marks >= 90)
		{
			
			System.out.println("The grade of the student is O");
		}

		else if(marks>= 80 && marks<90)
		{
			
			System.out.println("The grade of the student is E");
		}

		else if(marks>= 70 && marks<80)
		{
			
			System.out.println("The grade of the student is A");
		}

		else if(marks>= 60 && marks<70)
		{
			
			System.out.println("The grade of the student is B");
		}

		else if(marks>= 50 && marks<60)
		{
			System.out.println("The grade of the student is C");
		}

		else if(marks<50)
		{
			System.out.println("The grade of the student is F");
		}

		
	}
	}