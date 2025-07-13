import java.util.*;
public class anagrams
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if(str1.length() == str2.length())
        {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int flag = 0;
            for(int i=0;i<str1.length();i++)
            {
            if(arr1[i] == arr2[i])
            {
               //System.out.print(arr1[i] + " " + arr2[i] + "\n");
               flag = 0;
            }
            else
            {
                flag = 1;
                break;
            }
            }
            if(flag == 0)
            System.out.print("The strings are anagrams");
            else
            System.out.print("The strings are not anagrams");
        }
        else
            System.out.print("The strings are not anagrams");
        
    }
}