/*  Perform the function Int calculate(int m, int n). This function needs two positive integers. Calculate the sum of numbers between these two numbers that are divisible by 3 and 5.
Assumption
m > n > = 0

Example

Input:
m: 12
n: 50

Output:
90

Explanation
The numbers between 12 and 50 that are divisible by 3 and 5 are 15, 30, and 45. The sum of these numbers is 90.

Sample input:
m: 100
n: 160

Sample output:
405*/
import java.util.*;
public class accenture5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i=m+1;i<n;i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.print(i +  " ");
                sum = sum + i;
            }
            
        }
        System.out.print("\nThe sum is: " + sum);
    }
}