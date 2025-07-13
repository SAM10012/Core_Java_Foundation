import java.util.*;
public class Finonacci_Series_Using_Recursion
{
    static int a=0,b=1,c=0;
    public static void Fibonacci_recursion(int n)
    {
    
    if(n>0)
    {
        
        c=a+b;
        a=b;
        b=c;
        System.out.print(c+" ");
        Fibonacci_recursion(n-1);
    }
}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("0 1 ");
        Fibonacci_recursion(n-2);
    }
}