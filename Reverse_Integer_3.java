import java.util.*;
public class Reverse_Integer_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(temp>0)
        {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(n == rev)
        {
            System.out.println("The number is a palindrome!");
        }
        else
        {
            System.out.println("The number is not a palindrome!");
        }
    }
}