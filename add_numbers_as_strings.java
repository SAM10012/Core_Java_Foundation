// Adding Numbers as Strings.
import java.util.*;
public class add_numbers_as_strings
{
    public static String Reverse(StringBuilder z)// Reverse the answer as we are storing from right to left and numbers should be read from left to right.
    {
        StringBuilder rev = new StringBuilder("");
        for(int i=z.length()-1;i>=0;i--)
        {
            rev.append(String.valueOf(z.charAt(i)));
        }
        return String.valueOf(rev);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // User input numbers are taken as string.
        System.out.print("Enter the first number: ");
        String s1 = sc.nextLine();
        System.out.print("\nEnter the second number: ");
        String s2 = sc.nextLine();
        int i = s1.length()-1;
        int j = s2.length()-1;
        // StringBuilder output.
        StringBuilder ans = new StringBuilder("");
        int carry = 0;// carry is zero initially. School method of addition.
        do // Break out of loop when there is no more digits in both the numbers. i and j
        // are the indexes of the numbers as strings, so when they become < 0, there is no more digits left.
        {
            if(i>=0 && j>= 0) // Both the numbers have digits
            {
                ans.append(String.valueOf((char)(((int)s1.charAt(i) - 48 + (int)s2.charAt(j) - 48 + carry)%10 + 48)));// We are dealing with the ascii values. So remember to typecast. [(int)s1.charAt(i) - 48] => ascii value of the character - 48 which is ascii value of zero gives the number in integer form.
                // %10 gives the last digit of the sum
                // +48 is for converting the integer to corresponding ascii of the character.
                // Convert all of this back to int otherwise it will be taken as integer.
                // Append can be done only on string so convert the character back to string 
                // And append with the ans.
                carry = ((int)s1.charAt(i) - 48 + (int)s2.charAt(j) - 48 + carry)/10;
                // /10 gives the carry. No need to convert this integer as it will be added in the form of integer only.
                //System.out.print("\n....."+ String.valueOf((char)(((int)s1.charAt(i) - 48 + (int)s2.charAt(j) - 48 + carry)%10 + 48)));
                i--;// travelling from right to left as in school addition.
                j--;
            }
            else if(i>=0 && j<0)// 2nd no. has no more digits but first number has.
            {
                ans.append(String.valueOf((char)(((int)s1.charAt(i) - 48 + carry)%10 + 48)));
                carry = ((int)s1.charAt(i) - 48 + carry)/10;
                i--;
            }
            else if(j>=0 && i<0)// 1st no. has no more digits but 2nd number has.
            {
                ans.append(String.valueOf((char)(((int)s2.charAt(j) - 48 + carry)%10 + 48)));
                carry = ((int)s2.charAt(j) - 48 + carry)/10;
                j--;
            }
        }while(i>=0 || j>=0);// If any of the numbers have any digits this loop will run.
        if(carry!=0)// If some carry is leftover it is appended.
        {
        ans.append(String.valueOf(carry));
        }
        System.out.print("\nThe sum is: "+ Reverse(ans));// Reverse to get the number from left to right.
    }
}