import java.util.*;
class Candy_Jar{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=10,k=5;
        int order = sc.nextInt();
        if(order > n)
        {
            System.out.println("INVALID INPUT");
        }
        int rem = n-order;
        if(rem == k)
        {
            n = rem + (n - k);
        }
        else
        {
            System.out.println(order);
            System.out.println(n-order);
        }
    }
}