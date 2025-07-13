import java.util.*;
public class Star_Pattern_2
{
    public static void main(String[] args)
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=5;j++)
            {
                if(j<i)
                System.out.print("  ");
                else if(j>=i)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}