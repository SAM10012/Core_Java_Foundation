// Java Program to divide a string in 'N' equal parts.
import java.util.*;
public class equal_parts_of_string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String str = sc.nextLine();
        System.out.print("Please enter the no. of parts: ");
        int n = sc.nextInt();
        if(str.length() % n == 0)
        {
            System.out.println("The string can be divided into " + n + " equal parts.");
            int parts = str.length()/n;
            for(int i=0;i<str.length();i+= parts)
            {
                System.out.println(str.substring(i,i+parts));
            }
        }
        else
        {
            System.out.print("\nThe string cannot be divided into " + n + " equal parts. Sorry!");
        }

    }
}