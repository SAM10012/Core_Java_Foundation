import java.util.*;
public class factorial_with_recursion
{
public static int Factorial(int n)
{
if(n == 0 || n == 1)
return 1;
else
return n * Factorial(n-1);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();
System.out.println("The factorial of " + n +" is: " + Factorial(n));
}
}