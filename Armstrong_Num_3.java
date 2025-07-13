import java.util.*;
public class Armstrong_Num_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = 0;
        int temp = n;
        while(temp>0)
        {
            temp = temp / 10;
            digits++;
        }
        int num = n;
        int sum = 0;
        int rem = 0;
        while(num>0)
        {
            rem = num%10;
            sum = sum + (int)Math.pow(rem,digits);
            num = num/10;
        }
        if(n==sum)
        System.out.println("It is an Armstrong Number!");
        else
        System.out.println("It is not an Armstrong Number!");
    }
}