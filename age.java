import java.util.*;
class NotEligibleException extends Exception{
    public NotEligibleException(String str)
    {
        System.out.println(str);
    }
}
class age
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int user_age = sc.nextInt();
        try
        {
            if(user_age>=18)
        {
            System.out.println(" Eligible to cast vote ");
        }
        else
        {
            throw new NotEligibleException(" Not eligible to cast vote ");
        }
        }
        catch(NotEligibleException excep)
        {
            System.out.println("Exception occurred: "+excep);
        }
        finally
        {
            System.out.println("Eligibility Checked!");
        }
    }
}