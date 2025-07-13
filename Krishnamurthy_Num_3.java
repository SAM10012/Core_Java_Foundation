import java.util.*;
public class Krishnamurthy_Num_3
{
    public static int fact(int n)
    {
        if(n==0)
        return 1;

        return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0)
        {
            int rem = temp%10;
            sum = sum + fact(rem);
            temp = temp / 10;
        }
        if(n == sum)
        System.out.println("It is Krishnamurthy Number");
        else
        System.out.println("It is not Krishnamurthy Number");

    }
}