import java.util.*;
public class basic_fibonacci
{
    
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" "+ b);
        //System.out.print(c+" ");
        for(int i=0;i<5-2;i++)
        {
            c=a+b;
            System.out.print(" " +c+" ");
            a=b;
            b=c;
        }
    }
}