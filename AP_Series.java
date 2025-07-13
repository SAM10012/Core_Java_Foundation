/* IBM QUESTION
-----------------
Write a C program to find the sum of A.P(Arithmetic Progression ) series

Input Format:

• The first line contains the first term of the A.P series.

• The second line contains a total number of terms in  A.P series

• The third line contains the common difference of A.P series.

Output Format:

• Sum of the A.P series.

Sample Input:

1

5

2

Sample Output:

256*/
import java.util.*;
class AP_Series
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int sum = ((2*a + (n-1)*d)/2)*n;
        System.out.println(sum);
    }
}