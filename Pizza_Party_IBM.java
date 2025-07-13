import java.util.*;
public class Pizza_Party_IBM
{
    public static int Min_Cost(int n)
    {
        int z = 0;
        if(n >= 50)
            z = 50;
        else if(n >= 10)
            z= 10;
        else if(n >= 2)
            z=2;
        else 
            z= 1;

        int num = 0;
        int min_cost = 0;
        if(z == 2)
        {
            num = n/z;
            min_cost = num * 750;
        }
        else if(z == 1)
        {
            num = n/z;
            min_cost = num * 400;
        }
        else if(z == 10)
        {
            num = n/z;
            min_cost = num * 3250;
        }
        else
        {
            num = n/z;
            min_cost = num * 15000;
        }

         if(n%z != 0)
            {
                min_cost = min_cost  + Min_Cost(n%z);
            }
            return min_cost;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

       int ans = Min_Cost(n);
        

        System.out.println("The minimum expense of the pizza party is: "+ans);
    }
}