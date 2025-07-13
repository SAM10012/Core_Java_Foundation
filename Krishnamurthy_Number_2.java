import java.util.*;
public class Krishnamurthy_Number_2
{
    public static int Fact(int n)
    {
        if(n==0)
        return 1;
        else
        return n*Fact(n-1);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp!=0)
        {
            int rem = temp%10;
        sum = sum + Fact(rem);
        temp = temp/10;
        }
        if(sum == n)
        System.out.println("It is KrishnaMurthy Number");
        else
        System.out.println("It is not KrishnaMurthy Number");


    }
}