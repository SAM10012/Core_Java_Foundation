nimport java.util.*;
public class Recursive_Fibonacci_Num_3
{
    static int a=0,b=1,c=0;
    public static int Fib(int n)
    {
        if(n==0 || n==1)
        return 1;
        else
        return Fin(n-1)+Fib(n-2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.print("0 1 ");
        int ans = Fib(n-2);
        System.out.println(ans);
    }
}