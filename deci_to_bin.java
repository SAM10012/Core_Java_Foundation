/* IBM QUESTION
-----------------
Change Decimal Number to Binary */
import java.util.*;
class deci_to_bin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i=0;
        int[] binary = new int[10];
        while(input!=0)
        {
            int rem = input % 2;
            binary[i] = rem;
            input = input / 2;
            i++;
        }
        StringBuilder final1 = new StringBuilder("");
        for(int j=i-1;j>=0;j--)
        {
            final1.append(String.valueOf(binary[j]));
        }
        System.out.println(final1);
        
    }
}