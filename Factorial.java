import java.util.*;
public class Factorial
{
public static void main(String[] args)
{
System.out.println("Please enter a number: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int temp = n;
int product = 1;
while(n!=0)
{
product = product * n;
n--;
}
System.out.println("The factorial of " + temp + " is " + product + ".");
}
}