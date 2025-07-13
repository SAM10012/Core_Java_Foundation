/* IBM QUESTION
------------------
1. Write a program to find HCF of two numbers by without using recursion.

Input format:

The first line contains any 2 positive numbers separated by space.

Output format:

Print the HCF of given two numbers.

Sample Input:

70 15

Sample Output:

5 */
import java.util.*;
class hcf
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        while(m!=n)
        {
            if(m > n)
            {
                m = m - n;
            }
            else if(n > m)
            {
                n = n - m;
            }
        }
        System.out.println(m);
    }
}