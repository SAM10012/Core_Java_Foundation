import java.util.*;
public class Password_Generation
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String password = "";
		if(input.length() % 2 == 0)
		{
			password =  (input.charAt(input.length() - 1))+String.valueOf(input.length())+"@" + input.charAt(0)+"654"+input.charAt(input.length() - 1);
			System.out.println(password);
			//System.out.println(input.charAt(input.length() - 1)+input.length()+"@" + input.charAt(0)+"654"+input.charAt(input.length() - 1)); this statement is adding the ascii value of k with length of input resulting in 111
		}
		else if(input.length() % 2 != 0)
		{
			password = input.charAt(input.length() - 1) + String.valueOf(input.length()) + "!" + input.charAt(0)+"432"+input.charAt(input.length() - 1);
			System.out.println(password);
			
		}

	}
}