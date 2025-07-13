import java.util.*;
public class leetcode_palindrome
{
    public static boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        s = s.replace("\"", "");
        s = s.replace("[", "");
        s = s.replace("?", "");
        s = s.replace("!", "");
        s = s.replace(",", "");
        for(int i=0;i<s.length();i++)
        {
            if (!(((int)(s.charAt(i)) >=48 && (int)(s.charAt(i)) <= 57) || (((int)(s.charAt(i)) >=97) && (int)(s.charAt(i)) <=122) && (int)(s.charAt(i)) != 34))
            {
                s = s.replace(String.valueOf(s.charAt(i)),"");
            }
        }

        StringBuilder s1 = new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            s1.append(String.valueOf(s.charAt(i)));
        }
        System.out.println(String.valueOf(s1));
        if(String.valueOf(s1.reverse()).equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean b = isPalindrome(s);
        if(b == true)
        {System.out.print("Yippeeeeeeeeeee!!!!!!!!!!!!!! Palindrome it is!!!!! Dance babyyy!!");
    }
    else
    {
        System.out.print("Nope!");
    }
    }
}