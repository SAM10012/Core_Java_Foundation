import java.util.Scanner;

class Arithmetic
{
int a,b;
int add(int num1, int num2)
{
a=num1;
b=num2;
return a+b;
}

int subtract(int num1, int num2)
{
a=num1;
b=num2;
if(a>b)
return a-b;
else 
return b-a;
}


int multiply(int num1, int num2)
{
a=num1;
b=num2;
return a*b;
}

int divide(int num1, int num2)
{
a=num1;
b=num2;
if(a>b)
return a/b;
else 
return b/a;
}

}



public class Arithmetic_Operations
{
   public static void main(String args[])
   {   
	Arithmetic problem = new Arithmetic();
        	Scanner sc = new Scanner(System.in);
        while(true)
        {
            
            
            System.out.print("Enter the first number : ");
            int x = sc.nextInt();
            System.out.print("Enter the second number : ");
            int y = sc.nextInt();
            System.out.println("Choose 1 for Addition, 2 for subtraction, 3 for multiplication and 4 for division and 5 for exitting: ");
            
         int n = sc.nextInt();
            
	
switch(n)
            {
                case 1:
                
                
                System.out.println("The result of addition is : "+problem.add(x,y));
                break;
 
                case 2:
                
                System.out.println("The result of subtraction is : "+problem.subtract(x,y));
                break;
 
                case 3:
               
                System.out.println("The result of multiplication is: "+problem.multiply(x,y));
                break;
 
                case 4:
                
                System.out.print("The result of division is : "+problem.divide(x,y));

	break;
 
                case 5:
                System.exit(0);

	default:
	System.out.print("Please enter appropriate input");
 	break;
                
            }
        }
    }
}


