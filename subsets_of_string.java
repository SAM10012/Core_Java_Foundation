// Java Program to find all subsets of a string.
import java.util.*;
public class subsets_of_string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j= i+1;j<=str.length();j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
}