import java.util.*;
public class basic_fibonacci_rec_1
{
    static int a=0,b=1,c=0;
    public static int fibonacci(int n)
    {
        if(n>0)
        {
            c=a+b;
            b=c;
            a=b;
            System.out.println(c+" ");
            fibonacci(n-1);
        }
        
    }
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(fibonacci(n-2));
    }
}