import java.util.*;
public class Swap_1_3
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        System.out.println("Before swapping: "+a+" "+b);
        a = a+b;
        b= a-b;
        a = a-b;
        System.out.print("After swapping: "+a+" "+b);

    }
}