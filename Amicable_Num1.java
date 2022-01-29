import java.util.*;
public class Amicable_Num1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(",");
        int n1 = Integer.parseInt(arr[0]);
        int n2 = Integer.parseInt(arr[1]);
        int sum1=0, sum2=0;
        for(int i=1;i< n1;i++)
        {
            if(n1 % i == 0)
                sum1 = sum1 + i;
            if(n2 % i == 0)
                sum2 = sum2 + i;
        }
        if(sum1 == n2 && sum2 == n1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}