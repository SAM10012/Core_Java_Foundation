import java.util.*;
public class Triangle_Pattern
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n-r;c++)
            {
                if(r>=10)
                    System.out.print("     ");
                else
                    System.out.print("    ");
                
            }
            for(int k=1;k<=2*r-1;k++)
            {
                if(r>=10)
                    System.out.print( r + "    ");
                else
                    System.out.print(r + "   ");
            }
            System.out.println();
        }
    }
}