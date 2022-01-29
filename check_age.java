import java.util.*;

class check_age
{
    public static void main(String args[]) 
    {
        
        Scanner sc = new Scanner(System.in);
        int user_age = sc.nextInt();
        try
        {
        if(user_age < 18)
        {
            throw new ArithmeticException();
        }
        else
        {
            System.out.println("Valid");
        }
        }
        catch(ArithmeticException e)
        {
            System.out.println("The provided age is not eligible for casting vote!");
        }
        finally
        {
            System.out.println("Checked!");
        }
        
        
    }
}