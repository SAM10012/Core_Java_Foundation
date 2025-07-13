import java.util.*;
public class Reverse_Integer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(temp!=0)
        {
           int rem = temp%10;
           rev = rev * 10 + rem;
           temp = temp/10;

        }
        if(n==rev)
        System.out.println("It is a palindrome number");
        else
            System.out.println("It is not a palindrome number");



    }
}
