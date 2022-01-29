import java.util.*;
public class Remove_Word
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");//Taking string
        String input = sc.nextLine();
        System.out.println("Please enter the string to be removed: ");//Taking string to be removed
        String rem = sc.nextLine();
        

        if(input.contains(rem))
        {
            input = input.replaceAll(rem,"");//Replacing with blanks
        }
        
        System.out.print("\nThe modified string after removing duplicate characters is : ");
        System.out.print(input);//Printing
       
        

    }
}