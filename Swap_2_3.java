import java.util.*;
public class Swap_2_3
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        System.out.println("Before swapping: "+a+" "+b);
        int temp = a;
        a=b;
        b= temp;
        System.out.print("After swapping: "+a+" "+b);

    }
}