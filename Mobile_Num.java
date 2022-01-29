import java.util.*;
import java.io.IOException;

public class Mobile_Num//Creating a class named Mobile_Num.
{

    public static void Mobile_Num(String input)//Creating a method called Mobile_Num().
    {
        if(input.length() == 10)//Checking length of the provided mobile number.
        {
            if(input.startsWith("9") || input.startsWith("8") || input.startsWith("7") || input.startsWith("6"))//Checking the starting digit of mobile number.
            {
                System.out.println("It is a valid Mobile Number.");//Printing valid.
            }
            else
            {
            System.out.println("It is not a valid Mobile Number.");//Printing invalid.
            }
        }
        else
        {
            System.out.println("It is not a valid Mobile Number.");//Printing invalid.
        }
    }

    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mobile number: ");//Asking for mobile number from user.
        String input = sc.nextLine();//taking mobilr number from user.
        Mobile_Num(input);//Calling the method Mobile_Num() to check validity.
    
        

    }
}