import java.util.*;
public class Armstrong_Num
{
    public static void main(String[] args)
    {
        int n= 2;
        int digits = 0;
        int temp = n;
        int sum = 0;
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = n;
        int rem = 0;
        while(temp>0)
        {
            rem = temp%10;
            sum = sum + (int)Math.pow(rem,digits);
            temp = temp / 10;


        }
        if(n == sum)
        {
            System.out.println("Armstrong Number");

        }
        else
            System.out.println("NOt an Armstrong Number");


    }
}