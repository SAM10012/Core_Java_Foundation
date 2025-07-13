// Reverse a string using String method .reverse()
import java.util.*;
public class rev_string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ss = new StringBuilder("");
        for(int i=0;i<s.length();i++)
        ss.append(String.valueOf(s.charAt(i)));
        System.out.print("The reverse of "+ s + " is: " + String.valueOf(ss.reverse()));
    }
}