// Sum of odd numbers and even numbers in a user given input
import java.util.*;
public class sum_of_digits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int even_sum  = 0;
        int odd_sum = 0;
        int rem = 0;
        while(n > 0)
        {
            rem = n % 10;
            if(rem%2 == 0)
            {
                even_sum = even_sum + rem;
            }
            else
            {
                odd_sum = odd_sum + rem;
            }
            n = n/10;
        }
        System.out.print("\nThe sum of even digits in the number is: " + even_sum);
        System.out.print("\nThe sum of odd digits in the number is: " + odd_sum);
    }
}