// Check whether one string is rotation of another
import java.util.*;
public class rotated_string_check
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String conc_str = str1+str1;
        char n = str2.charAt(0);
        int pos = 0;
        int flag = 0;
        if(str1.length() == str2.length())//Checking the lengths of two strings E.g ramanand and andraman will be valid. but ramanand and andramana will not be valid due to different lengths.
        {
        for(int i=0;i<conc_str.length();i++)
        {
            if(Character.compare(n,conc_str.charAt(i)) == 0)//Finding the starting character of string2 in string1+string1.
            {
                pos = i;
                if(str2.equals(conc_str.substring(pos,pos+str2.length())))//If substring matched break out of the loop. String found.
                {
                    flag = 1;//String2 is there.
                    break;
                }
                else//There may be multiple characters in string1+string1 which are the starting character of string2. All will not give the valid string2. Check for all of those.
                {
                    continue;
                }
            }
        }
        if(flag == 1)//String2 is there.
        {
            System.out.println("Yes! " + str2 + " is rotated version of " + str1 + " !");
        }
        else//String2 not found in string1+string1. So not a rotated string.
        {
            System.out.println("Yes! " + str2 + " is not a rotated version of " + str1 + " !");
        }
    }
        else
        {
            System.out.println("Yes! " + str2 + " is not a rotated version of " + str1 + " !");
        }


        
    }
}