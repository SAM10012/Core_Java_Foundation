// Check whether Palindrome
import java.util.*;
public class palindrome_check
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder new_str = new StringBuilder("");

        for(int i=str.length()-1;i>=0;i--)
        {
            new_str.append(String.valueOf(str.charAt(i)));
        }
        if(str.equals(new_str.toString()) == true)
        {
            System.out.println("Palindrome Status: Yes!");
        }
        else
        {
            System.out.println("Palindrome Status: No!");
        }
    }
}