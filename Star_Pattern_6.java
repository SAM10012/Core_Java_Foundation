import java.util.*;
public class Star_Pattern_6
{
    public static void main(String[] args)
    {
        for(int r=1;r<=5;r++)
        {
            for(int b=1;b<=5-r;b++)
            {
                System.out.print("  ");
            }
            for(int c=1;c<=r;c++)
            {
                System.out.print(c + " ");
            }
            for(int c=1;c<r;c++)
            {
                System.out.print(r-c + " ");
            }
            System.out.println();
        }
    }
}