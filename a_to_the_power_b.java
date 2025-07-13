// Last digit of a to the power b, where a and b are user inputs.
import java.util.*;
public class a_to_the_power_b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        long power = (long)Math.pow(a,b);
        long last_digit = power%10;
        System.out.print("\nThe last digit is: " + last_digit);
        //System.out.print("\nThe sum of odd digits in the number is: " + odd_sum);
    }
}