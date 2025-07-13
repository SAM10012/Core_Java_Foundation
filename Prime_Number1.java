import java.util.*;
public class Prime_Number1
{
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 1;
        for(int i=2;i<n/2;i++)
        {
            if(n%i == 0)
             {
                flag = 0;
             }
        }
        if(flag == 1)
        System.out.println("It is a Prime Number");
        else
        System.out.println("It is not a Prime Number");


    }
}