import java.util.*;
public class Factorial_Basic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int product = 1;
        for(int i=1;i<=n;i++)
        {
            product = product * i;
        }
        System.out.println(product);

    }
}