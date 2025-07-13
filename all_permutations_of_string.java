// All permutations of a string
import java.util.*;
public class all_permutations_of_string
{
    public static int fact(String s)
    {
        // No repeatation of characters in the string
        int n = s.length();
        int factorial = 1;
        for(int i=1;i<=n;i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static char[] Swap(int i, int j, char[] arr)
    {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
        char[] ret_str = arr;
        return ret_str;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int i=0;
        int k=0;
        //System.out.println(fact(str));
        System.out.println("The permutations of " + str +" are as follows: ");
        for(int j=0;j<str.length() && k < fact(str);j++)
        {
            if(i != j)
            {
                char[] modi_str = Swap(i,j,arr);
                String fs = String.valueOf(modi_str);
                System.out.println(String.valueOf(k+1) + " " +fs);
                k++;
                if(j == str.length()-1)
                {
                    j=0;
                }
            }
        }
        
    }

}