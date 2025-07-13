// Check Password
import java.util.*;
public class accenture8
{
    public static int checkPassword(char[] arr, int n)
    {
        // Atleast 4 characters
        // Atleast 1 digit
        // Atleast 1 Uppercase
        // No slash allowed
        // Starting character must not be a number
        int up = 0;
        int digi = 0;
        int flag = 0;
        if(arr.length >= 4)
        {   
            if(Character.isDigit(arr[0]) == false)
            {
            for(int i=0;i<arr.length;i++)
            {
                if(Character.compare(arr[i],'/') == 0)
                {
                    flag = 1; break;
                }
                else
                {
                    if(Character.isDigit(arr[i]) == true)
                    {
                        digi++;
                    }
                    if(Character.isUpperCase(arr[i]) == true)
                    {
                        up++;
                    }
                }
            }
            if(digi <= 0)
            {
                flag = 1;
            }
            if(up <= 0)
            {
                flag = 1;
            }
            }
            else
            {
                flag = 1;
            }
        }
        else
        {
            flag = 1;
        }

        if(flag == 1)
        return 0;
        else
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int check = checkPassword(arr,s.length());
        if(check == 1)
        System.out.print("\nValid Password!");
        else
        System.out.print("\nInvalid Password!");
    }
}