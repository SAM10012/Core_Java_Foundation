import java.util.*;
public class Reverse_String_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder rev_str = new StringBuilder("");
        for(int i = str.length()-1;i>=0;i--)
        {
            rev_str.append(String.valueOf(str.charAt(i)));
        }
        if(str.equals(String.valueOf(rev_str)) == true)
        {
            System.out.println("The string is a palindrome!");
        }
        else
        {
            System.out.println("The string is not a palindrome!");
        }
    }
}