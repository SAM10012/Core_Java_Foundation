import java.util.*;


public class Recursive_Fibonacci
{

public static int fibonacci_calc(int num)
{
if(num ==1 || num == 2)
return 1;
return fibonacci_calc(num-1) + fibonacci_calc(num-2);
}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the no. upto which the series will continue: ");
		int n = sc.nextInt();
		System.out.println("The Fibonacci series using recursion is as follows: ");
		for(int i=1;i<=n;i++)
		{
			System.out.print(fibonacci_calc(i)+" ");
		}
	}
}

