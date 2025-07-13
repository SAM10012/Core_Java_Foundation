import java.util.*;
public class rev_int{
    public static void main(String[] args)
    {
        int temp = 121;
        int n = temp;
        int rev = 0;
        int rem = 0;
        while(n!=0)
        {
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if( temp == rev)
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");

    }
}