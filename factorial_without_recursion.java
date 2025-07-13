import java.util.*;
public class factorial_without_recursion
{
public static int Factorial(int n)
{
int fact = 1;
for(int i=1;i<=n;i++)
{
fact = fact*i;
}
return fact;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();
System.out.println("The factorial of " + n +" is: " + Factorial(n));
}
}