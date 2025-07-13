import java.util.*;
public class Armstrong_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int digits = 0;
        while(temp>0)
        {
            digits++;
            temp = temp/10;
        }
        int temp1 = n;
        int sum = 0;
        while(temp1!=0){
            int rem = temp1%10;
            sum = sum + (int)Math.pow(rem,digits);
            temp1 = temp1/10;

        }
        if(sum == n)
        System.out.println(n+" is an Armstrong Number!");
        else
        System.out.println(n+" is not an Armstrong Number!");
    }
}