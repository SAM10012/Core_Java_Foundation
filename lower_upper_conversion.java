// All lowercase characters to uppercase and vice versa
import java.util.*;
public class lower_upper_conversion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("The entered string is: " + str);

        String new_str = new String("");
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)) == true)
            {
                new_str = new_str + Character.toUpperCase(str.charAt(i));
            }
            if(Character.isUpperCase(str.charAt(i)) == true)
            {
                new_str = new_str + Character.toLowerCase(str.charAt(i));
            }
            if(Character.isWhitespace(str.charAt(i)) == true)
            {
                new_str = new_str + " ";
            }
        }
        System.out.println("The modified string is: " + new_str);
    }
}