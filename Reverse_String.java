import java.util.*;
public class Reverse_String
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder rev = new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--)
        {
             rev.append(String.valueOf(s.charAt(i)));
        }
        if(rev.toString().equals(s) == true)
        {
            System.out.println(s + " and " + rev +" are a palindrome!");

        }
        else
            System.out.println(s + " and " + rev +" are not a palindrome!");


    }
}
