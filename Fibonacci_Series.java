import java.util.*;
public class Fibonacci_Series
{
    public static void Fibonacci(int n){
        int a=0;
        int b=1;
        int count = 0;
        while(count!=n)
        {
        int c=a+b;
        System.out.print(c + " ");
        a=b;
        b=c;
        count++;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(" 0 1 ");
        Fibonacci(n-2);

    }
}