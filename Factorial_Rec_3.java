import java.util.*;
public class Factorial_Rec_3
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
        int n= sc.nextInt();
        int prod = fact(n);
        System.out.println(prod);
    }
}