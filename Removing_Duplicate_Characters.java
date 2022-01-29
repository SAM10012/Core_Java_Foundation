import java.util.*;
import java.io.IOException;

public class Removing_Duplicate_Characters//Creating a class called Removing_Duplicate_Characters
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String input = sc.nextLine();//Taking string from user.
        String temp;
        StringBuilder new_input = new StringBuilder("");

        for(int i=0; i<input.length() ; i++)
        {
            temp = String.valueOf(input.charAt(i));//Taking the string value of each character in temp.
            if(!(temp.equals(" ")))
            {
            for(int j=0; j<input.length() ; j++)
            {
                if(temp.equals(String.valueOf(input.charAt(j))))
                {
                    input = input.replaceAll(temp," ");//Replacing using replaceAll().
                    new_input.append(temp);//Appending.
                    break;
                }
            }
        }
        }
        System.out.print("\nThe modified string after removing duplicate characters is : ");
        System.out.print(new_input);//Printing modified string.
       
        

    }
}