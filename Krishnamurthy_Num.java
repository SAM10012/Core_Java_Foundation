import java.util.*;
public class Krishnamurthy_Num
{
    public static int factorial(int n)
    {
        if(n==0 || n==1)
        return 1;
        else
        return n* factorial(n-1);
    }
    public static void main(String[] args)
    {
        int n = 145;
        int temp = n;
        int sum = 0;
        int rem = 0;
        while(temp > 0)
        {
            rem = temp % 10;
            sum = sum + factorial(rem);
            temp = temp/10;

        }
        if(n == sum)
        System.out.println("Krishnamurthy Number");
        else
        System.out.println("Not Krishnamurthy Number");

    }
}