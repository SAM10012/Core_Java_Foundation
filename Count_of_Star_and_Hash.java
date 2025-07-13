/*QUESTION
------------
Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.

 

Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
 

Example 1:

Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal */
import java.util.*;
class Count_of_Star_and_Hash
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int star_count = 0,hash_count = 0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i) == '*')
            {
                star_count += 1;
            }
            else if(input.charAt(i) == '#')
            {
                hash_count += 1;
            }
        }
        if(star_count == hash_count)
        {
            System.out.println("0");
        }
        else if(star_count > hash_count)
        {
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
    }
}