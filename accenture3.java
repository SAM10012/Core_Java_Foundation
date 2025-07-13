// Anagrams  
import java.util.*;
public class accenture3
{
    public static boolean check_anagrams(String s1, String s2)
    {
        if(s1.length() == s2.length())// Length of two anagrams are always equal.
        {
            // Convert the strings to Character Arrays and sort them. If both arrays have exact same elements at exact same positions then they are anagrams.
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
             Arrays.sort(arr1);
             Arrays.sort(arr2);
             if(Arrays.equals(arr1,arr2))
             {
                System.out.print("Anagrams Babyyyy!!!!!!!!");
                return true;
             }
             else
             {
                System.out.print(" Not Anagrams Babyyyy!!!!!!!!");
                return false;
             }
        }
        else
        {
            System.out.print(" Not Anagrams Babyyyy!!!!!!!!");
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();
        check_anagrams(s1,s2);
    }
}